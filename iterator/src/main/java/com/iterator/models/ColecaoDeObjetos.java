package com.iterator.models;
import com.iterator.models.Motorista;
import java.util.Iterator;

public class ColecaoDeObjetos implements Iterator {
    Motorista[] array = null;
    int pos = 0;
    public ColecaoDeObjetos(Motorista[] array) throws Exception{
        if(array == null) throw new Exception("Colecao nao enviada");
        this.array = array;
        pos=0;
    }
    @Override
    public boolean hasNext() {
        if(pos==array.length) return false;
        return true;
    }

    @Override
    public Object next() {
        return array[pos++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}