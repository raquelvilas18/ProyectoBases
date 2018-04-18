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
        Usuario u = null;
        if(idUsuario!=null && clave!=null){
            u=fbd.validarUsuario(idUsuario, clave);
        }
        if (u!=null){
            return true;
        } else return false;
    }
    public Usuario registrarUsuario(String id, String clave, String dni, String nombre,String email,String direccion,String telefono,String sexo){
        return fbd.registrarUsuario(id, clave, dni, nombre, email, direccion, telefono, sexo);
    }
}
