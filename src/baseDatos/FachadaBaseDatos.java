/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.Cliente;
import aplicacion.Empleado;
import aplicacion.Local;
import aplicacion.Paquete;
import aplicacion.Pedido;
import aplicacion.Transportista;
import aplicacion.Usuario;
import aplicacion.Vehiculo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    private DAOVehiculos daoVehiculos;
    private DAOPaquetes daoPaquetes;
    private DAOLocales daoLocales;
    private DAOClientes daoClientes;

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
            daoVehiculos = new DAOVehiculos(conexion,this.fa);
            daoLocales = new DAOLocales(conexion,this.fa);
            daoClientes = new DAOClientes(conexion,this.fa);
            
        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
            fa.muestraExcepcion(f.getMessage());
        } catch (IOException i) {
            System.out.println(i.getMessage());
            fa.muestraExcepcion(i.getMessage());
        } catch (java.sql.SQLException e) {
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
    public java.util.List<Paquete> obtenerPaquetes(String codigo){
        return daoPedidos.obtenerPaquetes(codigo);
    }
     public void conexion(String idUsuario,boolean accion)
     {
         daoUsuarios.conexion(idUsuario, accion);
     }

    public String trabajaEn(String id) {
        return daoEmpleados.trabajaEn(id);
    }

    public void actualizar(Usuario usuario) {
        daoUsuarios.actualizar(usuario);
    }

    public void actualizarUsr(String id, Usuario usuario) {
        daoUsuarios.actualizarUsr(id, usuario);
    }

    public void eliminarUsuario(String id) {
        daoUsuarios.eliminarUsuario(id);
    }

    public void eliminarEmpleado(String id) {
        daoEmpleados.eliminarEmpleado(id);
    }

    public Usuario validarUsuario1(String idUsuario, String clave) {
        return daoUsuarios.validarUsuario1(idUsuario, clave);
    }

    public Usuario validarUsuario(String idUsuario, String clave) {
        return daoUsuarios.validarUsuario(idUsuario, clave);
    }
    public void actualizarLocal2(String id, String local) {
        daoEmpleados.actualizarLocal2(id, local);
    }

    public Usuario registrarUsuario(String id, String clave, String dni, String nombre, String email, String direccion, String telefono, String sexo, String tipo) {
        
        Usuario usr;
        
        usr= daoUsuarios.registrarUsuario(id, clave, dni, nombre, email, direccion, telefono, sexo, tipo);
        if(tipo.equals("cliente")){
         daoClientes.registrarClientes(id);
        }
        return usr;
    }

    public boolean existeId(String id){
        return daoUsuarios.existeId(id);
    }
    
    public String getTipo(String id) {
        return daoUsuarios.getTipo(id);
    }

    public ArrayList<Usuario> obtenerUsuarios(String id, String nombre) {
        return daoUsuarios.obtenerUsuarios(id, nombre);
    }

    public ArrayList<Cliente> obtenerClientes(String id, String nombre) {
        return daoUsuarios.obtenerClientes(id, nombre);
    }

    /*----------  PEDIDOS ----------*/
    public Pedido nuevoPedido(Pedido pd) {
        return daoPedidos.nuevoPedido(pd);
    }

    public Pedido getPedido(Pedido p) {
        return daoPedidos.getPedido(p);
    }

    public int tramitarPedido(Integer codigo, String transportista, String tramitador) {
        return daoPedidos.tramitarPedido(codigo, transportista, tramitador);
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

    public ArrayList<Pedido> pedidosSinTramitar(int codigo) {
        return daoPedidos.pedidosSinTramitar(codigo);
    }

    public ArrayList<Pedido> pedidosSinTramitar() {
        return daoPedidos.pedidosSinTramitar();
    }
    public void elimarPaquete(Integer pedido,Integer codigo){
        daoPedidos.elimarPaquete(pedido, codigo);
    }
    
    public void eliminarPedido(int codigo){
        daoPedidos.eliminarPedido(codigo);
    }

    public ArrayList<Pedido> pedidosPrecio(String u) {
        return daoPedidos.pedidosPrecio(u);
    }

    public ArrayList<Pedido> pedidosActivosPrecio(String u) {
        return daoPedidos.pedidosActivosPrecio(u);
    }

    //------PAQUETES---------//
    public void nuevoPaquete(Paquete p) {
        daoPaquetes.nuevoPaquete(p);
    }

    public List<Paquete> obtenerPaquetes(Integer codigo) {
        return daoPaquetes.obtenerPaquetes(codigo);
    }

    public void paqueteEntregado(String pedido, String codigo) {
        daoPaquetes.paqueteEntregado(pedido, codigo);
    }

    //------EMPLEADOS-------//
    public ArrayList<Empleado> obtenerEmpleados(String id) {
        return daoEmpleados.obtenerEmpleados(id);
    }

    public ArrayList<Integer> datosEmpleado(String id) {
        return daoEmpleados.datosEmpleado(id);
    }

    public Empleado nuevoEmpleado(String usuario, int nomina) {
        return daoEmpleados.nuevoEmpleado(usuario, nomina);
    }

    public void nuevoTransportista(String usuario, String matricula) {
        daoEmpleados.nuevoTransportista(usuario);
        daoVehiculos.actualizarConductor(usuario,matricula);
    }

    public void nuevoOficinista(String usuario, String local) {
        daoEmpleados.nuevoOficinista(usuario, local);
    }

    public void actualizarEmpleado(Empleado emp) {
        daoEmpleados.actualizarEmpleado(emp);
    }

    public void actualizarEmp(String id, Empleado emp) {
        daoEmpleados.actualizarEmp(id, emp);
    }

    //------VEHICULOS-----//
    public ArrayList<Vehiculo> obtenerVehiculos(String matricula) {
        return daoVehiculos.obtenerVehiculos(matricula);
    }
    
    public ArrayList<Vehiculo> vehiculosSinConductor() {
        return daoVehiculos.vehiculosSinConductor();
    }

    public void actualizarVehi(String matricula, Vehiculo vehi) {
        daoVehiculos.actualizarVehi(matricula, vehi);
    }

    public boolean consultarMatricula(String matricula) {
        return daoVehiculos.consultarMatricula(matricula);
    }

    public void registrarVehi(Vehiculo vehi) {
        daoVehiculos.registrarVehi(vehi);
    }

    public void eliminarVehi(String matricula) {
        daoVehiculos.eliminarVehi(matricula);
    }

    public ArrayList<Paquete> paquetesTransportista(String id) {
        return daoPaquetes.paquetesTransportista(id);
    }

    public ArrayList<Transportista> obtenerTransportistas() {
        return daoEmpleados.obtenerTransportistas();
    }

    public String localizarVehiculo(String Trasportista) {
        Vehiculo vehiculo = null;
        vehiculo = daoVehiculos.obtenerVehiculo(Trasportista);
        if (vehiculo != null) {
            return vehiculo.getDireccion();
        } else {
            return null;
        }
    }
    
     public String getVehiculo(String id){
        return daoVehiculos.obtenerVehiculo(id).getMatricula();
    }

     //------LOCALES------//
    public ArrayList<Local> obtenerLocales(String codigo) {
        return daoLocales.obtenerLocales(codigo);
    }

    public boolean consultarCodigo(String codigo) {
        return daoLocales.consultarCodigo(codigo);
    }

    public void registrarLocal(Local local) {
        daoLocales.registrarLocal(local);
    }

    public void actualizarLocal(String codigo, Local local) {
        daoLocales.actualizarLocal(codigo, local);
    }

    public void eliminarLocal(Local local) {
        daoLocales.eliminarLocal(local);
    }

    public void actualizarPosicion(String posicion, String transportista) {
        daoVehiculos.actualizarPosicion(posicion, transportista);
    }
    
    //------COMBO BOX-----//
    public ArrayList<String> transportistasComboBox(String matricula) {
        return daoEmpleados.transportistasComboBox(matricula);
    }
    
    public ArrayList<String> oficinistasComboBox(String local){
        return daoLocales.oficinistasComboBox(local);
    }

}
