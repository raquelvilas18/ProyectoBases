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
public class Empleado extends Usuario{
    private int nomina;
    private int anoIngreso;
    private boolean administrador;
    
    public Empleado(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo, int nomina, int anoIngreso, boolean administrador){
        super(usuario, password, dni, nombre, correo, direccion, telefono, sexo);
        this.nomina = nomina;
        this.anoIngreso = anoIngreso;
        this.administrador = administrador;
    }
    
    public int getNomina(){
        return nomina;
    }
    
    public int getAnoIngreso(){
        return anoIngreso;
    }
    
    public void setNomina(int nomina){
        this.nomina = nomina;
    }
    
    public void setAnoIngreso(int anoIngreso){
        this.anoIngreso = anoIngreso;
    }    
    
     public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
