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
public class Paquete {
    private Integer codigo;
    private Integer pedido;
    private float peso;
    private float alto;
    private float ancho;
    private float largo;
    private float coste;
    private String fecha_entrega;
    private String transportista;
    private String vehiculo;
    private String local;
    private String posicion;

    public Paquete(Integer codigo, Integer pedido, float peso, float alto, float ancho, float largo, String fecha_entrega, String transportista) {
        this.codigo = codigo;
        this.pedido = pedido;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.fecha_entrega = fecha_entrega;
        this.transportista = transportista;
        
        float dimensiones = (alto*ancho*largo);
        
        if(dimensiones < 1){
            coste = peso + (float)0.5;
        }else if (dimensiones < 5){
            coste = peso + dimensiones;
        }else{
            coste = peso + 10;
        }
    }
    
    
     public Paquete(Integer codigo, Integer pedido, float peso, float alto, float ancho, float largo, String fecha_entrega, String transportista, String posicion) {
        this.codigo = codigo;
        this.pedido = pedido;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.fecha_entrega = fecha_entrega;
        this.transportista = transportista;
        this.posicion = posicion;
        
        float dimensiones = (alto*ancho*largo);
        
        if(dimensiones < 1){
            coste = peso + (float)0.5;
        }else if (dimensiones < 5){
            coste = peso + dimensiones;
        }else{
            coste = peso + 10;
        }
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String matrcula) {
        this.transportista = matrcula;
    }   

    public String getLocal() {
        return local;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
    
}
