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
public class GestionPaquetes {
    FachadaGui fgui;
    FachadaBaseDatos fbd;

    public GestionPaquetes(FachadaGui fgui, FachadaBaseDatos fbd) {
        this.fgui = fgui;
        this.fbd = fbd;
    }
    
    public void nuevoPaquete(Paquete p){
        fbd.nuevoPaquete(p);
    }
    
    public void localizar(Integer codigo){
        java.util.List<Paquete> Paquetes;
        java.util.List<String> Posiciones = new java.util.ArrayList<String>();
        Paquetes = fbd.obtenerPaquetes(codigo);
        for(Paquete p : Paquetes){
            if(p.getFecha_entrega() != null && !p.getFecha_entrega().equals(""))
                Posiciones.add("Entregado");
            else if(p.getMatrcula() != null && !p.getMatrcula().equals("")){
                Posiciones.add(fbd.localizarVehiculo(p.getMatrcula()));
                System.out.println(p.getMatrcula());
            }else if(p.getLocal() != null && !p.getLocal().equals("")){
                //Posiciones.add(fbd.localizarLocal(p.getLocal()));
                Posiciones.add("En un local de la mancha ...");
            }
        }
        fgui.localizar(Paquetes, Posiciones);
    }
}
