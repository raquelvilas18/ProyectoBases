

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
            stmPedidos=con.prepareStatement("Insert into pedidos(cliente, express, direccion, destinatario, tramitador) "
                    + "values (?,?,?,?,?)");
            stmPedidos.setString(1, pd.getCliente());
            stmPedidos.setBoolean(2, pd.isExpress());
            stmPedidos.setString(3, pd.getDireccion());
            stmPedidos.setString(4, pd.getDestinatario());
            stmPedidos.setString(5, pd.getTramitador());

            stmPedidos.executeUpdate();
            
            
            
        }catch(SQLException e){
                 System.out.println(e.getMessage());
                  this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
            }finally{
                    try {stmPedidos.close();} catch (SQLException e){System.out.println("Imposible cerrar cursores");}
            }
        
        
        con=super.getConexion();
        
    }
    
    public void tramitarPedido(Pedido pd)
    {
        Connection con;
        PreparedStatement stmPedidos=null;
        
        con = super.getConexion();
        
        try {
            stmPedidos=con.prepareStatement("update pedidos "
                    + "set fecha=current_date, "
                    + "where codigo=?");
            stmPedidos.setInt(1, pd.getCodigo());
            
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
                                                "WHERE cliente=? AND fecha>=(SELECT current_date)");
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
   
    public Pedido comprobarLocalizacion(String codigo)
    {
        Pedido resultado = null;
        Connection con;
        PreparedStatement stmPedidos=null;
        ResultSet rsPedidos=null;
        
        con = super.getConexion();
        
        try{
            stmPedidos=con.prepareStatement("SELECT * "+
                                            "FROM pedidos " +
                                            "WHERE codigo=?");
            stmPedidos.setString(1, codigo);
            
            rsPedidos = stmPedidos.executeQuery();
            
            while(rsPedidos.next()){
                resultado = new Pedido(rsPedidos.getString("fecha"),
                                                  rsPedidos.getString("cliente"),
                                                  rsPedidos.getInt("codigo"),
                                                  rsPedidos.getBoolean("express"),
                                                  rsPedidos.getString("direccion"),
                                                  rsPedidos.getString("destinatario"),
                                                  rsPedidos.getString("tramitador"));
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
