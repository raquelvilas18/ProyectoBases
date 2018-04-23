

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
    
    public void nuevoPedido(Pedido pd)
    {
        Connection con;
        PreparedStatement stmPedidos=null;
        
        con = super.getConexion();
        
        try {
            stmPedidos=con.prepareStatement("Insert into pedidos(cliente, express, direccion, destinatario) "
                    + "values (?,?,?,?)");
            stmPedidos.setString(1, pd.getCliente());
            stmPedidos.setBoolean(2, pd.isExpress());
            stmPedidos.setString(3, pd.getDireccion());
            stmPedidos.setString(4, pd.getDestinatario());
            stmPedidos.executeUpdate();
            
            
            
        }catch(SQLException e){
                 System.out.println(e.getMessage());
                  this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
                    try {stmPedidos.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
        
        
        con=super.getConexion();
        
    }
    
    public void tramitarPedido(Integer codigo)
    {
        Connection con;
        PreparedStatement stmPedidos=null;
        
        con = super.getConexion();
        
        try {
            stmPedidos=con.prepareStatement("update pedidos "
                    + "set fecha=current_date, "
                    + "where codigo=?");
            stmPedidos.setInt(1, codigo);
            
            stmPedidos.executeUpdate();
            
        }catch(SQLException e){
                 System.out.println(e.getMessage());
                  this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
                    try {stmPedidos.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
    }
    
    public java.util.List<Pedido> obtenerHistorialPedidos(String usuario)
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

    public java.util.List<Pedido> obtenerPedidosActivos(String usuario)
    {
        java.util.List<Pedido> resultado=new java.util.ArrayList<Pedido>();
        Connection con;
        PreparedStatement stmPedidos=null;
        ResultSet rsPedidos;

        con=super.getConexion();

        try {
                stmPedidos=con.prepareStatement("SELECT *\n" +
                                                "FROM pedidos\n" +
                                                "WHERE cliente=? AND fecha>=(SELECT current_date) "
                        + "UNION\n"
                        + "SELECT *\n"
                        + "FROM PEDIDOS\n"
                        + "WHERE cliente=? AND fecha is null");
                stmPedidos.setString(1, usuario);
                stmPedidos.setString(2, usuario);
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
   
    public java.util.List<Paquete> comprobarLocalizacion(Integer codigo)
    {
        java.util.List<Paquete> resultado =new java.util.ArrayList<Paquete>();
        Connection con;
        PreparedStatement stmPedidos=null;
        ResultSet rsPedidos=null;
        
        con = super.getConexion();
        
        try{
            stmPedidos=con.prepareStatement("SELECT * "+
                                            "FROM paquetes " +
                                            "WHERE codigo=?");
            stmPedidos.setInt(1, codigo);
            
            rsPedidos = stmPedidos.executeQuery();
            //String codigo, String pedido, float peso, float alto, float ancho, float largo, String fecha_entrega, String matrcula, String local
            while(rsPedidos.next()){
                resultado.add(new Paquete(rsPedidos.getInt("codigo"),
                                                  rsPedidos.getInt("pedido"),
                                                  rsPedidos.getFloat("peso"),
                                                  rsPedidos.getInt("alto"),
                                                  rsPedidos.getInt("ancho"),
                                                  rsPedidos.getInt("largo"),
                                                  rsPedidos.getString("fecha_entrega"),
                                                  rsPedidos.getString("vehiculo"),
                                                  rsPedidos.getString("local")));
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
