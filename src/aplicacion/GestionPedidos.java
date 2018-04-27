/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import baseDatos.FachadaBaseDatos;
import gui.FachadaGui;
import java.util.ArrayList;

/**
 *
 * @author alumnogreibd
 */
public class GestionPedidos {

    FachadaGui fgui;
    FachadaBaseDatos fbd;

    public GestionPedidos(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }

    public Pedido nuevoPedido(Pedido pd) {
        return fbd.nuevoPedido(pd);
    }

     public Pedido getPedido(Pedido p) {
        return fbd.getPedido(p);
    }
    public java.util.List<Pedido> obtenerHistorialPedidos(String usuario) {
        return fbd.obtenerHistorialPedidos(usuario);
    }

    public java.util.List<Pedido> obtenerPedidosActivos(String usuario) {
        return fbd.obtenerPedidosActivos(usuario);
    }

    public ArrayList<Pedido> pedidosSinTramitar(int codigo) {
        return fbd.pedidosSinTramitar(codigo);
    }
    
    public ArrayList<Pedido> pedidosSinTramitar(){
        return fbd.pedidosSinTramitar();
    }

    public java.util.List<Paquete> comprobarLocalizacion(Integer codigo) {
        return fbd.comprobarLocalizacion(codigo);
    }
    
    public void tramitarPedido(Integer codigo, String transportista, String tramitador) {
        fbd.tramitarPedido(codigo, transportista, tramitador);
    }
}
