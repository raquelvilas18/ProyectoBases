/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import aplicacion.Empleado;
import aplicacion.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alumnogreibd
 */
public class DAOEmpleados extends AbstractDAO {

    public DAOEmpleados(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

    public ArrayList<Empleado> obtenerEmpleados(String id, String nombre) {
        java.util.ArrayList<Empleado> resultado = new java.util.ArrayList<Empleado>();
        Connection con;
        PreparedStatement stmEmpleados = null;
        ResultSet rsEmpleados;

        con = super.getConexion();

        try {
            stmEmpleados = con.prepareStatement("SELECT *\n"
                    + "FROM empleados\n"
                    + "WHERE cliente=? AND fecha<(SELECT current_date)");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
        } finally {
            try {
                stmEmpleados.close();
            } catch (SQLException e) {
                System.out.println("Imposible cerrar cursores");
            }
        }
        return resultado;
    }

}
