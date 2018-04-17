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
    
    public FachadaAplicacion(){
        fgui=new gui.FachadaGui(this);
        gUsuarios = new GestionUsuarios(fgui, fbd);
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
    
    public Usuario registrarUsuario(String id, String clave, String dni, String nombre,String email,String direccion,String telefono,String sexo){
        return gUsuarios.registrarUsuario(id, clave, dni,nombre, email, direccion, telefono, sexo);
    }

}
