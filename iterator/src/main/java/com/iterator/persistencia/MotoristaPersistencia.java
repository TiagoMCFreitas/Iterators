package com.iterator.persistencia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;

import com.iterator.models.Motorista;
public class MotoristaPersistencia  {
    
    private String nomeDoArquivo;
    //Metodos
    public MotoristaPersistencia(String nome){
        nomeDoArquivo = nome;
    }

    public Iterator listagemDeMotoristasHashMap()throws Exception{
        HashMap<Integer, Motorista> motoristas = new HashMap<Integer, Motorista>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br  = new BufferedReader(fr);
        String linha = "";
        while((linha=br.readLine())!=null){
                Motorista aux = new Motorista(linha);
                motoristas.put(aux.getId(),aux);
            }
        br.close();
        return motoristas.entrySet().iterator();
    }
}
