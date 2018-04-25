package Model;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class NewTableModel extends AbstractTableModel {

    private ArrayList linhas = null;

    private String[] colunas = null;

    public NewTableModel(ArrayList linhas, String[] colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
    }
    
    public String[] getColunas() {
        return colunas;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setColunas(String[] strings) {
        colunas = strings;
    }

    public void setLinhas(ArrayList list) {
        linhas = list;
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Object[] linha = (Object[]) linhas.get(rowIndex);

        return linha[columnIndex];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int colIndex) {

        Object[] linha = (Object[]) linhas.get(rowIndex);

        linha[colIndex] = (String) value;

        fireTableCellUpdated(rowIndex, colIndex);
    }

    public void addRow(String[] dadosDaLinha) {
        linhas.add(dadosDaLinha);

        int linha = linhas.size() - 1;
        fireTableRowsInserted(linha, linha);
    }

    public void removeRow(int rowIndex) {
        linhas.remove(rowIndex);

        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public boolean removeRow(String valor, int colIndex) {
        boolean operacaoBemSucedida = false;
        Iterator i = linhas.iterator();
        int linha = 0;

        while (i.hasNext()) {

            String[] linhaCorrente = (String[]) i.next();
            linha++;

            if (linhaCorrente[colIndex].trim().equals(valor.trim())) {
                linhas.remove(linha);

                fireTableRowsDeleted(linha, linha);
                operacaoBemSucedida = true;
            }
        }
        return operacaoBemSucedida;
    }

    @Override
    public String getColumnName(int colIndex) {
        return colunas[colIndex];
    }
}
