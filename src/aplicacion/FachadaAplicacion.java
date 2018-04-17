/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author ferho
 */
public class FachadaAplicacion {

    private gui.FachadaGui fgui;
    private GestionUsuarios gUsuarios;
    
    public FachadaAplicacion(){
        fgui=new gui.FachadaGui(this);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void muestraExcepcion(String e){
        //fgui.muestraExcepcion(e);
    }
    public Boolean comprobarAutentificacion(String idUsuario, String clave){
        return gUsuarios.comprobarAutentificacion(idUsuario, clave);
    }
    
}
