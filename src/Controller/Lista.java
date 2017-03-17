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
public class Lista implements Listable, Serializable {

    private Nodo inicio;
    private Nodo fin;
    private Nodo actual;

    @Override
    public boolean esVacia() {
        return inicio == null && fin == null && actual == null;

    }

    @Override
    public void añadir(Object elemento) {
        if (!esVacia()) {
            inicio = new Nodo(inicio, elemento);
            actual = inicio;
            if (inicio.getSiguiente() == null) {
                fin = inicio;
            } else {
                inicio.getSiguiente().setAnterior(inicio);
            }
        }

    }

    @Override
    public int localizar(Object elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void eliminar(Object elemento) {
        Nodo posicion = inicio;
        while (posicion != null && !posicion.getElemento().equals(elemento)) {
            posicion = posicion.getSiguiente();

        }

        if (posicion != null) {
            posicion.setElemento(null);

        }

    }

    @Override
    public boolean contiene(Object elemento) {

        Nodo posicion = null;
        while (posicion != null && !posicion.getElemento().equals(elemento)) {
            posicion.getSiguiente();
        }
        return posicion != null;
    }

    @Override
    public void sustituir(Object actual, Object nuevo) {
        Nodo posicion = inicio;
        if (!esVacia()) {
            if (posicion.getElemento() != null && !actual.equals(nuevo)) {
                posicion.getSiguiente();
            }
            if (posicion != null) {
                posicion.setElemento(nuevo);
            }
        }
    }

    @Override
    public Iterator contador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vaciar() {
        inicio = null;
        fin = null;
        actual = null;
    }

    @Override
    public boolean haySiguiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class contador implements java.util.Iterator {

        Nodo posicion = actual;

        @Override
        public boolean hasNext() {
            return !posicion.getSiguiente().equals(null);
        }

        @Override
        public Object next() {
            if (hasNext()) {
                Object elemento = posicion.getElemento();
                posicion = posicion.getSiguiente();
                return elemento;
            }
            return null;
        }
    }

}
