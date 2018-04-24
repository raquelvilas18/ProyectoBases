/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.table.AbstractTableModel;
import aplicacion.Pedido;
/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaPedidos extends AbstractTableModel {
    private java.util.List<Pedido> pedidos;
    
    public ModeloTablaPedidos()
    {
         this.pedidos=new java.util.ArrayList<>();
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Fecha"; break;
            case 1: nombre="Codigo";break;
            case 2: nombre="Express";break;
            case 3: nombre="Direccion";break;
            case 4: nombre="Destinatario";break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase=java.lang.Integer.class;break;
            case 2: clase=java.lang.Boolean.class;break;
            case 3: clase= java.lang.String.class; break;
            case 4: clase= java.lang.String.class; break;
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
            case 0: resultado= pedidos.get(row).getFecha(); break;
            case 1: resultado= pedidos.get(row).getCodigo(); break;
            case 2: resultado= pedidos.get(row).isExpress(); break;
            case 3: resultado= pedidos.get(row).getDireccion(); break;
            case 4: resultado= pedidos.get(row).getDestinatario(); break;
        }
        return resultado;
    }

    @Override
      public int getColumnCount (){
        return 5;
    }

    @Override
    public int getRowCount(){
        return pedidos.size();
    }
    
    public void setFilas(java.util.List<Pedido> pedidos){
        this.pedidos=pedidos;
        fireTableDataChanged();
    }
    
    public Pedido getFila(int row){
        return pedidos.get(row);
    }
    
}
