

package baseDatos;
import aplicacion.*;
import gui.*;
import java.sql.*;
/**
 *
 * @author basesdatos
 */
public class DAOPedidos extends AbstractDAO {

   public DAOPedidos (Connection conexion, aplicacion.FachadaAplicacion fa){
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
    
    public java.util.List<Pedido> obtenerPedidos(String usuario)
    {
        java.util.List<Pedido> resultado=new java.util.ArrayList<Pedido>();
        Connection con;
        PreparedStatement stmPedidos=null;
        ResultSet rsPedidos;

        con=super.getConexion();

        try {
                stmPedidos=con.prepareStatement("SELECT *\n" +
                                                "FROM pedidos\n" +
                                                "WHERE cliente=? AND fecha<(SELECT current_date)");
                stmPedidos.setString(1, usuario);
                rsPedidos=stmPedidos.executeQuery();
                 while (rsPedidos.next())
                {
                    resultado.add(new Pedido(rsPedidos.getString("fecha"),
                                                  rsPedidos.getString("cliente"),
                                                  rsPedidos.getInt("codigo"),
                                                  rsPedidos.getBoolean("express"),
                                                  rsPedidos.getString("direccion"),
                                                  rsPedidos.getString("destinatario"),
                                                  rsPedidos.getString("tramitador")));
                 }

            }catch (SQLException e){
                 System.out.println(e.getMessage());
                  this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
                    try {stmPedidos.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
        return resultado;
    }

   
}
