package com.iterator;

import java.util.*;

import com.iterator.models.Motorista;
import com.iterator.persistencia.MotoristaPersistencia;

public class Main {
    public static void main(String[] args) {
        MotoristaPersistencia motorista = new MotoristaPersistencia("c:/Users/Lenovo/Desktop/IteratorProject/iterator/src/main/java/com/iterator/persistencia/motoristas.csv");      
        try {
            Iterator conjunto = motorista.listagemDeMotoristasHashMap();
            
            while (conjunto.hasNext()) {
                Map.Entry<Integer, Motorista> aux = (Map.Entry<Integer, Motorista>) conjunto.next();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }

}

