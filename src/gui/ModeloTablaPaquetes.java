/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Paquete;
import aplicacion.Vehiculo;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaPaquetes extends AbstractTableModel {
    private java.util.List<Paquete> paquetes;
    private java.util.List<String> coches;
    
    public ModeloTablaPaquetes()
    {
        this.paquetes=new java.util.ArrayList<>();
        this.coches=new java.util.ArrayList<>();
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Pedido"; break;
            case 1: nombre="Codigo";break;
            case 2: nombre="Peso";break;
            case 3: nombre="Direccion";break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.Integer.class; break;
            case 1: clase=java.lang.Integer.class;break;
            case 2: clase=java.lang.Integer.class;break;
            case 3: clase= java.lang.String.class; break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public Object getValueAt(int row, int col){
        Object resultado=null;

        switch (col){
            case 0: resultado= paquetes.get(row).getPedido(); break;
            case 1: resultado= paquetes.get(row).getCodigo(); break;
            case 2: resultado= paquetes.get(row).getPeso(); break;
            case 3: resultado= coches.get(row); break;
        }
        return resultado;
    }

    @Override
      public int getColumnCount (){
        return 4;
    }

    @Override
    public int getRowCount(){
        return paquetes.size();
    }
    
    public void setFilas(java.util.List<Paquete> paquetes, java.util.List<String> coches){
        this.paquetes=paquetes;
        this.coches=coches;
        fireTableDataChanged();
    }
}