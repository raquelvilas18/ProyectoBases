/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.Empleado;
import aplicacion.Pedido;
import aplicacion.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alumnogreibd
 */
public class DAOEmpleados extends AbstractDAO {

    public DAOEmpleados(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public Empleado nuevoEmpleado(String usuario, int nomina) {
        Empleado resultado = null;
        ResultSet rsEmpleado;
        PreparedStatement stmEmpleado = null;
        Connection con;

        con = super.getConexion();

        try {
            stmEmpleado = con.prepareStatement("INSERT into empleados(usuario,nomina,anoingreso) "
                    + "VALUES (?,?,current_date)");
            stmEmpleado.setString(1, usuario);
            stmEmpleado.setInt(2, nomina);

            stmEmpleado.execute();

            stmEmpleado = con.prepareStatement("SELECT * \n"
                    + "FROM usuarios natural join empleados\n"
                    + "WHERE usuario=?");
            stmEmpleado.setString(1, usuario);

            rsEmpleado = stmEmpleado.executeQuery();
            //String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo, int nomina, int anoIngreso, boolean administrador
            while (rsEmpleado.next()) {
                resultado = new Empleado(rsEmpleado.getString("usuario"),
                        rsEmpleado.getString("password"),
                        rsEmpleado.getString("dni"),
                        rsEmpleado.getString("nombre"),
                        rsEmpleado.getString("correo"),
                        rsEmpleado.getString("direccion"),
                        rsEmpleado.getString("telefono"),
                        rsEmpleado.getString("sexo"),
                        rsEmpleado.getString("tipo"),
                        rsEmpleado.getInt("nomina"),
                        rsEmpleado.getString("anoingreso"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmEmpleado.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void nuevoTransportista(String usuario) {
        PreparedStatement stmTransportista = null;
        Connection con;

        con = super.getConexion();

        try {
            stmTransportista = con.prepareStatement("INSERT into transportistas(empleado)"
                    + "VALUES (?)");
            stmTransportista.setString(1, usuario);
            stmTransportista.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmTransportista.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public void nuevoOficinista(String usuario, String local) {

        PreparedStatement stmOficinista = null;
        Connection con;

        con = super.getConexion();

        try {
            stmOficinista = con.prepareStatement("insert into oficinistas(empleado,local) values(?,?)");
            stmOficinista.setString(1, usuario);
            stmOficinista.setString(2, local);
            stmOficinista.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmOficinista.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public ArrayList<Empleado> obtenerEmpleados(String id) {
        java.util.ArrayList<Empleado> resultado = new java.util.ArrayList<Empleado>();
        java.util.ArrayList<String> usuarios = new java.util.ArrayList<String>();
        Connection con;
        PreparedStatement stmEmpleados = null;
        ResultSet rsEmpleados;
        int año = 0;
        con = super.getConexion();

        try {
            stmEmpleados = con.prepareStatement("SELECT * \n"
                    + "FROM empleados \n"
                    + "WHERE usuario LIKE ?");
            stmEmpleados.setString(1, "%" + id + "%");
            rsEmpleados = stmEmpleados.executeQuery();

            while (rsEmpleados.next()) {
                DAOUsuarios daoUs = new DAOUsuarios(this.getConexion(), this.getFachadaAplicacion());
                Usuario u;
                u = daoUs.obtenerUsuarios(rsEmpleados.getString("usuario"), "").get(0);
                resultado.add(new Empleado(u.getUsuario(), u.getPassword(), u.getDni(), u.getNombre(), u.getCorreo(), u.getDireccion(), u.getTelefono(), u.getSexo(), u.getTipo(), rsEmpleados.getInt("nomina"), rsEmpleados.getString("anoIngreso")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmEmpleados.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public String trabajaEn(String id) {
        String resultado = null;
        Connection con;
        PreparedStatement stmEmpleados = null;
        ResultSet rsEmpleados;
        con = super.getConexion();

        try {
            stmEmpleados = con.prepareStatement("SELECT local \n"
                    + "FROM oficinistas \n"
                    + "WHERE empleado= ?");
            stmEmpleados.setString(1, id);
            rsEmpleados = stmEmpleados.executeQuery();

            if (rsEmpleados.next()) {
                resultado = rsEmpleados.getString("local");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmEmpleados.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public void actualizarEmpleado(Empleado empleado) {
        Connection con;
        PreparedStatement stmEmpleado = null;

        con = this.getConexion();

        try {
            stmEmpleado = con.prepareStatement("UPDATE empleados\n"
                    + " SET usuario=?, nomina=?, anoingreso=? \n"
                    + " WHERE usuario=? ");
            stmEmpleado.setString(1, empleado.getUsuario());
            stmEmpleado.setInt(2, empleado.getNomina());
            stmEmpleado.setString(3, empleado.getAnoIngreso());
            stmEmpleado.setString(4, empleado.getUsuario());

            stmEmpleado.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmEmpleado.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public void actualizarEmp(String id, Empleado empleado) {
        Connection con;
        PreparedStatement stmEmpleado = null;

        con = this.getConexion();

        try {
            stmEmpleado = con.prepareStatement("UPDATE empleados\n"
                    + " SET usuario=?, nomina=?\n"
                    + " WHERE usuario=? ");
            stmEmpleado.setString(1, empleado.getUsuario());
            stmEmpleado.setInt(2, empleado.getNomina());
            stmEmpleado.setString(3, id);

            stmEmpleado.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmEmpleado.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public void actualizarDireccion(String matricula) {
        PreparedStatement stmVehiculo = null;
        Connection con;

        con = super.getConexion();

        try {
            stmVehiculo = con.prepareStatement("UPDATE direccion "
                    + "FROM vehiculos "
                    + "WHERE matricula = ?");
            stmVehiculo.setString(1, matricula);

            stmVehiculo.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmVehiculo.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public ArrayList<Integer> datosEmpleado(String id) {
        java.util.ArrayList<Integer> resultado = new java.util.ArrayList<Integer>();
        Connection con;
        PreparedStatement stmEmpleados = null;
        ResultSet rsEmpleados;
        int año = 0;
        con = super.getConexion();

        try {
            stmEmpleados = con.prepareStatement("SELECT * \n"
                    + "FROM empleados \n"
                    + "WHERE usuario=?");
            stmEmpleados.setString(1, id);
            rsEmpleados = stmEmpleados.executeQuery();

            while (rsEmpleados.next()) {
                resultado.add(rsEmpleados.getInt("nomina"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmEmpleados.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    public void eliminarEmpleado(String id){
        Connection con;
        PreparedStatement stmUsuario = null, stmUsuario1 = null, stmUsuario2 = null, stmUsuario3 = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario1 = con.prepareStatement("UPDATE locales SET encargado=null WHERE encargado=?");
            stmUsuario1.setString(1, id);
            stmUsuario1.executeUpdate();
            stmUsuario2 = con.prepareStatement("UPDATE vehiculos SET conductor=null WHERE conductor=?");
            stmUsuario2.setString(1, id);
            stmUsuario2.executeUpdate();
            stmUsuario3 = con.prepareStatement("UPDATE pedidos SET tramitador=null WHERE tramitador=?");
            stmUsuario3.setString(1, id);
            stmUsuario3.executeUpdate();
            stmUsuario = con.prepareStatement("DELETE FROM empleados WHERE usuario=?");
            stmUsuario.setString(1, id);
            stmUsuario.executeUpdate();
            this.getFachadaAplicacion().eliminarUsuario(id);
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
