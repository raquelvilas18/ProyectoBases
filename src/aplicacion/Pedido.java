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
public class Pedido {
   private String fecha;
   private String cliente;
   private Integer codigo;
   private boolean express;
   private String direccion;
   private String destinatario;
   private String tramitador;
   private String transportista;
   private int numPaquetes;
   
    public Pedido(String cliente, boolean express, String direccion, String destinatario)   {
       this.cliente=cliente;
       this.express=express;
       this.direccion=direccion;
       this.destinatario=destinatario;
   }
    
    public Pedido(String fecha,String cliente,Integer codigo, boolean express, String direccion, String destinatario,String tramitador)   {
       this.cliente=cliente;
       this.express=express;
       this.direccion=direccion;
       this.destinatario=destinatario;
       this.fecha=fecha;
       this.codigo=codigo;
       this.tramitador=tramitador;
   }
    
    public Pedido(String fecha,String cliente,Integer codigo, boolean express, String direccion, String destinatario,String tramitador, int numPaquetes)   {
       this.cliente=cliente;
       this.express=express;
       this.direccion=direccion;
       this.destinatario=destinatario;
       this.fecha=fecha;
       this.codigo=codigo;
       this.tramitador=tramitador;
       this.numPaquetes = numPaquetes;
   }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public boolean isExpress() {
        return express;
    }

    public void setExpress(boolean express) {
        this.express = express;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getTramitador() {
        return tramitador;
    }

    public void setTramitador(String tramitador) {
        this.tramitador = tramitador;
    }

    public int getNumPaquetes() {
        return numPaquetes;
    }

    public void setNumPaquetes(int numPaquetes) {
        this.numPaquetes = numPaquetes;
    }
   
   
}
