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
 * @author ferho
 */
public class GestionUsuarios {
    private FachadaGui fgui;
    private FachadaBaseDatos fbd;
    
   
    public GestionUsuarios(FachadaGui fgui, FachadaBaseDatos fbd){
     this.fgui=fgui;
     this.fbd=fbd;
    }  
    
    public Boolean comprobarAutentificacion(String idUsuario, String clave){
        Usuario u;

        u=fbd.validarUsuario(idUsuario, clave);
        if (u!=null){
            return true;
        } else return false;
    }
}
