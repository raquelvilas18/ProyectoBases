package baseDatos;

import aplicacion.*;
import gui.*;
import static java.lang.Thread.sleep;
import java.sql.*;
import static java.sql.Connection.TRANSACTION_NONE;
import static java.sql.Connection.TRANSACTION_SERIALIZABLE;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author basesdatos
 */
public class DAOUsuarios extends AbstractDAO {

    public DAOUsuarios(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public void conexion(String idUsuario, boolean accion) {
        Usuario resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();
        if (idUsuario != null) {
            try {
                stmUsuario = con.prepareStatement("UPDATE usuarios\n"
                        + "SET conectado=?\n"
                        + "WHERE usuario=?");
                stmUsuario.setBoolean(1, accion);
                stmUsuario.setString(2, idUsuario);
                stmUsuario.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            } finally {
                try {
                    stmUsuario.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
            }
        }
    }

    public Usuario validarUsuario1(String idUsuario, String clave) {
        Usuario resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null, stmUsuario2 = null;
        ResultSet rsUsuario;

        con = this.getConexion();
        try {
            con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.setTransactionIsolation(TRANSACTION_SERIALIZABLE);
        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (idUsuario != null && clave != null) {
            try {
                stmUsuario = con.prepareStatement("SELECT *\n"
                        + "FROM usuarios\n"
                        + "WHERE usuario=? AND password=(SELECT md5(?))"
                        + "AND conectado=false");
                stmUsuario.setString(1, idUsuario);
                stmUsuario.setString(2, clave);

                stmUsuario2 = con.prepareStatement("UPDATE usuarios\n"
                        + "SET conectado=?\n"
                        + "WHERE usuario=?");
                stmUsuario2.setBoolean(1, true);
                stmUsuario2.setString(2, idUsuario);
                rsUsuario = stmUsuario.executeQuery();
                stmUsuario2.executeUpdate();

                try {
                    con.setAutoCommit(true);
                } catch (SQLException ex) {
                    
                    Logger.getLogger(DAOUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (rsUsuario.next()) {
                    resultado = new Usuario(rsUsuario.getString("usuario"), rsUsuario.getString("password"), rsUsuario.getString("dni"),
                            rsUsuario.getString("nombre"), rsUsuario.getString("correo"),
                            rsUsuario.getString("direccion"), rsUsuario.getString("telefono"), rsUsuario.getString("sexo"), rsUsuario.getString("tipo"));

                }

            } catch (SQLException e) {
                try {
                    System.out.println("Rollback");
                    con.rollback();
                } catch (SQLException ex) {
                    Logger.getLogger(DAOUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }

                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            } finally {
                try {
                    stmUsuario.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
            }
        }

        return resultado;
    }

    public Usuario validarUsuario(String idUsuario, String clave) {
        Usuario resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        if (idUsuario != null && clave != null) {
            try {
                stmUsuario = con.prepareStatement("SELECT *\n"
                        + "FROM usuarios\n"
                        + "WHERE usuario=? AND password=(SELECT md5(?))");
                stmUsuario.setString(1, idUsuario);
                stmUsuario.setString(2, clave);
                rsUsuario = stmUsuario.executeQuery();
                if (rsUsuario.next()) {
                    resultado = new Usuario(rsUsuario.getString("usuario"), rsUsuario.getString("password"), rsUsuario.getString("dni"),
                            rsUsuario.getString("nombre"), rsUsuario.getString("correo"),
                            rsUsuario.getString("direccion"), rsUsuario.getString("telefono"), rsUsuario.getString("sexo"), rsUsuario.getString("tipo"));

                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            } finally {
                try {
                    stmUsuario.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
            }
        }
        return resultado;
    }

    public Usuario registrarUsuario(String id, String clave, String dni, String nombre, String email, String direccion, String telefono, String sexo, String tipo) {
        Usuario resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        PreparedStatement stmCliente = null;
        PreparedStatement stmOficinista = null;
        PreparedStatement stmTransportista = null;
        PreparedStatement stmEmpleado = null;
        if (validarUsuario(id, clave) == null) {

            con = this.getConexion();

            try {
                stmUsuario = con.prepareStatement("INSERT INTO usuarios(\n"
                        + "usuario, password, dni, nombre, correo, direccion, telefono,sexo,tipo)\n"
                        + "VALUES (?,(SELECT md5(?)),?,?,?,?,?,?,?);");
                stmUsuario.setString(1, id);
                stmUsuario.setString(2, clave);
                stmUsuario.setString(3, dni);
                stmUsuario.setString(4, nombre);
                stmUsuario.setString(5, email);
                stmUsuario.setString(6, direccion);
                stmUsuario.setString(7, telefono);
                stmUsuario.setString(8, sexo);
                stmUsuario.setString(9, tipo);
                stmUsuario.executeUpdate();
                
                switch(tipo){
                    case "cliente":
                        stmCliente = con.prepareStatement("INSERT INTO clientes( usuario ) VALUES (?);");
                        stmCliente.setString(1, id);
                        stmCliente.executeUpdate();
                        break;
                    case "transportista":
                        stmEmpleado = con.prepareStatement("INSERT INTO empleados( usuario, nomina, anoingreso ) VALUES (?,?,?);");
                        stmEmpleado.setString(1, id);
                        stmEmpleado.setInt(2, 1500);
                        stmEmpleado.setDate(3,null);
                        stmEmpleado.executeUpdate();
                        
                        stmTransportista= con.prepareStatement("INSERT INTO transportistas (empleado) VALUES (?);");
                        stmTransportista.setString(1, id);
                        stmTransportista.executeUpdate();
                        break;
                    case "oficinista":
                        stmEmpleado = con.prepareStatement("INSERT INTO empleados( usuario, nomina, anoingreso ) VALUES (?,?,?);");
                        stmEmpleado.setString(1, id);
                        stmEmpleado.setInt(2, 1200);
                        stmEmpleado.setDate(3,null);
                        stmEmpleado.executeUpdate();
                        
                        stmOficinista = con.prepareStatement("INSERT INTO oficinistas (empleado) VALUES (?);");
                        stmOficinista.setString(1, id);
                        stmOficinista.executeQuery();
                        
                        break;                                              
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            } finally {
                try {
                    stmUsuario.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
            }
            resultado = new Usuario(id, clave, dni, nombre, email, direccion, telefono, sexo, tipo);
            return resultado;
        } else {
            return null;
        }
    }

    public boolean consultarId(String idUsuario) {
        boolean resultado = true;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario = con.prepareStatement("SELECT *\n"
                    + "FROM usuarios\n"
                    + "WHERE usuario=? ");
            stmUsuario.setString(1, idUsuario);
            rsUsuario = stmUsuario.executeQuery();
            if (rsUsuario.next()) {
                resultado = false;

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void actualizar(Usuario usuario) {
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario = con.prepareStatement("UPDATE usuarios\n"
                    + " SET usuario=?, dni=?, nombre=?, correo=?, direccion=?, \n"
                    + "       telefono=?, sexo=?\n"
                    + " WHERE usuario=? ");
            stmUsuario.setString(1, usuario.getUsuario());
            stmUsuario.setString(2, usuario.getDni());
            stmUsuario.setString(3, usuario.getNombre());
            stmUsuario.setString(4, usuario.getCorreo());
            stmUsuario.setString(5, usuario.getDireccion());
            stmUsuario.setString(6, usuario.getTelefono());
            stmUsuario.setString(7, usuario.getSexo());
            stmUsuario.setString(8, usuario.getUsuario());
            stmUsuario.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public String getTipo(String id) {
        String resultado = "";
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario = con.prepareStatement("SELECT tipo\n"
                    + "FROM usuarios\n"
                    + "WHERE usuario=? ");
            stmUsuario.setString(1, id);
            rsUsuario = stmUsuario.executeQuery();
            if (rsUsuario.next()) {
                resultado = rsUsuario.getString("tipo");

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public ArrayList<Usuario> obtenerUsuarios(String id, String nombre) {
        java.util.ArrayList<Usuario> resultado = new java.util.ArrayList<Usuario>();
        Connection con;
        PreparedStatement stm = null;
        ResultSet rs;

        con = super.getConexion();

        try {
            stm = con.prepareStatement("SELECT * "
                    + "FROM usuarios "
                    + "WHERE usuario LIKE ? "
                    + "AND nombre LIKE ? ");
            stm.setString(1, "%" + id + "%");
            stm.setString(2, "%" + nombre + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                resultado.add(new Usuario(rs.getString("usuario"), rs.getString("password"), rs.getString("dni"), rs.getString("nombre"), rs.getString("correo"), rs.getString("direccion"), rs.getString("telefono"), rs.getString("sexo"), rs.getString("tipo")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stm.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void actualizarUsr(String id, Usuario usuario) {
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario = con.prepareStatement("UPDATE usuarios\n"
                    + " SET usuario=?, dni=?, nombre=?, correo=?, direccion=?, \n"
                    + "       telefono=?, sexo=?\n"
                    + " WHERE usuario=? ");
            stmUsuario.setString(1, usuario.getUsuario());
            stmUsuario.setString(2, usuario.getDni());
            stmUsuario.setString(3, usuario.getNombre());
            stmUsuario.setString(4, usuario.getCorreo());
            stmUsuario.setString(5, usuario.getDireccion());
            stmUsuario.setString(6, usuario.getTelefono());
            stmUsuario.setString(7, usuario.getSexo());
            stmUsuario.setString(8, id);

            stmUsuario.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public void eliminarUsuario(String id) {
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario = con.prepareStatement("DELETE FROM usuarios WHERE usuario = ?");
            stmUsuario.setString(1, id);
            stmUsuario.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmUsuario.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

}
