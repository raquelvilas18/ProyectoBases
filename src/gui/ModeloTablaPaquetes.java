/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Empleado;
import aplicacion.Pedido;
import aplicacion.Paquete;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaPaquetes extends AbstractTableModel {

    private java.util.List<Paquete> paquetes;

    public ModeloTablaPaquetes() {
        this.paquetes = new java.util.ArrayList<>();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "pedido";
                break;
            case 1:
                nombre = "codigo";
                break;
            case 2:
                nombre = "alto";
                break;
            case 3:
                nombre = "ancho";
                break;
            case 4:
                nombre = "largo";
                break;
            case 5:
                nombre = "coste";
                break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col) {
            case 0:
                clase = java.lang.Integer.class;
                break;
            case 1:
                clase = java.lang.Integer.class;
                break;
            case 2:
                clase = java.lang.Float.class;
                break;
            case 3:
                clase = java.lang.Float.class;
                break;
            case 4:
                clase = java.lang.Float.class;
                break;
            case 5:
                clase = java.lang.Float.class;
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
                resultado = paquetes.get(row).getPedido();
                break;
            case 1:
                resultado = paquetes.get(row).getCodigo();
                break;
            case 2:
                resultado = paquetes.get(row).getAlto();
                break;
            case 3:
                resultado = paquetes.get(row).getAncho();
                break;
            case 4:
                resultado = paquetes.get(row).getLargo();
                break;
            case 5:
                resultado = paquetes.get(row).getCoste();
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
        return paquetes.size();
    }

    public void setFilas(java.util.List<Paquete> paquetes) {
        this.paquetes = paquetes;
        fireTableDataChanged();
    }

    public Paquete getFila(int row) {
        return paquetes.get(row);
    }

}
