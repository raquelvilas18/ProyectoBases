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

    public Empleado nuevoEmpleado(String usuario, int nomina, int anoIngreso, boolean administrador){
        Empleado resultado = null;
        ResultSet rsEmpleado;
        PreparedStatement stmEmpleado = null;
        Connection con;
        
        con = super.getConexion();
        
        try{
            stmEmpleado = con.prepareStatement("INSERT into empleados(usuario,nomina,anoingreso,administrador " +
                                                "VALUES (?,?,?,?)");
            stmEmpleado.setString(1, usuario);
            stmEmpleado.setInt(2, nomina);
            stmEmpleado.setInt(3, anoIngreso);
            stmEmpleado.setBoolean(4, administrador);
            
            stmEmpleado.executeQuery();
            
            stmEmpleado = con.prepareStatement("SELECT * \n" +
                                                "FROM usuario \n" +
                                                "WHERE usuario=?");
            stmEmpleado.setString(1, usuario);
        
            rsEmpleado = stmEmpleado.executeQuery();
            //String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo, int nomina, int anoIngreso, boolean administrador
            while(rsEmpleado.next()){
                resultado = new Empleado(rsEmpleado.getString("usuario"),
                                            rsEmpleado.getString("password"),
                                            rsEmpleado.getString("dni"),
                                            rsEmpleado.getString("nombre"),
                                            rsEmpleado.getString("correo"),
                                            rsEmpleado.getString("direccion"),
                                            rsEmpleado.getString("telefono"),
                                            rsEmpleado.getString("sexo"),
                                            rsEmpleado.getInt("nomina"),
                                            rsEmpleado.getInt("anoingreso"),
                                            rsEmpleado.getBoolean("administrador"));
            }
        }catch(SQLException e){
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
    
    public ArrayList<Empleado> obtenerEmpleados(String id) {
        java.util.ArrayList<Empleado> resultado = new java.util.ArrayList<Empleado>();
        java.util.ArrayList<String> usuarios = new java.util.ArrayList<String>();
        Connection con;
        PreparedStatement stmEmpleados = null;
        ResultSet rsEmpleados;
        int año=0;       
        con = super.getConexion();

        try {
            stmEmpleados = con.prepareStatement("SELECT * \n"
                    + "FROM empleados \n"
                    + "WHERE usuario LIKE ?");
            stmEmpleados.setString(1, "%" + id + "%");
            rsEmpleados = stmEmpleados.executeQuery();
        
            while(rsEmpleados.next()){
                DAOUsuarios daoUs = new DAOUsuarios(this.getConexion(), this.getFachadaAplicacion());
                Usuario u;
                u = daoUs.obtenerUsuarios(rsEmpleados.getString("usuario"),"" ).get(0);
                resultado.add(new Empleado(u.getUsuario(), u.getPassword(), u.getDni(), u.getNombre(), u.getCorreo(), u.getDireccion(), u.getTelefono(), u.getSexo(), rsEmpleados.getInt("nomina"), rsEmpleados.getInt("anoIngreso"), daoUs.esAdministrador(u.getUsuario())));
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

    public void actualizarEmpleado(Empleado empleado)
    {
        Connection con;
        PreparedStatement stmEmpleado = null;

        con = this.getConexion();

        try {
            stmEmpleado = con.prepareStatement("UPDATE empleados\n"
                    + " SET usuario=?, nomina=?, anoingreso=?, administrador=? \n"
                    + " WHERE usuario=? ");
            stmEmpleado.setString(1, empleado.getUsuario());
            stmEmpleado.setInt(2, empleado.getNomina());
            stmEmpleado.setInt(3, empleado.getAnoIngreso());
            stmEmpleado.setBoolean(4, empleado.getAdministrador());
            stmEmpleado.setString(5, empleado.getUsuario());
            
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
     
    public void actualizarEmp(String id, Empleado empleado){
        Connection con;
        PreparedStatement stmEmpleado = null;

        con = this.getConexion();

        try {
            stmEmpleado = con.prepareStatement("UPDATE empleados\n"
                    + " SET usuario=?, nomina=?, anoingreso=?, administrador=? \n"
                    + " WHERE usuario=? ");
            stmEmpleado.setString(1, empleado.getUsuario());
            stmEmpleado.setInt(2, empleado.getNomina());
            stmEmpleado.setInt(3, empleado.getAnoIngreso());
            stmEmpleado.setBoolean(4, empleado.getAdministrador());
            stmEmpleado.setString(5, id);
            
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
    
    public void actualizarDireccion(String matricula){
        PreparedStatement stmVehiculo=null;
        Connection con;
        
        con = super.getConexion();
        
        try{
            stmVehiculo = con.prepareStatement("UPDATE direccion " +
                                                "FROM vehiculos " +
                                                "WHERE matricula = ?");
            stmVehiculo.setString(1,matricula);
            
            stmVehiculo.executeQuery();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        }finally {
            try {
                stmVehiculo.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public ArrayList<Integer> datosEmpleado(String id){
        java.util.ArrayList<Integer> resultado = new java.util.ArrayList<Integer>();
        Connection con;
        PreparedStatement stmEmpleados = null;
        ResultSet rsEmpleados;
        int año=0;       
        con = super.getConexion();

        try {
            stmEmpleados = con.prepareStatement("SELECT * \n"
                    + "FROM empleados \n"
                    + "WHERE usuario=?");
            stmEmpleados.setString(1, id);
            rsEmpleados = stmEmpleados.executeQuery();
        
            while(rsEmpleados.next()){
                resultado.add(rsEmpleados.getInt("anoIngreso"));
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
}
