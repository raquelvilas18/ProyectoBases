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
public class GestionEmpleados extends GestionUsuarios{

    public GestionEmpleados(FachadaGui fgui, FachadaBaseDatos fbd) {
        super(fgui, fbd);
    }
    
    public Empleado nuevoEmpleado(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo, int nomina, int anoIngreso, boolean administrador){
        Usuario usr = super.registrarUsuario(usuario, password, dni, nombre, correo, direccion, telefono, sexo);
        return super.getFbd().nuevoEmpleado(usr.getUsuario(), nomina, anoIngreso, administrador);
    }
    
    public void actualizar(Empleado emp){
        super.getFbd().actualizar(emp);
        if(emp.getAdministrador())
            super.getFbd().actualizarEmpleado(emp);
    }
    
    public void actualizarEmpleado(String id, Empleado emp){
        super.getFbd().actualizarUsr(id, emp);
        if(emp.getAdministrador())
            super.getFbd().actualizarEmp(id,emp);
    }
    
    public void tramitarPedido(Integer codigo){
        super.getFbd().tramitarPedido(codigo);
    }
    
    public void actualizarDireccion(){
        
    }
}
