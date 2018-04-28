/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import gui.*;
import baseDatos.*;
import java.util.ArrayList;

/**
 *
 * @author ferho
 */
public class FachadaAplicacion {

    private gui.FachadaGui fgui;
    private FachadaBaseDatos fbd;
    private GestionUsuarios gUsuarios;
    private GestionPedidos gPedidos;
    private GestionEmpleados gEmpleados;
    private GestionPaquetes gPaquetes;

    public FachadaAplicacion() {
        fgui = new gui.FachadaGui(this);
        fbd = new FachadaBaseDatos(this);
        gUsuarios = new GestionUsuarios(fgui, fbd);
        gPedidos = new GestionPedidos(fgui, fbd);
        gEmpleados = new GestionEmpleados(fgui, fbd);
        gPaquetes = new GestionPaquetes(fgui, fbd);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FachadaAplicacion fa;

        fa = new FachadaAplicacion();
        fa.iniciaInterfazUsuario();
    }

    public void iniciaInterfazUsuario() {
        fgui.iniciaVista();
    }

    public void muestraExcepcion(String e) {
        fgui.muestraExcepcion(e);
    }

    public Boolean comprobarAutentificacion(String idUsuario, String clave) {
        return gUsuarios.comprobarAutentificacion(idUsuario, clave);
    }

    public Usuario consultarUsuario(String idUsuario, String clave) {
        return gUsuarios.consultarUsuario(idUsuario, clave);
    }

    public boolean consultarId(String idUsuario) {
        return gUsuarios.consultarId(idUsuario);
    }

    public String trabajaEn(String id) {
        return gEmpleados.trabajaEn(id);
    }

    public void actualizar(Usuario usuario) {
        gUsuarios.actualizar(usuario);
    }

    public void actualizarUsr(String id, Usuario usuario) {
        gUsuarios.actualizarUsr(id, usuario);
    }

    public Pedido nuevoPedido(Pedido p) {
        return gPedidos.nuevoPedido(p);
    }

    public Pedido getPedido(Pedido p) {
        return gPedidos.getPedido(p);
    }

    public void nuevoPaquete(Paquete p) {
        gPaquetes.nuevoPaquete(p);
    }

    public Usuario registrarUsuario(String id, String clave, String dni, String nombre, String email, String direccion, String telefono, String sexo, String tipo) {
        return gUsuarios.registrarUsuario(id, clave, dni, nombre, email, direccion, telefono, sexo, tipo);
    }

    public void eliminarUsuario(String id) {
        gUsuarios.eliminarUsuario(id);
    }

    public void eliminarEmpleado(String id) {
        gUsuarios.eliminarEmpleado(id);
    }

    public void conexion(String idUsuario, boolean accion) {
        gUsuarios.conexion(idUsuario, accion);
    }

    public java.util.List<Pedido> obtenerHistorialPedidos(String usuario) {
        return gPedidos.obtenerHistorialPedidos(usuario);
    }

    public java.util.List<Pedido> obtenerPedidosActivos(String usuario) {
        return gPedidos.obtenerPedidosActivos(usuario);
    }

    public ArrayList<Pedido> pedidosSinTramitar(int codigo) {
        return gPedidos.pedidosSinTramitar(codigo);
    }

    public ArrayList<Pedido> pedidosSinTramitar() {
        return gPedidos.pedidosSinTramitar();
    }

    public Empleado nuevoEmpleado(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo, String tipo, int nomina, String local) {
        return gEmpleados.nuevoEmpleado(usuario, password, dni, nombre, correo, direccion, telefono, sexo, tipo, nomina, local);
    }

    public void actualizar(Empleado emp) {
        gEmpleados.actualizar(emp);
    }

    public void actualizarEmpleado(String id, Empleado emp) {
        gEmpleados.actualizarEmpleado(id, emp);
    }

    public void tramitarPedido(Integer codigo, String transportista, String tramitador) {
        gPedidos.tramitarPedido(this, codigo, transportista, tramitador);
    }

    public void actualizarDireccion() {
        gEmpleados.actualizarDireccion();
    }

    public java.util.List<Paquete> comprobarLocalizacion(Integer codigo) {
        return fbd.comprobarLocalizacion(codigo);
    }

    public String getTipo(String id) {
        return fbd.getTipo(id);
    }

    public ArrayList<Empleado> obtenerEmpleados(String id) {
        return fbd.obtenerEmpleados(id);
    }

    public ArrayList<Integer> datosEmpleado(String id) {
        return fbd.datosEmpleado(id);
    }

    public ArrayList<Usuario> obtenerUsuarios(String id, String nombre) {
        return fbd.obtenerUsuarios(id, nombre);
    }
    
    public ArrayList<Usuario> obtenerClientes(String id, String nombre) {
        return fbd.obtenerClientes(id, nombre);
    }

    public ArrayList<Vehiculo> obtenerVehiculos(String matricula) {
        return fbd.obtenerVehiculos(matricula);
    }

    public void actualizarVehi(String matricula, Vehiculo vehi) {
        fbd.actualizarVehi(matricula, vehi);
    }

    public boolean consultarMatricula(String matricula) {
        return fbd.consultarMatricula(matricula);
    }

    public void registrarVehi(Vehiculo vehi) {
        fbd.registrarVehi(vehi);
    }

    public void eliminarVehi(String matricula) {
        fbd.eliminarVehi(matricula);
    }

    public void eliminarPedido(int codigo) {
        fbd.eliminarPedido(codigo);

    }

    public ArrayList<Paquete> paquetesTransportista(String id) {
        return gPaquetes.paquetesTransportista(id);
    }

    public ArrayList<Transportista> obtenerTransportistas() {
        return gEmpleados.obtenerTransportistas();
    }
            
    public void paqueteEntregado(String pedido, String codigo) {
        gPaquetes.paqueteEntregado(pedido, codigo);
    }

    public ArrayList<Local> obtenerLocales(String codigo) {
        return fbd.obtenerLocales(codigo);
    }

    public boolean consultarCodigo(String codigo) {
        return fbd.consultarCodigo(codigo);
    }

    public void registrarLocal(Local local) {
        fbd.registrarLocal(local);
    }

    public void actualizarLocal(String codigo, Local local) {
        fbd.actualizarLocal(codigo, local);
    }

    public void eliminarLocal(Local local) {
        fbd.eliminarLocal(local);
    }

    public void actualizarPosicion(String posicion, String transportista) {
        fbd.actualizarPosicion(posicion, transportista);
    }
    
    public ArrayList<Pedido> pedidosPrecio(String u){
        return gPedidos.pedidosPrecio(u);
    }
    
    public ArrayList<Pedido> pedidosActivosPrecio(String u){
        return gPedidos.pedidosActivosPrecio(u);
    }

    public java.util.List<Paquete> localizar(Integer codigo){
        return gPaquetes.localizar(codigo);
    }
    
}
