/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Transportista;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaTransportistas  extends AbstractTableModel {

    private java.util.List<Transportista> transportistas;
    private java.util.List<Integer> nPaquetes;

    public ModeloTablaTransportistas() {
        this.transportistas = new ArrayList<>();
        this.nPaquetes = new ArrayList<>();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "id";
                break;
            case 1:
                nombre = "nombre";
                break;
            case 2:
                nombre = "direccion";
                break;
            case 3:
                nombre = "sexo";
                break;
            case 4:
                nombre = "NºPaquetes";
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
            case 4:
                clase = java.lang.Integer.class;
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
                resultado = transportistas.get(row).getUsuario();
                break;
            case 1:
                resultado = transportistas.get(row).getNombre();
                break;
            case 2:
                resultado = transportistas.get(row).getDireccion();
                break;
            case 3:
                resultado = transportistas.get(row).getSexo();
                break;
            case 4:
                resultado = transportistas.get(row).getTipo();
                break;
        }
        return resultado;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return transportistas.size();
    }

    public void setFilas(java.util.List<Transportista> t) {
        this.transportistas = t;
        fireTableDataChanged();
    }
    
    public Transportista getFila(int fila){
        return transportistas.get(fila);
    }

}
