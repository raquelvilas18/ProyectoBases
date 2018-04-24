/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.Empleado;
import aplicacion.Paquete;
import aplicacion.Pedido;
import aplicacion.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author basesdatos
 */
public class FachadaBaseDatos {

    private aplicacion.FachadaAplicacion fa;
    private java.sql.Connection conexion;
    private DAOUsuarios daoUsuarios;
    private DAOPedidos daoPedidos;
    private DAOEmpleados daoEmpleados;
    private DAOPaquetes daoPaquetes;

    public FachadaBaseDatos(aplicacion.FachadaAplicacion fa) {

        Properties configuracion = new Properties();
        this.fa = fa;
        FileInputStream arqConfiguracion;

        try {
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            Properties usuario = new Properties();
            
            String gestor = configuracion.getProperty("gestor");

            
            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            this.conexion = java.sql.DriverManager.getConnection("jdbc:" + gestor + "://"
                    + configuracion.getProperty("servidor") + ":"
                    + configuracion.getProperty("puerto") + "/"
                    + configuracion.getProperty("baseDatos"),
                    usuario);
            /*
            Class.forName("org.postgresql.Driver");

            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            URI dbUri = new URI("postgresql://jlljsgmqotjqed:95739ed75a6f8c4f255732e7c530e0106943700f87d161dc98e9edb65217737e@ec2-54-75-227-92.eu-west-1.compute.amazonaws.com:5432/dej1fq8t5tg60l");

            String username = dbUri.getUserInfo().split(":")[0];
            String password = dbUri.getUserInfo().split(":")[1];
            String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";
            
            this.conexion = java.sql.DriverManager.getConnection(dbUrl,username,password);
            */
            daoUsuarios = new DAOUsuarios(conexion, this.fa);
            daoPedidos = new DAOPedidos(conexion, this.fa);
            daoEmpleados = new DAOEmpleados(conexion, this.fa);
            daoPaquetes = new DAOPaquetes(conexion, this.fa);
            
        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
            fa.muestraExcepcion(f.getMessage());
        } catch (IOException i) {
            System.out.println(i.getMessage());
            fa.muestraExcepcion(i.getMessage());
        }catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            fa.muestraExcepcion(e.getMessage());
        }/*catch (ClassNotFoundException ex) {
            Logger.getLogger(FachadaBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(FachadaBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    public boolean consultarId(String idUsuario) {
        return daoUsuarios.consultarId(idUsuario);
    }
    
     public void conexion(String idUsuario,boolean accion)
     {
         daoUsuarios.conexion(idUsuario, accion);
     }

    public void actualizar(Usuario usuario) {
        daoUsuarios.actualizar(usuario);
    }
    
    public void actualizarUsr(String id,Usuario usuario) {
        daoUsuarios.actualizarUsr(id, usuario);
    }
    
    public void eliminarUsuario(String id){
        daoUsuarios.eliminarUsuario(id);
    }

    public Usuario validarUsuario1(String idUsuario, String clave) {
        return daoUsuarios.validarUsuario1(idUsuario, clave);
    }
    
    public Usuario validarUsuario(String idUsuario, String clave) {
        return daoUsuarios.validarUsuario(idUsuario, clave);
    }

    public Usuario registrarUsuario(String id, String clave, String dni, String nombre, String email, String direccion, String telefono, String sexo, String tipo) {
        return daoUsuarios.registrarUsuario(id, clave, dni, nombre, email, direccion, telefono, sexo, tipo);
    }

    public String getTipo(String id) {
        return daoUsuarios.getTipo(id);
    }
    
    public ArrayList<Usuario> obtenerUsuarios(String id, String nombre){
        return daoUsuarios.obtenerUsuarios(id, nombre);
    }
    


    /*----------  PEDIDOS ----------*/
    public Pedido nuevoPedido(Pedido pd) {
        return daoPedidos.nuevoPedido(pd);
    }

    public void tramitarPedido(Integer codigo) {
        daoPedidos.tramitarPedido(codigo);
    }

    public java.util.List<Pedido> obtenerHistorialPedidos(String usuario) {
        return daoPedidos.obtenerHistorialPedidos(usuario);
    }

    public java.util.List<Pedido> obtenerPedidosActivos(String usuario) {
        return daoPedidos.obtenerPedidosActivos(usuario);
    }

    public java.util.List<Paquete> comprobarLocalizacion(Integer codigo) {
        return daoPedidos.comprobarLocalizacion(codigo);
    }
    
    public ArrayList<Pedido> pedidosSinTramitar(int codigo){
        return daoPedidos.pedidosSinTramitar(codigo);
    }
    
    public ArrayList<Pedido> pedidosSinTramitar(){
        return daoPedidos.pedidosSinTramitar();
    }
    
    public void eliminarPedido(int codigo){
        daoPedidos.eliminarPedido(codigo);
    }
    
    
    //------PAQUETES---------//
    
    public void nuevoPaquete(Paquete p){
        daoPaquetes.nuevoPaquete(p);
    }

    //------EMPLEADOS-------//
    public ArrayList<Empleado> obtenerEmpleados(String id ) {
        return daoEmpleados.obtenerEmpleados(id);
    }
    
    public ArrayList<Integer> datosEmpleado(String id){
        return daoEmpleados.datosEmpleado(id);
    }
    
    public Empleado nuevoEmpleado(String usuario, int nomina, int anoIngreso){
        return daoEmpleados.nuevoEmpleado(usuario, nomina, anoIngreso);
    }
    
    public void actualizarEmpleado(Empleado emp){
        daoEmpleados.actualizarEmpleado(emp);
    }
    
    public void actualizarEmp(String id, Empleado emp){
        daoEmpleados.actualizarEmp(id,emp);
    }

}
