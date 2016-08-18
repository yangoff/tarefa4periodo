/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_de_dados;

import java.util.Iterator;

/**
 *
 * @author eugeniojulio
 */
public class ColecaoDeObjetos implements Iterator {
    Piloto[] array = null;
    int pos = 0;
    public ColecaoDeObjetos(Piloto[] array) throws Exception{
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
