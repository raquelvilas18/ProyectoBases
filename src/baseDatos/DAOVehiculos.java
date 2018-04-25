/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.*;
import gui.*;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author alumnogreibd
 */
public class DAOVehiculos extends AbstractDAO {
    
    public DAOVehiculos (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
    
    public ArrayList<Vehiculo> obtenerVehiculos()
    {
        ArrayList<Vehiculo> resultado =new ArrayList<Vehiculo>();
        Connection con;
        PreparedStatement stmVehiculos=null;
        ResultSet rsVehiculos=null;
        
        con = super.getConexion();
        
        try{
            stmVehiculos=con.prepareStatement("SELECT * "+
                                            "FROM vehiculos;");
            
            rsVehiculos = stmVehiculos.executeQuery();

            while(rsVehiculos.next()){
                resultado.add(new Vehiculo(rsVehiculos.getString("matricula"),
                                                  rsVehiculos.getString("proximaITV"),
                                                  rsVehiculos.getString("fechaCompra"),
                                                  rsVehiculos.getInt("capacidad"),
                                                  rsVehiculos.getString("conductor"),
                                                  rsVehiculos.getString("direccion")));
            }
        }catch (SQLException e){
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
                try {stmVehiculos.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
        
        return resultado;
    }
    
    public void actualizarVehi(String matricula, Vehiculo vehi)
    {

        Connection con;
        PreparedStatement stmVehiculo=null;
        
        con = super.getConexion();
        
        try{
            stmVehiculo = con.prepareStatement("UPDATE vehiculos\n"
                    + " SET matricula=?, proximaitv=?, fechacompra=?, capacidad=?, conductor=?, direccion=?" //Igual hay que cambiar la fecha
                    + " WHERE matricula=? ");
            stmVehiculo.setString(1, vehi.getMatricula());
            stmVehiculo.setString(2, vehi.getItv());
            stmVehiculo.setString(3, vehi.getFechaCompra());
            stmVehiculo.setInt(4, vehi.getCapacidad());
            stmVehiculo.setString(5, vehi.getTrans());
            stmVehiculo.setString(6, vehi.getDireccion());
            stmVehiculo.setString(7, vehi.getMatricula());
            stmVehiculo.executeUpdate();
        }catch (SQLException e){
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
                try {stmVehiculo.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
        
    }
    
    public boolean consultarMatricula(String matricula){
        
        Connection con;
        PreparedStatement stmVehiculo=null;
        ResultSet rsVehiculo=null;
        
        con = super.getConexion();
        
        try{
            stmVehiculo=con.prepareStatement("SELECT * "+
                                            "FROM vehiculos "
                                            + "WHERE matricula=?");
            
            stmVehiculo.setString(1,matricula);
            rsVehiculo = stmVehiculo.executeQuery();
            if(rsVehiculo.next()){
                return false;
            }
        }catch (SQLException e){
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
                try {stmVehiculo.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
        
        return true;
    }
    
    public void registrarVehi(Vehiculo vehi){
        Connection con;
        PreparedStatement stmVehiculo=null;
        
        con = super.getConexion();
        
        try{
            stmVehiculo = con.prepareStatement("INSERT INTO vehiculos(\n"
                        + "matricula, proximaitv, fechacompra, capacidad, conductor, direccion)\n"
                        + "VALUES (?,?,?,?,?,?);");
            stmVehiculo.setString(1, vehi.getMatricula());
            stmVehiculo.setString(2, vehi.getItv());
            stmVehiculo.setString(3, vehi.getFechaCompra());
            stmVehiculo.setInt(4, vehi.getCapacidad());
            stmVehiculo.setString(5, vehi.getTrans());
            stmVehiculo.setString(6, vehi.getDireccion());
            stmVehiculo.executeUpdate();
        }catch (SQLException e){
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
                try {stmVehiculo.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
    }
    
}
