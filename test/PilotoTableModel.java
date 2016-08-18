/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import clase_de_dados.Piloto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PilotoTableModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    /* Lista de Piloto que representam as linhas. */

    private List<Piloto> linhas;
    /* Array de Strings com o nome das colunas. */

    private String[] colunas = new String[]{
        //---------"Nome", "Endereço", "Telefone"};
          "Codigo", "Nome", "Pais","Idade","Equipe","Motor","Pontos"};
          
            private ArrayList<Piloto> piloto;
    private final int COLUNA_CODIGO = 0;
    private final int COLUNA_NOME = 1;
    private final int COLUNA_PAIS = 2;
    private final int COLUNA_IDADE = 3;
    private final int COLUNA_EQUIPE = 4;
    private final int COLUNA_MOTOR = 5;
    private final int COLUNA_PONTOS = 6;
    
    public PilotoTableModel(ArrayList<Piloto> piloto) {
        this.piloto = piloto;
    }
            
    
    
    /* Cria um PilotoTableModel vazio. */

    public PilotoTableModel() {
        linhas = new ArrayList<Piloto>();
    }

    /* Cria um PilotoTableModel carregado com
     * a lista de Piloto especificada. */
    public PilotoTableModel(List<Piloto> listaDePiloto) {
        linhas = new ArrayList<Piloto>(listaDePiloto);
    }

    /* Retorna a quantidade de colunas. */
    @Override
    public int getColumnCount() {
        // EstÃ¡ retornando o tamanho do array "colunas".
        return colunas.length;
    }

    /* Retorna a quantidade de linhas. */
    @Override
    public int getRowCount() {
        // Retorna o tamanho da lista de Piloto.
        return linhas.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        // Retorna o conteÃºdo do Array que possui o nome das colunas
        return colunas[columnIndex];
    }

    ;
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    ;
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Piloto piloto = linhas.get(rowIndex);
        // Retorna o campo referente a coluna especificada.
        // Aqui é feito um switch para verificar qual é a coluna
        // e retornar o campo adequado. As colunas sãoas mesmas
        // que foram especificadas no array "colunas".
        switch (columnIndex) {
            // Seguindo o exemplo: "Tipo","Data de Cadastro", "Nome", "Idade"};
            case 0:
                return piloto.getCodigo();
            case 1:
                return piloto.getNome();
            case 2:
                return piloto.getPais();
            case 3:
                return piloto.getIdade();
            case 4:
                return piloto.getEquipe();
            case 5:
                return piloto.getMotor();
            case 6:
                return piloto.getPontos();
            default:
                // Isto não deveria acontecer...
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Piloto piloto = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        switch (columnIndex) { // Seta o valor do campo respectivo
            
            case 0:
                piloto.setCodigo(Integer.parseInt(aValue.toString()));
            case 1:
                piloto.setNome(aValue.toString());
            case 2:
                piloto.setPais((aValue.toString()));
            case 3:
                piloto.setIdade(Integer.parseInt(aValue.toString()));
            case 4:
                piloto.setEquipe((aValue.toString()));
            case 5:
                piloto.setMotor((aValue.toString()));
            case 6:
                piloto.setPontos(Integer.parseInt(aValue.toString()));
      
            
            default:
            // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    //modifica na linha especificada
    public void setValueAt(Piloto aValue, int rowIndex) {
        Piloto produto = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        produto.setCodigo(aValue.getCodigo());
        produto.setNome(aValue.getNome());
        produto.setPais(aValue.getPais());
        produto.setIdade(aValue.getIdade());
        produto.setEquipe(aValue.getEquipe());
        produto.setMotor(aValue.getMotor());
        produto.setPontos(aValue.getPontos());

        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
        
        
    }

    ;
    ;
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public Piloto getPiloto(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

    /* Adiciona um registro. */
    public void addPiloto(Piloto m) {
        // Adiciona o registro.
        linhas.add(m);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /* Remove a linha especificada. */
    public void removePiloto(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Piloto ao final dos registros. */
    public void addListaDePiloto(List<Piloto> piloto) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();
        // Adiciona os registros.
        linhas.addAll(piloto);
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
