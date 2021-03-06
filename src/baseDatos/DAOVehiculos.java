/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.*;
import gui.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author alumnogreibd
 */
public class DAOVehiculos extends AbstractDAO {

    public DAOVehiculos(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public ArrayList<Vehiculo> obtenerVehiculos(String matricula) {
        ArrayList<Vehiculo> resultado = new ArrayList<Vehiculo>();
        Connection con;
        PreparedStatement stmVehiculos = null;
        ResultSet rsVehiculos = null;

        con = super.getConexion();

        try {
            stmVehiculos = con.prepareStatement("SELECT * "
                    + "FROM vehiculos WHERE matricula like ?");

            stmVehiculos.setString(1, "%" + matricula + "%");

            rsVehiculos = stmVehiculos.executeQuery();

            while (rsVehiculos.next()) {
                resultado.add(new Vehiculo(rsVehiculos.getString("matricula"),
                        rsVehiculos.getString("proximaITV"),
                        rsVehiculos.getString("fechaCompra"),
                        rsVehiculos.getInt("capacidad"),
                        rsVehiculos.getString("conductor"),
                        rsVehiculos.getString("direccion")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmVehiculos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

        return resultado;
    }
    
    public ArrayList<Vehiculo> vehiculosSinConductor() {
        ArrayList<Vehiculo> resultado = new ArrayList<Vehiculo>();
        Connection con;
        PreparedStatement stmVehiculos = null;
        ResultSet rsVehiculos = null;

        con = super.getConexion();

        try {
            stmVehiculos = con.prepareStatement("SELECT * "
                    + "FROM vehiculos "
                    + "WHERE conductor ISNULL");

            rsVehiculos = stmVehiculos.executeQuery();

            while (rsVehiculos.next()) {
                resultado.add(new Vehiculo(rsVehiculos.getString("matricula"),
                        rsVehiculos.getString("proximaITV"),
                        rsVehiculos.getString("fechaCompra"),
                        rsVehiculos.getInt("capacidad"),
                        rsVehiculos.getString("conductor"),
                        rsVehiculos.getString("direccion")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmVehiculos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

        return resultado;
    }

    public void actualizarVehi(String matricula, Vehiculo vehi) {

        Connection con;
        PreparedStatement stmVehiculo = null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date fechaItv;
        java.util.Date fechaCompra;

        try {
            fechaItv = formato.parse(vehi.getItv()); // Recoger la excepcion
            fechaCompra = formato.parse(vehi.getFechaCompra());

            Date fechaItvSql = new java.sql.Date(fechaItv.getTime());
            Date fechaCompraSql = new java.sql.Date(fechaCompra.getTime());

            con = super.getConexion();

            stmVehiculo = con.prepareStatement("UPDATE vehiculos\n"
                    + " SET matricula=?, proximaitv=?, fechacompra=?, capacidad=?, conductor=?, direccion=?" //Igual hay que cambiar la fecha
                    + " WHERE matricula=? ");
            stmVehiculo.setString(1, vehi.getMatricula());
            stmVehiculo.setDate(2, fechaItvSql);
            stmVehiculo.setDate(3, fechaCompraSql);
            stmVehiculo.setInt(4, vehi.getCapacidad());
            stmVehiculo.setString(5, vehi.getTrans());
            stmVehiculo.setString(6, vehi.getDireccion());
            stmVehiculo.setString(7, vehi.getMatricula());
            stmVehiculo.executeUpdate();
        } catch (ParseException e1) {
            this.getFachadaAplicacion().muestraExcepcion(e1.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmVehiculo.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

    }

    public boolean consultarMatricula(String matricula) {

        Connection con;
        PreparedStatement stmVehiculo = null;
        ResultSet rsVehiculo = null;

        con = super.getConexion();

        try {
            stmVehiculo = con.prepareStatement("SELECT * "
                    + "FROM vehiculos "
                    + "WHERE matricula=?");

            stmVehiculo.setString(1, matricula);
            rsVehiculo = stmVehiculo.executeQuery();
            if (rsVehiculo.next()) {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmVehiculo.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

        return true;
    }

    public void registrarVehi(Vehiculo vehi) {
        Connection con;
        PreparedStatement stmVehiculo = null;

        con = super.getConexion();

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date fechaItv;
        java.util.Date fechaCompra;

        try {

            fechaItv = formato.parse(vehi.getItv()); // Recoger la excepcion
            fechaCompra = formato.parse(vehi.getFechaCompra());

            Date fechaItvSql = new java.sql.Date(fechaItv.getTime());
            Date fechaCompraSql = new java.sql.Date(fechaCompra.getTime());

            stmVehiculo = con.prepareStatement("INSERT INTO vehiculos(\n"
                    + "matricula, proximaitv, fechacompra, capacidad, conductor, direccion)\n"
                    + "VALUES (?,?,?,?,?,?);");
            stmVehiculo.setString(1, vehi.getMatricula());
            stmVehiculo.setDate(2, fechaItvSql);
            stmVehiculo.setDate(3, fechaCompraSql);
            stmVehiculo.setInt(4, vehi.getCapacidad());
            stmVehiculo.setString(5, vehi.getTrans());
            stmVehiculo.setString(6, vehi.getDireccion());
            stmVehiculo.executeUpdate();

        } catch (ParseException e1) {
            System.out.println(e1.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e1.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmVehiculo.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public void eliminarVehi(String matricula) {
        Connection con;
        PreparedStatement stmVehiculo = null;

        con = super.getConexion();

        try {
            stmVehiculo = con.prepareStatement("DELETE FROM vehiculos WHERE matricula = ?");
            stmVehiculo.setString(1, matricula);
            stmVehiculo.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmVehiculo.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

    public Vehiculo obtenerVehiculo(String trasportista) {
        Vehiculo resultado = null;
        Connection con;
        PreparedStatement stmVehiculos = null;
        ResultSet rsVehiculos = null;

        con = super.getConexion();

        try {
            stmVehiculos = con.prepareStatement("SELECT * "
                    + "FROM vehiculos "
                    + "WHERE conductor=?");
            stmVehiculos.setString(1, trasportista);
            rsVehiculos = stmVehiculos.executeQuery();

            while (rsVehiculos.next()) {
                resultado = new Vehiculo(rsVehiculos.getString("matricula"),
                        rsVehiculos.getString("proximaITV"),
                        rsVehiculos.getString("fechaCompra"),
                        rsVehiculos.getInt("capacidad"),
                        rsVehiculos.getString("conductor"),
                        rsVehiculos.getString("direccion"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmVehiculos.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }

        return resultado;
    }
    
    

    public void actualizarPosicion(String posicion, String transportista) {
        Vehiculo resultado = null;
        Connection con;
        PreparedStatement stm = null;
        con = super.getConexion();

        try {
            stm = con.prepareStatement("UPDATE vehiculos "
                    + "SET direccion = ? "
                    + "WHERE conductor = ? ");
            stm.setString(1, posicion);
            stm.setString(2, transportista);
            
            stm.executeUpdate();
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stm.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }
    
    public void actualizarConductor(String usuario,String matricula){
        Connection con;
        PreparedStatement stm = null;
        con = super.getConexion();

        try {
            stm = con.prepareStatement("UPDATE vehiculos "
                    + " SET conductor = ? "
                    + " WHERE matricula = ? ");
            stm.setString(1, usuario);
            stm.setString(2, matricula);
            
            stm.executeUpdate();
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stm.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
    }

}
