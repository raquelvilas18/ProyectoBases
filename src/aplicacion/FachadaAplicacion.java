/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;
import gui.*;
import baseDatos.*;

/**
 *
 * @author ferho
 */
public class FachadaAplicacion {

    private gui.FachadaGui fgui;
    private FachadaBaseDatos fbd;
    private GestionUsuarios gUsuarios;
    private GestionPedidos gPedidos;
    
    public FachadaAplicacion(){
        fgui=new gui.FachadaGui(this);
        fbd = new FachadaBaseDatos(this);
        gUsuarios = new GestionUsuarios(fgui, fbd);
        gPedidos = new GestionPedidos(fgui,fbd);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FachadaAplicacion fa;

        fa = new FachadaAplicacion();
        fa.iniciaInterfazUsuario();
    }

    public void iniciaInterfazUsuario() {
        fgui.iniciaVista();
    }

    public void muestraExcepcion(String e){
        //fgui.muestraExcepcion(e);
    }
    public Boolean comprobarAutentificacion(String idUsuario, String clave){
        return gUsuarios.comprobarAutentificacion(idUsuario, clave);
    }
    public Usuario consultarUsuario(String idUsuario, String clave){
        return gUsuarios.consultarUsuario(idUsuario, clave);   
    }
    public boolean consultarId(String idUsuario){
        return gUsuarios.consultarId(idUsuario);
    }    
    public void actualizar(Usuario usuario){
        gUsuarios.actualizar(usuario);
    }
    public Usuario registrarUsuario(String id, String clave, String dni, String nombre,String email,String direccion,String telefono,String sexo){
        return gUsuarios.registrarUsuario(id, clave, dni,nombre, email, direccion, telefono, sexo);
    }
    
    public void nuevoPedido(Pedido pd)
    {
        gPedidos.nuevoPedido(pd);
    }
    
    public void tramitarPedido(Pedido pd)
    {
        gPedidos.tramitarPedido(pd);
    }
    
    public java.util.List<Pedido> obtenerHistorialPedidos(String usuario)
    {
        return gPedidos.obtenerHistorialPedidos(usuario);
    }
    
    public java.util.List<Pedido> obtenerPedidosActivos(String usuario)
    {
        return gPedidos.obtenerPedidosActivos(usuario);
    }

    public Pedido comprobarLocalizacion(String codigo)
    {
         return fbd.comprobarLocalizacion(codigo);
    }
    
}
