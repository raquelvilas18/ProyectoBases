/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Local;
import aplicacion.Usuario;
import aplicacion.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaLocales extends AbstractTableModel {
    
    private List<Local> locales;
    public ModeloTablaLocales() {
        this.locales = new java.util.ArrayList<>();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Codigo";
                break;
            case 1:
                nombre = "Direccion";
                break;
            case 2:
                nombre = "Encargado";
                break;
            case 3:
                nombre = "Capacidad";
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
                resultado = locales.get(row).getCodigo();
                break;
            case 1:
                resultado = locales.get(row).getDireccion();
                break;
            case 2:
                resultado = locales.get(row).getEncargado();
                break;
            case 3:
                resultado = locales.get(row).getCapacidad().toString();
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
        return locales.size();
    }

    public void setFilas(List<Local> locales) {
        this.locales = locales;
        fireTableDataChanged();
    }
    
    public Local getFila(int fila){
        return locales.get(fila);
    }
}
