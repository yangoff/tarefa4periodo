/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo_de_dados;

/**
 *
 * @author kai
 */
//import Util.ConexaoDB;
import clase_de_dados.Piloto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Queue;

/**
 *
 * @author GrupoIntegrador
 */
public class PilotoDAO implements Iterator<Piloto> {

    private ArrayList<Piloto> pilotos = new ArrayList<>();

    public ArrayList<Piloto> ConsultarTodos() {
        BufferedReader br = null;
        ArrayList<Piloto> pilotos = new ArrayList<>();
        try {
            String sCurrentLine;

            br = new BufferedReader(new FileReader("C:/Users/kai/Desktop/DadosDosPilotosF1.csv"));

            while ((sCurrentLine = br.readLine()) != null) {
                Piloto p = new Piloto();
                String[] vetor = sCurrentLine.split(",");
                p.setCodigo(Integer.parseInt(vetor[0]));
                p.setNome(vetor[1]);
                p.setPais(vetor[2]);
                p.setIdade(Integer.parseInt(vetor[3]));
                p.setEquipe(vetor[4]);
                p.setMotor(vetor[5]);
                p.setPontos(Integer.parseInt(vetor[6]));
                pilotos.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pilotos;
    }

    public List<Piloto> ExibirLista() {
        List<Piloto> fila = new LinkedList<>();
        for (Piloto p : ConsultarTodos()) {
            fila.add(p);
        }
        return fila;
    }

    public Stack ExibirListaPilha() {
        Stack pilha = new Stack();
        for (Piloto p : ConsultarTodos()) {
            pilha.push(p);
        }
        return pilha;
    }

    public Iterator ConsultarTodosIterador() throws Exception {
        BufferedReader br = null;
        ArrayList<Piloto> pilotos = new ArrayList<>();
        try {
            String sCurrentLine;

            br = new BufferedReader(new FileReader("C:/Users/kai/Desktop/DadosDosPilotosF1.csv"));

            while ((sCurrentLine = br.readLine()) != null) {
                Piloto p = new Piloto();
                String[] vetor = sCurrentLine.split(",");
                p.setCodigo(Integer.parseInt(vetor[0]));
                p.setNome(vetor[1]);
                p.setPais(vetor[2]);
                p.setIdade(Integer.parseInt(vetor[3]));
                p.setEquipe(vetor[4]);
                p.setMotor(vetor[5]);
                p.setPontos(Integer.parseInt(vetor[6]));
                pilotos.add(p);
            }
            pilotos = bubbleSort(pilotos);

            return pilotos.iterator();
        } catch (Exception e) {
            throw new Exception("erro:" + e);
        }

    }

    public Iterator ExibirFilaIterador() {
        Queue<Piloto> fila = new LinkedList<>();

        for (Piloto p : ConsultarTodos()) {
            fila.add(p);
        }
        return fila.iterator();
    }

    public Iterator ExibirListaPilhaIterator() {
        Stack pilha = new Stack();
        for (Piloto p : ConsultarTodos()) {
            pilha.push(p);
        }
        return pilha.iterator();
    }

    public Iterator ExibirSetIterator() {

        Set<Piloto> set = new HashSet<>();
        for (Piloto p : ConsultarTodos()) {
            set.add(p);
        }
        return set.iterator();
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Piloto next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Piloto> bubbleSort(ArrayList<Piloto> pilotos) {
    
        for (int i = 0; i < pilotos.size()-1; i++) {
            for (int j = 0; j < pilotos.size()-i-1; j++) {
                if(pilotos.get(j).getNome().compareTo(pilotos.get(j+1).getNome())>0){
                Piloto temp = pilotos.get(j);
                pilotos.set(j, pilotos.get(j+1));
                pilotos.set(j+1, temp);
                   
            }
            }
        }
    return pilotos;
    }

    
}