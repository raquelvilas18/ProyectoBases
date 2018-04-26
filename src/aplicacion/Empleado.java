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
    private Integer nomina;
    private String anoIngreso;
    
    public Empleado(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo, String tipo, Integer nomina, String anoIngreso){
        super(usuario, password, dni, nombre, correo, direccion, telefono, sexo, tipo);
        this.nomina = nomina;
        this.anoIngreso = anoIngreso;
    }
    
    public Integer getNomina(){
        return nomina;
    }
    
    public String getAnoIngreso(){
        return anoIngreso;
    }
    
    public void setNomina(Integer nomina){
        this.nomina = nomina;
    }
    
    public void setAnoIngreso(String anoIngreso){
        this.anoIngreso = anoIngreso;
    }    
}
