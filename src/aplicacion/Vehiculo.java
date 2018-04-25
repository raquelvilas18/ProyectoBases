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
public class Vehiculo {
    
    private String matricula;
    private String itv;
    private String fechaCompra;
    private Integer capacidad;
    private String trans;
    private String direccion;

    public Vehiculo(String matricula, String itv, String fechaCompra, Integer capacidad, String trans, String direccion) {
        this.matricula = matricula;
        this.itv = itv;
        this.fechaCompra = fechaCompra;
        this.capacidad = capacidad;
        this.trans = trans;
        this.direccion = direccion;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getItv() {
        return itv;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public String getTrans() {
        return trans;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setItv(String itv) {
        this.itv = itv;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
