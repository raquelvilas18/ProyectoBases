/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import baseDatos.FachadaBaseDatos;
import gui.FachadaGui;

/**
 *
 * @author alumnogreibd
 */

public class GestionPedidos{
    FachadaGui fgui;
    FachadaBaseDatos fbd;
    
    public GestionPedidos(FachadaGui fgui, FachadaBaseDatos fbd){
     this.fgui=fgui;
     this.fbd=fbd;
    }
    
    public void nuevoPedido(Pedido pd)
    {
        fbd.nuevoPedido(pd);
    }
    
    public void tramitarPedido(Pedido pd)
    {
        fbd.tramitarPedido(pd);
    }
    
    public java.util.List<Pedido> obtenerHistorialPedidos(String usuario)
    {
         return fbd.obtenerHistorialPedidos(usuario);
    }
    
    public java.util.List<Pedido> obtenerPedidosActivos(String usuario)
    {
         return fbd.obtenerPedidosActivos(usuario);
    }
 
    public Pedido comprobarLocalizacion(String codigo)
    {
         return fbd.comprobarLocalizacion(codigo);
    }
}