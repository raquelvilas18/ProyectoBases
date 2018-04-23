package baseDatos;

import aplicacion.*;
import gui.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author basesdatos
 */
public class DAOUsuarios extends AbstractDAO {

    public DAOUsuarios(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
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
                            rsUsuario.getString("direccion"), rsUsuario.getString("telefono"), rsUsuario.getString("sexo"));

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

    public Usuario registrarUsuario(String id, String clave, String dni, String nombre, String email, String direccion, String telefono, String sexo) {
        Usuario resultado = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        if (validarUsuario(id, clave) == null) {

            con = this.getConexion();

            try {
                stmUsuario = con.prepareStatement("INSERT INTO usuarios(\n"
                        + "usuario, password, dni, nombre, correo, direccion, telefono,sexo)\n"
                        + "VALUES (?,(SELECT md5(?)),?,?,?,?,?,?);");
                stmUsuario.setString(1, id);
                stmUsuario.setString(2, clave);
                stmUsuario.setString(3, dni);
                stmUsuario.setString(4, nombre);
                stmUsuario.setString(5, email);
                stmUsuario.setString(6, direccion);
                stmUsuario.setString(7, telefono);
                stmUsuario.setString(8, sexo);
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
            resultado = new Usuario(id, clave, dni, nombre, email, direccion, telefono, sexo);
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
                    + "WHERE usuario=? " );
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
                resultado.add(new Usuario(rs.getString("usuario"), rs.getString("password"), rs.getString("dni"), rs.getString("nombre"), rs.getString("correo"), rs.getString("direccion"), rs.getString("telefono"), rs.getString("sexo")));
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
