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
public class Local {
    
    private String codigo;
    private String direccion;
    private String encargado;
    private Integer capacidad;

    public Local(String codigo, String direccion, String encargado, Integer capacidad) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.encargado = encargado;
        this.capacidad = capacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEncargado() {
        return encargado;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
