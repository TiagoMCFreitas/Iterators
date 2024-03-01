package com.iterator.persistencia;
import com.iterator.models.ColecaoDeObjetos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;

import com.iterator.models.Motorista;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
public class MotoristaPersistencia  {
    
    private String nomeDoArquivo;
    //Metodos
    public MotoristaPersistencia(String nome){
        nomeDoArquivo = nome;
    }
     private int quantidadePilotosArquivo() throws Exception {
        try {
            int quantidade = 0;
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                quantidade++;
            }
            br.close();
            return quantidade;
        } catch (Exception erro) {
            throw erro;
        }
    }
     
      public Iterator ListagemDePilotosVetor() throws Exception {
        try {
            int quantidade = this.quantidadePilotosArquivo();
            Motorista[] array = new Motorista[quantidade];
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while ((linha = br.readLine()) != null) {
                Motorista aux = new Motorista(linha);
                array[pos] = aux;
                pos++;
            }
            br.close();
            ColecaoDeObjetos aux = new ColecaoDeObjetos(array);
            return aux;
        } catch (Exception erro) {
            throw erro;
        }
    }
       public Iterator listagemDePilotosArrayList() throws Exception {
        try {
            ArrayList<Motorista> array = new ArrayList<Motorista>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while ((linha = br.readLine()) != null) {
                Motorista aux = new Motorista(linha);
                array.add(aux);
                pos++;
            }
            br.close();
            return array.iterator();
        } catch (Exception erro) {
            throw erro;
        }
    }
       public Iterator listagemDePilotosLinkedHashSet() throws Exception {
        try {
            LinkedHashSet<Motorista> set = new LinkedHashSet<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Motorista aux = new Motorista(linha);
                set.add(aux);
            }
            br.close();
            return set.iterator();
        } catch (Exception erro) {
            throw erro;
        }
    }
           public Iterator listagemDePilotosLinkedList() throws Exception {
           try{
               
            LinkedList<Motorista> linkedList = new LinkedList<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Motorista aux = new Motorista(linha);
                linkedList.add(aux);
            }
            br.close();
            return linkedList.iterator();

           }catch(Exception e ){
               throw  e;
           }
           }
    public Iterator listagemDePilotosDeque() throws Exception {
           try{
               
            Deque<Motorista> deque = new ArrayDeque<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Motorista aux = new Motorista(linha);
                deque.add(aux);
            }
            br.close();
            return deque.iterator();

           }catch(Exception e ){
               throw  e;
           }
    }
      
    public Iterator listagemDePilotosStack() throws Exception {
           try{
               
            Stack<Motorista> stack = new Stack<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Motorista aux = new Motorista(linha);
                stack.push(aux);
            }
            br.close();
            return stack.iterator();

           }catch(Exception e ){
               throw  e;
           }
    }public Iterator listagemDePilotosVector() throws Exception {
           try{
               
            Vector<Motorista> vector = new Vector<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Motorista aux = new Motorista(linha);
                vector.add(aux);
            }
            br.close();
            return vector.iterator();

           }catch(Exception e ){
               throw  e;
           }
    }

}
