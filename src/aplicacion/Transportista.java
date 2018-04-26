/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author alumnogreibd
 */
public class Transportista extends Empleado{

    int numPaquetes;
    
    public Transportista(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo, String tipo, int nomina, String anoIngreso, boolean administrador) {
        super(usuario, password, dni, nombre, correo, direccion, telefono, sexo, tipo, nomina, anoIngreso);
    }
    
   public Transportista(String usuario, String nombre, String dni, String correo, String telefono, String sexo, String direccion, int nomina, String anoIngreso, int numPaquetes){
       super(usuario, null, dni, nombre, correo, direccion, telefono, sexo, "transportista", nomina, anoIngreso);
       this.numPaquetes=numPaquetes;
   }

    public int getNumPaquetes() {
        return numPaquetes;
    }
    
    
}
