/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.Paquete;
import aplicacion.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alumnogreibd
 */
public class DAOPaquetes extends AbstractDAO {

    public DAOPaquetes(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public void nuevoPaquete(Paquete p) {
        Connection con;
        PreparedStatement stm = null;

        con = super.getConexion();

        try {
            stm = con.prepareStatement("Insert into paquetes(cliente, peso, pedido, ancho, alto, largo) "
                    + "values (?,?,?,?, ?, ?)");
            stm.setString(1, p.getCliente());
            stm.setFloat(2, p.getPeso());
            stm.setInt(3, p.getPedido());
            stm.setFloat(4, p.getAncho());
            stm.setFloat(5, p.getAlto());
            stm.setFloat(6, p.getLargo());
            stm.executeUpdate();

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
    }
}