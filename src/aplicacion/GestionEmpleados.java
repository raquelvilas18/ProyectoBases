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
public class GestionEmpleados extends GestionUsuarios{

    public GestionEmpleados(FachadaGui fgui, FachadaBaseDatos fbd) {
        super(fgui, fbd);
    }
    
    public Empleado nuevoEmpleado(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo, String tipo, int nomina,String local){
        Usuario usr = super.registrarUsuario(usuario, password, dni, nombre, correo, direccion, telefono, sexo, tipo);
        Empleado empleado;
        empleado=super.getFbd().nuevoEmpleado(usr.getUsuario(), nomina);
        if("transportista".equals(tipo)){
            super.getFbd().nuevoTransportista(usuario);
        }
        if("oficinista".equals(tipo)){
            super.getFbd().nuevoOficinista(usuario, local);
        }
        return empleado;
    }
    
    public void actualizar(Empleado emp){
        super.getFbd().actualizar(emp);
        if(this.getFbd().getTipo(emp.getUsuario()).equals("administrador"))
            super.getFbd().actualizarEmpleado(emp);
    }
    
    public void actualizarEmpleado(String id, Empleado emp){
        super.getFbd().actualizarUsr(id, emp);
        super.getFbd().actualizarEmp(id,emp);
    }
    
    public void tramitarPedido(Integer codigo){
        super.getFbd().tramitarPedido(codigo);
    }
    public String trabajaEn(String id) {  
        return super.getFbd().trabajaEn(id);
    }  
    public void actualizarDireccion(){
        
    }


}
