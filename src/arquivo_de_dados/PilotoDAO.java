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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 *
 * @author GrupoIntegrador
 */
public class PilotoDAO {


     public List<Piloto> ConsultarTodos() {
        BufferedReader br = null;
        List<Piloto> pilotos = new ArrayList<>();
        try {
           String sCurrentLine;

			br = new BufferedReader(new FileReader("C:/Users/kai/Desktop/DadosDosPilotosF1.csv"));
                      
			while ((sCurrentLine = br.readLine()) != null){
			Piloto p = new Piloto();
                        String [] vetor = sCurrentLine.split(",");
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

     
     
     public List<Piloto> ExibirLista(){
         List<Piloto> fila = new LinkedList<>();
         for(Piloto p :ConsultarTodos()){
             fila.add(p);
         }
         return fila;
     }
     
     
     public Stack ExibirListaPilha(){
         Stack pilha = new Stack();
         for(Piloto p:ConsultarTodos()){
             pilha.push(p);
         }
         return pilha;
     }

 public Iterator ConsultarTodosIterador() {
        BufferedReader br = null;
        List<Piloto> pilotos = new ArrayList<>();
        try {
           String sCurrentLine;

			br = new BufferedReader(new FileReader("C:/Users/kai/Desktop/DadosDosPilotosF1.csv"));
                      
			while ((sCurrentLine = br.readLine()) != null){
			Piloto p = new Piloto();
                        String [] vetor = sCurrentLine.split(",");
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

        return pilotos.iterator();
    }


     public Iterator ExibirListaIterador(){
         List<Piloto> fila = new LinkedList<>();
         for(Piloto p :ConsultarTodos()){
             fila.add(p);
         }
         return fila.iterator();
     }

     public Iterator ExibirListaPilhaIterator(){
         Stack pilha = new Stack();
         for(Piloto p:ConsultarTodos()){
             pilha.push(p);
         }
         return pilha.iterator();
     }



}

