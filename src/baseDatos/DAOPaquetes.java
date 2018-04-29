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
import java.util.ArrayList;
import java.util.Calendar;

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
            stm = con.prepareStatement("Insert into paquetes(cliente, peso, pedido, ancho, alto, largo, coste) "
                    + "values (?,?,?,?, ?, ?, ?)");
            stm.setString(1, p.getCliente());
            stm.setFloat(2, p.getPeso());
            stm.setInt(3, p.getPedido());
            stm.setFloat(4, p.getAncho());
            stm.setFloat(5, p.getAlto());
            stm.setFloat(6, p.getLargo());
            stm.setFloat(7, p.getCoste());
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

    public ArrayList<Paquete> paquetesTransportista(String id) {
        Connection con;
        PreparedStatement stm = null;
        ResultSet rs;
        ArrayList<Paquete> paquetes = new ArrayList<>();

        con = super.getConexion();

        try {
            stm = con.prepareStatement("SELECT codigo, cliente, peso, pedido, ancho, alto, largo, coste, transportista, fecha_entrega, direccion\n"
                    + "FROM paquetes as p, vehiculos as v\n"
                    + "WHERE p.transportista = v.conductor\n"
                    + "AND transportista = ? "
                    + "AND fecha_entrega ISNULL ");
            stm.setString(1, id);
            rs = stm.executeQuery();
            while (rs.next()) {
                paquetes.add(new Paquete(rs.getInt("codigo"), rs.getInt("pedido"), rs.getFloat("peso"), rs.getFloat("alto"), rs.getFloat("ancho"), rs.getFloat("largo"), rs.getString("fecha_entrega"), rs.getString("transportista"), rs.getString("cliente"), rs.getString("direccion")));
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
        return paquetes;
    }

    public void paqueteEntregado(String pedido, String codigo) {
        Connection con;
        PreparedStatement stm = null;
        ArrayList<Paquete> paquetes = new ArrayList<>();

        con = super.getConexion();

        try {
            stm = con.prepareStatement("UPDATE paquetes "
                    + "SET fecha_entrega = TO_DATE(?, 'DD-MM-YYYY'), "
                    + " transportista = NULL "
                    + "WHERE  pedido = ? "
                    + "AND codigo = ? ");
            Calendar cal = Calendar.getInstance();
            stm.setString(1, Integer.toString(cal.get(Calendar.DATE)) + "-" + Integer.toString(cal.get(Calendar.MONTH) + 1) + "-" + Integer.toString(cal.get(Calendar.YEAR)));
            stm.setInt(2, Integer.parseInt(pedido));
            stm.setInt(3, Integer.parseInt(codigo));

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

    public java.util.List<Paquete> obtenerPaquetes(Integer codigo) {
        java.util.List<Paquete> resultado = new java.util.ArrayList<Paquete>();
        Connection con;
        PreparedStatement stmPaquetes = null;
        ResultSet rsPaquetes = null;

        con = super.getConexion();

        try {
            stmPaquetes = con.prepareStatement("SELECT cliente, pedido, codigo, peso, ancho, alto, largo, coste, transportista, fecha_entrega, direccion as posicion\n"
                    + "FROM paquetes p, vehiculos v\n"
                    + "WHERE p.transportista = v.conductor "
                    + "AND pedido = ? "
                    + "UNION\n"
                    + "SELECT cliente, pedido, codigo, peso, ancho, alto,  largo, coste, transportista, fecha_entrega, 'entregado' as posicion\n"
                    + "FROM paquetes \n"
                    + "WHERE fecha_entrega IS NOT NULL \n"
                    + "AND transportista ISNULL \n"
                    + "AND pedido = ? "
                    + "UNION\n"
                    + "SELECT cliente, pedido, codigo, peso, ancho, alto,  largo, coste, transportista, fecha_entrega, 'En tramitacion' as posicion\n"
                    + "FROM paquetes \n"
                    + "WHERE fecha_entrega ISNULL \n"
                    + "AND transportista ISNULL "
                    + "AND pedido = ?");
            stmPaquetes.setInt(1, codigo);
            stmPaquetes.setInt(2, codigo);
            stmPaquetes.setInt(3, codigo);

            rsPaquetes = stmPaquetes.executeQuery();

            while (rsPaquetes.next()) {

                resultado.add(new Paquete(rsPaquetes.getInt("codigo"),
                        rsPaquetes.getInt("pedido"),
                        rsPaquetes.getFloat("peso"),
                        rsPaquetes.getFloat("alto"),
                        rsPaquetes.getFloat("ancho"),
                        rsPaquetes.getFloat("largo"),
                        rsPaquetes.getString("fecha_entrega"),
                        rsPaquetes.getString("transportista"),
                        rsPaquetes.getString("cliente"),
                        rsPaquetes.getString("posicion")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPaquetes.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

        return resultado;
    }
}
