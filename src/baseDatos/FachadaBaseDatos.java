/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;
import aplicacion.Pedido;
import aplicacion.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author basesdatos
 */
public class FachadaBaseDatos {
    private aplicacion.FachadaAplicacion fa;
    private java.sql.Connection conexion;
    private DAOUsuarios daoUsuarios;
    private DAOPedidos daoPedidos;
    
    public FachadaBaseDatos (aplicacion.FachadaAplicacion fa){
        
        Properties configuracion = new Properties();
        this.fa=fa;
        FileInputStream arqConfiguracion;

        try {
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            Properties usuario = new Properties();
     

            String gestor = configuracion.getProperty("gestor");

            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            this.conexion=java.sql.DriverManager.getConnection("jdbc:"+gestor+"://"+
                    configuracion.getProperty("servidor")+":"+
                    configuracion.getProperty("puerto")+"/"+
                    configuracion.getProperty("baseDatos"),
                    usuario);
            daoUsuarios = new DAOUsuarios(conexion, this.fa);
            daoPedidos = new DAOPedidos(conexion, this.fa);

        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
            fa.muestraExcepcion(f.getMessage());
        } catch (IOException i) {
            System.out.println(i.getMessage());
            fa.muestraExcepcion(i.getMessage());
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            fa.muestraExcepcion(e.getMessage());
        }
    }
    public boolean consultarId(String idUsuario){
        //return daoUsuarios.consultarId(idUsuario);
        return true;
    }
    public void actualizar(Usuario usuario){
        //daoUsuarios.actualizar(usuario);
    }
    public Usuario validarUsuario(String idUsuario, String clave) {
        return daoUsuarios.validarUsuario(idUsuario, clave);
    }

    public Usuario registrarUsuario(String id, String clave, String dni, String nombre, String email, String direccion, String telefono, String sexo) {
        return daoUsuarios.registrarUsuario(id, clave, dni, nombre, email, direccion, telefono, sexo);
    }
    
    /*----------  PEDIDOS ----------*/
    
    public void nuevoPedido(Pedido pd)
    {
        daoPedidos.nuevoPedido(pd);
    }
    
    public void tramitarPedido(Pedido pd)
    {
        daoPedidos.tramitarPedido(pd);
    }
    
    public java.util.List<Pedido> obtenerHistorialPedidos(String usuario)
    {
        return daoPedidos.obtenerHistorialPedidos(usuario);
    }
    
     public java.util.List<Pedido> obtenerPedidosActivos(String usuario)
    {
        return daoPedidos.obtenerPedidosActivos(usuario);
    }
     
    public Pedido comprobarLocalizacion(String codigo)
     {
         return daoPedidos.comprobarLocalizacion(codigo);
     }
     
}
