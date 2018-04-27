/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Usuario;
import aplicacion.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaVehiculos extends AbstractTableModel {
    
    private List<Vehiculo> vehiculos;
    public ModeloTablaVehiculos() {
        this.vehiculos = new java.util.ArrayList<>();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "matricula";
                break;
            case 1:
                nombre = "ITV";
                break;
            case 2:
                nombre = "direccion";
                break;
            case 3:
                nombre = "capacidad";
                break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col) {
            case 0:
                clase = java.lang.String.class;
                break;
            case 1:
                clase = java.lang.String.class;
                break;
            case 2:
                clase = java.lang.String.class;
                break;
            case 3:
                clase = java.lang.String.class;
                break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public Object getValueAt(int row, int col) {
        Object resultado = null;
        switch (col) {
            case 0:
                resultado = vehiculos.get(row).getMatricula();
                break;
            case 1:
                resultado = vehiculos.get(row).getItv();
                break;
            case 2:
                resultado = vehiculos.get(row).getDireccion();
                break;
            case 3:
                resultado = vehiculos.get(row).getCapacidad().toString();
                break;
        }
        return resultado;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return vehiculos.size();
    }

    public void setFilas(java.util.List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
        fireTableDataChanged();
    }
    
    public Vehiculo getFila(int fila){
        return vehiculos.get(fila);
    }
}
