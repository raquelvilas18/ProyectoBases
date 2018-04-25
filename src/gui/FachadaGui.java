/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import aplicacion.*;

/**
 *
 * @author alumno
 */
public class FachadaGui {
    aplicacion.FachadaAplicacion fa;
    VPrincipal vp;
    
   public FachadaGui(aplicacion.FachadaAplicacion fa){
     this.fa=fa;
     this.vp = new VPrincipal(fa);
   } 
    
    
    
    public void iniciaVista(){

      vp.setVisible(true);
    }
    

   public void muestraExcepcion(String e){
       VAviso va;
       va = new VAviso(vp,true,e);
       va.setVisible(true);
   }

    
   
}
