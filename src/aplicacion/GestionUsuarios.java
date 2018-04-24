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

    public FachadaGui getFgui() {
        return fgui;
    }

    public FachadaBaseDatos getFbd() {
        return fbd;
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
    public Usuario consultarUsuario(String idUsuario, String clave){
        Usuario u = null;
        if(idUsuario!=null && clave!=null){
            u=fbd.validarUsuario(idUsuario, clave);
        }
        return u;
    }
    public Usuario registrarUsuario(String id, String clave, String dni, String nombre,String email,String direccion,String telefono,String sexo, String tipo){
        return fbd.registrarUsuario(id, clave, dni, nombre, email, direccion, telefono, sexo, tipo);
    }
    public boolean consultarId(String idUsuario){
        return fbd.consultarId(idUsuario);
    }
    public void actualizar(Usuario usuario){
        fbd.actualizar(usuario);
    }
    
    public void conexion(String idUsuario,boolean accion)
    {
        fbd.conexion(idUsuario,accion);
    }
    public void actualizarUsr(String id,Usuario usuario) {
        fbd.actualizarUsr(id, usuario);
    }
    public void eliminarUsuario(String id){
        fbd.eliminarUsuario(id);
    }
}
