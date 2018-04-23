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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

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
            daoUsuarios = new DAOUsuarios(conexion, this.fa);
            daoPedidos = new DAOPedidos(conexion, this.fa);
            daoEmpleados = new DAOEmpleados(conexion, this.fa);

        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
            fa.muestraExcepcion(f.getMessage());
        } catch (IOException i) {
            System.out.println(i.getMessage());
            fa.muestraExcepcion(i.getMessage());
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            fa.muestraExcepcion(e.getMessage());
        }
    }

    public boolean consultarId(String idUsuario) {
        return daoUsuarios.consultarId(idUsuario);
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

    public Usuario validarUsuario(String idUsuario, String clave) {
        return daoUsuarios.validarUsuario(idUsuario, clave);
    }

    public Usuario registrarUsuario(String id, String clave, String dni, String nombre, String email, String direccion, String telefono, String sexo) {
        return daoUsuarios.registrarUsuario(id, clave, dni, nombre, email, direccion, telefono, sexo);
    }

    public boolean esAdministrador(String id) {
        return daoUsuarios.esAdministrador(id);
    }
    
    public ArrayList<Usuario> obtenerUsuarios(String id, String nombre){
        return daoUsuarios.obtenerUsuarios(id, nombre);
    }
    


    /*----------  PEDIDOS ----------*/
    public void nuevoPedido(Pedido pd) {
        daoPedidos.nuevoPedido(pd);
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

    //------EMPLEADOS-------//
    public ArrayList<Empleado> obtenerEmpleados(String id ) {
        return daoEmpleados.obtenerEmpleados(id);
    }
    
    public ArrayList<Integer> datosEmpleado(String id){
        return daoEmpleados.datosEmpleado(id);
    }
    
    public Empleado nuevoEmpleado(String usuario, int nomina, int anoIngreso, boolean administrador){
        return daoEmpleados.nuevoEmpleado(usuario, nomina, anoIngreso, administrador);
    }
    
    public void actualizarEmpleado(Empleado emp){
        daoEmpleados.actualizarEmpleado(emp);
    }
    
    public void actualizarEmp(String id, Empleado emp){
        daoEmpleados.actualizarEmp(id,emp);
    }

}
