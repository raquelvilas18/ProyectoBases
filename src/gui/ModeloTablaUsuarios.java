/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Empleado;
import aplicacion.Usuario;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaUsuarios extends AbstractTableModel {

    private java.util.List<Usuario> usuarios;

    public ModeloTablaUsuarios() {
        this.usuarios = new java.util.ArrayList<>();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Id";
                break;
            case 1:
                nombre = "Nombre";
                break;
            case 2:
                nombre = "Direccion";
                break;
            case 3:
                nombre = "Sexo";
                break;
            case 4:
                nombre = "Tipo";
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
                resultado = usuarios.get(row).getUsuario();
                break;
            case 1:
                resultado = usuarios.get(row).getNombre();
                break;
            case 2:
                resultado = usuarios.get(row).getDireccion();
                break;
            case 3:
                resultado = usuarios.get(row).getSexo();
                break;
            case 4:
                resultado = usuarios.get(row).getTipo();
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
        return usuarios.size();
    }

    public void setFilas(java.util.List<Usuario> usuarios) {
        this.usuarios = usuarios;
        fireTableDataChanged();
    }
    
    public Usuario getFila(int fila){
        return usuarios.get(fila);
    }

}
