/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.*;
import gui.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author alumnogreibd
 */
public class DAOLocales extends AbstractDAO {
    
    public DAOLocales (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
    
    public ArrayList<Local> obtenerLocales(String codigo)
    {
        ArrayList<Local> resultado =new ArrayList<Local>();
        Connection con;
        PreparedStatement stmLocales=null;
        ResultSet rsLocales=null;
        
        con = super.getConexion();
        
        
        
        try{
           
            stmLocales = con.prepareStatement("SELECT * "
                    + "FROM locales "
                    + "WHERE codigo LIKE ?");
            stmLocales.setString(1, "%" + codigo + "%");
            rsLocales = stmLocales.executeQuery();
          

            while(rsLocales.next()){
                resultado.add(new Local(rsLocales.getString("codigo"),
                                                  rsLocales.getString("direccion"),
                                                  rsLocales.getString("encargado"),
                                                  rsLocales.getInt("capacidad")));
            }
        }catch (SQLException e){
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
                try {stmLocales.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
        
        return resultado;
    }
    
    public boolean consultarCodigo(String codigo){
        
        boolean resultado = true;
        Connection con;
        PreparedStatement stmLocal = null;
        ResultSet rsLocal;

        con = this.getConexion();

        try {
            stmLocal = con.prepareStatement("SELECT *\n"
                    + "FROM locales\n"
                    + "WHERE codigo=? ");
            stmLocal.setString(1, codigo);
            rsLocal = stmLocal.executeQuery();
            if (rsLocal.next()) {
                resultado = false;

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmLocal.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
    
    public void actualizarLocal(String codigo, Local local){
        Connection con;
        PreparedStatement stmLocal = null;

        con = this.getConexion();

        try {
            stmLocal = con.prepareStatement("UPDATE locales\n"
                    + " SET codigo=?, direccion=?, encargado=?, capacidad=?"
                    + " WHERE codigo=? ");
            stmLocal.setString(1, local.getCodigo());
            stmLocal.setString(2, local.getDireccion());
            stmLocal.setString(3, local.getEncargado());
            stmLocal.setInt(4, local.getCapacidad());
            stmLocal.setString(5, codigo);
            stmLocal.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmLocal.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public void registrarLocal(Local local){
        Connection con;
        PreparedStatement stmLocal = null;
        PreparedStatement stmOficinista=null;


            con = this.getConexion();

            try {
                stmLocal = con.prepareStatement("INSERT INTO locales("
                        + "codigo, direccion, encargado, capacidad)\n"
                        + "VALUES (?,?,?,?);");
                stmLocal.setString(1, local.getCodigo());
                stmLocal.setString(2, local.getDireccion());
                stmLocal.setString(3, local.getEncargado());
                stmLocal.setInt(4, local.getCapacidad());

                stmLocal.executeUpdate();
                
                stmOficinista = con.prepareStatement("UPDATE oficinistas SET local=? WHERE empleado=?;");
                stmOficinista.setString(1, local.getCodigo());
                stmOficinista.setString(2, local.getEncargado());
                
                stmOficinista.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            } finally {
                try {
                    stmLocal.close();
                    stmOficinista.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
            }
  
    }
    
    public void eliminarLocal(Local local){
        Connection con;
        PreparedStatement stmLocal = null;
        PreparedStatement stmOficinista = null;

        con = this.getConexion();

        try {
            
            stmOficinista= con.prepareStatement("UPDATE oficinistas SET local=? WHERE empleado=?;");
            stmOficinista.setString(1, null);
            stmOficinista.setString(2,local.getEncargado());
            stmOficinista.executeUpdate();
            
            stmLocal = con.prepareStatement("DELETE FROM locales WHERE codigo = ?");
            stmLocal.setString(1, local.getCodigo());
            stmLocal.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmOficinista.close();
                stmLocal.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public ArrayList<String> oficinistasComboBox(String local){
        Connection con;
        PreparedStatement stmOficinistas = null;
        ResultSet rsOficinistas = null;
        
        ArrayList<String> resultado = new ArrayList<String>();
        
        
        con = this.getConexion();
        try {
            
            stmOficinistas= con.prepareStatement("SELECT * FROM oficinistas WHERE local=?;");
            stmOficinistas.setString(1, local);

            rsOficinistas = stmOficinistas.executeQuery();
            
            while(rsOficinistas.next()){
                resultado.add(rsOficinistas.getString("empleado"));
            }
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmOficinistas.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }
}
