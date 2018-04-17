/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;
import gui.*;

/**
 *
 * @author ferho
 */
public class FachadaAplicacion {
     gui.FachadaGui fgui;
     
     public FachadaAplicacion() {
        fgui = new gui.FachadaGui(this);
    }

     public static void main(String args[]) {
        FachadaAplicacion fa;

        fa = new FachadaAplicacion();
        fa.iniciaInterfazUsuario();
    }

    public void iniciaInterfazUsuario() {
        fgui.iniciaVista();
    }
}
