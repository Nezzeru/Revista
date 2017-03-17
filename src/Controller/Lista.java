/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Listable;
import java.io.Serializable;
import java.util.Iterator;

/**
 *
 * @author teodora
 */
public class Lista implements Listable,Serializable{

    private Nodo inicio;
    private Nodo fin;
    private Nodo actual;

    @Override
    public boolean esVacia() {
        return inicio == null && fin == null && actual == null;

    }

    @Override
    public void añadir() {
        if (!esVacia()) {
            
        }
        
    }

    @Override
    public int localizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Object elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contiene(Object elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sustituir(Object actual, Object nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator contador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
