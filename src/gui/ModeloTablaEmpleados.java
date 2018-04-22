/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.table.AbstractTableModel;
import aplicacion.Empleado;
import aplicacion.Usuario;
/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaEmpleados extends AbstractTableModel {
    private java.util.List<Empleado> empleados;
    
    public ModeloTablaEmpleados()
    {
         this.empleados=new java.util.ArrayList<>();
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Id"; break;
            case 1: nombre="Nombre";break;
            case 2: nombre="Administrador";break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase=java.lang.String.class;break;
            case 2: clase=java.lang.Boolean.class;break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public Object getValueAt(int row, int col){
        Object resultado=null;
        switch(col){
            case 0: resultado=empleados.get(row).getUsuario();break;
            case 1: resultado=empleados.get(row).getNombre();break;
            case 2: resultado=empleados.get(row).getAdministrador();break;
        }
        return resultado;
    }

    @Override
      public int getColumnCount (){
        return 3;
    }

    @Override
    public int getRowCount(){
        return empleados.size();
    }
    
    public void setFilas(java.util.List<Empleado> empleados){
        this.empleados=empleados;
        fireTableDataChanged();
    }
    public Empleado getFila(int fila){
        if(empleados.isEmpty()){
            return null;
        }
        return empleados.get(fila);
    }
    
}
