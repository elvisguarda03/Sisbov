/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisbov.domain.entity;

import javax.swing.table.AbstractTableModel;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author User
 */
public class AnimalTM extends AbstractTableModel{
    private List<String[]> linhas;
    private String[] colunas = new String[]{"Brinco","Raca","Peso","Sexo","Tipo Animal","Fazenda","Vacinas"};
    
    public AnimalTM() {
        linhas = new LinkedList<String[]>();
    }
    
    public AnimalTM(List<String[]> lista) {
        linhas = new LinkedList<String[]>(lista);
    }
    
    @Override
    public int getColumnCount() {        
        return colunas.length;
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String t[] = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return t[0];
            case 1:
                return t[1];
            case 2:
                return t[2];
            case 3:
                return t[3];
            case 4:
                return t[4];
            case 5:
                return t[5];
            case 6:
                return t[6];
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        String t[] = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            case 0:
                t[0] = aValue.toString();
                break;
            case 1:
                t[1] = aValue.toString();
                break;
                
            case 2:
                t[2] = aValue.toString();
                break;
            case 3:
                t[3] = aValue.toString();
                break;
            case 4:
                t[4] = aValue.toString();
                break;
            case 5:
                t[5] = aValue.toString();
                break;
            case 6:
                t[6] = aValue.toString();
                break;
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(String aValue[], int rowIndex) {
        String t[] = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        t[0] = aValue[0];
        t[1] = aValue[1];
        t[2] = aValue[2];
        t[3] = aValue[3];
        t[4] = aValue[4];
        t[5] = aValue[5];
        t[6] = aValue[6];
     
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public String[] getAnimal(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addAnimal(String a[]) {
        // Adiciona o registro.
        linhas.add(a);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     /* Remove a linha especificada. */
    public void remove(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addLista(List<String[]> a) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.
        linhas.addAll(a);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }   

  
}
