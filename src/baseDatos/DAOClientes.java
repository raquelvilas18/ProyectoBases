/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alumnogreibd
 */
public class DAOClientes extends AbstractDAO {
    
    
    public DAOClientes(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
    
        public void registrarClientes(String id) {
        Connection con;

        PreparedStatement stmCliente = null;


            con = this.getConexion();

            try {
                stmCliente = con.prepareStatement("INSERT INTO clientes( usuario ) VALUES (?);");
                stmCliente.setString(1, id);
                stmCliente.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            } finally {
                try {
                    stmCliente.close();
                } catch (SQLException e) {
                    System.out.println("Imposible cerrar cursores");
                }
            }
  
        
    }
    
    
    
    
}
