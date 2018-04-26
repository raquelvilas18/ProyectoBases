package baseDatos;

import aplicacion.*;
import gui.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author basesdatos
 */
public class DAOPedidos extends AbstractDAO {

    public DAOPedidos(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public Pedido nuevoPedido(Pedido pd) {
        Connection con;
        PreparedStatement stmPedidos = null;
        PreparedStatement stm = null;

        ResultSet rs;
        Pedido pedido = null;

        con = super.getConexion();

        try {
            stmPedidos = con.prepareStatement("Insert into pedidos(cliente, express, direccion, destinatario) "
                    + "values (?,?,?,?)");
            stmPedidos.setString(1, pd.getCliente());
            stmPedidos.setBoolean(2, pd.isExpress());
            stmPedidos.setString(3, pd.getDireccion());
            stmPedidos.setString(4, pd.getDestinatario());
            stmPedidos.executeUpdate();

            stm = con.prepareStatement("SELECT * from pedidos "
                    + "WHERE cliente= ? "
                    + "AND express = ? "
                    + "AND direccion = ? "
                    + "AND destinatario = ? ");
            stm.setString(1, pd.getCliente());
            stm.setBoolean(2, pd.isExpress());
            stm.setString(3, pd.getDireccion());
            stm.setString(4, pd.getDestinatario());

            rs = stm.executeQuery();
            if (rs.next()) {
                // public Pedido(String fecha,String cliente,Integer codigo, boolean express, String direccion, String destinatario,String tramitador)   {

                pedido = new Pedido(null, rs.getString("cliente"), rs.getInt("codigo"), rs.getBoolean("express"), rs.getString("direccion"), rs.getString("destinatario"), rs.getString("tramitador"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPedidos.close();
                stm.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }

        }
        return pedido;

    }

    public Pedido getPedido(Pedido pd) {
        Connection con;
        PreparedStatement stmPedidos = null;
        PreparedStatement stm = null;

        ResultSet rs;
        Pedido pedido = null;

        con = super.getConexion();

        try {

            stm = con.prepareStatement("SELECT * from pedidos "
                    + "WHERE cliente= ? "
                    + "AND express = ? "
                    + "AND direccion = ? "
                    + "AND destinatario = ? ");
            stm.setString(1, pd.getCliente());
            stm.setBoolean(2, pd.isExpress());
            stm.setString(3, pd.getDireccion());
            stm.setString(4, pd.getDestinatario());

            rs = stm.executeQuery();
            if (rs.next()) {
                pedido = new Pedido(null, rs.getString("cliente"), rs.getInt("codigo"), rs.getBoolean("express"), rs.getString("direccion"), rs.getString("destinatario"), rs.getString("tramitador"));
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
        return pedido;

    }


public void tramitarPedido(Integer codigo, String transportista) {
        Connection con;
        PreparedStatement stm = null, stm2 = null;
        ResultSet rs;

        con = super.getConexion();

        try {
            stm = con.prepareStatement("SELECT * "
                    + "FROM vehiculos "
                    + "WHERE transportista = ?");
            stm.setString(1, transportista);
            
            rs = stm.executeQuery();
            if(rs.next()){
                String matricula = rs.getString("matricula");
                stm2 = con.prepareStatement("UPDATE paquetes "
                        + "SET transportista = ? , vehiculo = ? "
                        + "WHERE pedido =  ?");
                stm2.setString(1, transportista);
                stm2.setString(2, matricula);
                stm2.setInt(3, codigo);
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
    }

    public java.util.List<Pedido> obtenerHistorialPedidos(String usuario) {
        java.util.List<Pedido> resultado = new java.util.ArrayList<Pedido>();
        Connection con;
        PreparedStatement stmPedidos = null;
        ResultSet rsPedidos;

        con = super.getConexion();

        try {
            stmPedidos = con.prepareStatement("SELECT *\n"
                    + "FROM pedidos\n"
                    + "WHERE cliente=? AND fecha<(SELECT current_date)");
            stmPedidos.setString(1, usuario);
            rsPedidos = stmPedidos.executeQuery();
            while (rsPedidos.next()) {
                resultado.add(new Pedido(rsPedidos.getString("fecha"),
                        rsPedidos.getString("cliente"),
                        rsPedidos.getInt("codigo"),
                        rsPedidos.getBoolean("express"),
                        rsPedidos.getString("direccion"),
                        rsPedidos.getString("destinatario"),
                        rsPedidos.getString("tramitador")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPedidos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public java.util.List<Pedido> obtenerPedidosActivos(String usuario) {
        java.util.List<Pedido> resultado = new java.util.ArrayList<Pedido>();
        Connection con;
        PreparedStatement stmPedidos = null;
        ResultSet rsPedidos;

        con = super.getConexion();

        try {
            stmPedidos = con.prepareStatement("SELECT *\n"
                    + "FROM pedidos\n"
                    + "WHERE cliente=? AND fecha>=(SELECT current_date) "
                    + "UNION\n"
                    + "SELECT *\n"
                    + "FROM PEDIDOS\n"
                    + "WHERE cliente=? AND fecha is null");
            stmPedidos.setString(1, usuario);
            stmPedidos.setString(2, usuario);
            rsPedidos = stmPedidos.executeQuery();
            while (rsPedidos.next()) {
                resultado.add(new Pedido(rsPedidos.getString("fecha"),
                        rsPedidos.getString("cliente"),
                        rsPedidos.getInt("codigo"),
                        rsPedidos.getBoolean("express"),
                        rsPedidos.getString("direccion"),
                        rsPedidos.getString("destinatario"),
                        rsPedidos.getString("tramitador")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPedidos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

    public java.util.List<Paquete> comprobarLocalizacion(int codigo) {
        java.util.List<Paquete> resultado = new java.util.ArrayList<Paquete>();
        Connection con;
        PreparedStatement stmPedidos = null;
        ResultSet rsPedidos = null;

        con = super.getConexion();

        try {
            stmPedidos = con.prepareStatement("SELECT * "
                    + "FROM paquetes "
                    + "WHERE codigo=?");
            stmPedidos.setInt(1, codigo);

            rsPedidos = stmPedidos.executeQuery();
            //String codigo, String pedido, float peso, float alto, float ancho, float largo, String fecha_entrega, String matrcula, String local
            while (rsPedidos.next()) {
                resultado.add(new Paquete(rsPedidos.getInt("codigo"),
                        rsPedidos.getInt("pedido"),
                        rsPedidos.getFloat("peso"),
                        rsPedidos.getInt("alto"),
                        rsPedidos.getInt("ancho"),
                        rsPedidos.getInt("largo"),
                        rsPedidos.getString("fecha_entrega"),
                        rsPedidos.getString("vehiculo"),
                        rsPedidos.getString("local"), null));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPedidos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

        return resultado;
    }

    public ArrayList<Pedido> pedidosSinTramitar(Integer codigo) {
        ArrayList<Pedido> resultado = new ArrayList<Pedido>();
        Connection con;
        PreparedStatement stmPedidos = null;
        ResultSet rsPedidos = null;

        con = super.getConexion();

        try {
            stmPedidos = con.prepareStatement("SELECT * "
                    + "FROM pedidos "
                    + "WHERE fecha ISNULL "
                    + "AND codigo = ?");
            stmPedidos.setInt(1, codigo);

            rsPedidos = stmPedidos.executeQuery();

            while (rsPedidos.next()) {
                resultado.add(new Pedido(null,
                        rsPedidos.getString("cliente"),
                        rsPedidos.getInt("codigo"),
                        rsPedidos.getBoolean("express"),
                        rsPedidos.getString("direccion"),
                        rsPedidos.getString("destinatario"),
                        rsPedidos.getString("tramitador")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPedidos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

        return resultado;
    }


    public ArrayList<Pedido> pedidosSinTramitar() {
        ArrayList<Pedido> resultado = new ArrayList<Pedido>();
        Connection con;
        PreparedStatement stmPedidos = null;
        ResultSet rsPedidos = null;

        con = super.getConexion();

        try {
            stmPedidos = con.prepareStatement("SELECT * "
                    + "FROM pedidos "
                    + "WHERE fecha ISNULL");

            rsPedidos = stmPedidos.executeQuery();

            while (rsPedidos.next()) {
                resultado.add(new Pedido(null,
                        rsPedidos.getString("cliente"),
                        rsPedidos.getInt("codigo"),
                        rsPedidos.getBoolean("express"),
                        rsPedidos.getString("direccion"),
                        rsPedidos.getString("destinatario"),
                        rsPedidos.getString("tramitador")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmPedidos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

        return resultado;
    }

    public void eliminarPedido(int codigo) {
        Connection con;
        PreparedStatement stm = null;
        ResultSet rs;

        con = this.getConexion();

        try {
            stm = con.prepareStatement("DELETE FROM pedidos WHERE codigo = ?");
            stm.setInt(1, codigo);
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
