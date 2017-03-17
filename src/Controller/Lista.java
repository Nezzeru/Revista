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

    /**
     * Verifica si la lista esta vacia
     */
    @Override
    public boolean esVacia() {
        return inicio == null && fin == null && actual == null;

    }

    /**
     * Añade un nuevo elemento a la lista
     *
     * @param elemento elemento que se desea añadir
     */
    @Override
    public void añadir(Object elemento) {

        inicio = new Nodo(inicio, elemento);
        actual = inicio;
        if (inicio.getSiguiente() == null) {
            fin = inicio;
        } else {
            inicio.getSiguiente().setAnterior(inicio);
        }

        System.out.println(elemento);
    }

    /**
     * Localiza un elemento en la lista
     *
     * @param elemento que se dea encontrar
     * @return devuelve un elemento ubicado en la lista
     *
     */
    @Override
    public int localizar(Object elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
     /** Elimina un elemento de la lista
     *
     * @param elemento elemento que se desea eliminar
     */

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

    
    /**
     * Verifica si la lista contiene un elemento
     *
     * @param elemento elemento que desea verificar
     * @return true si lo encuentra, false de lo contrario.
     */

    @Override
    public boolean contiene(Object elemento) {

        Nodo posicion = null;
        while (posicion != null && !posicion.getElemento().equals(elemento)) {
            posicion.getSiguiente();
        }
        return posicion != null;
    }

       /**
     * Remplaza un elemento en la lista
     *
     * @param actual elemento actual que desea remplazar
     * @param nuevo nuevo elemento a remplazar
     */
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

     /**
     * Iterador de la clase
     *
     * @return iterador
     */
    @Override
    public Iterator iterador() {
        return new MiIterador();
    }

    public void circular() {
        fin.setSiguiente(inicio);
        inicio.setSiguiente(fin);

    }

    /*
   * Clase privada que implementa el iterador
     */
    private class MiIterador implements java.util.Iterator {

        private Nodo posicion = inicio;

        /**
         * Verifica que el nodo tenga siguiente
         * @return false de lo contrario
         */
        public boolean hasNext() {
            return posicion != null;
        }

        /**
         * Obtiene el siguiente elemento
         * @return 
         */
        public Object next() {
            if (hasNext()) {
                Object o = posicion.getElemento();
                posicion = posicion.getSiguiente();
                return o;
            }
            return null;
        }

        /**
         * Elimina
         */
        public void remove() {
            throw new IllegalStateException();
        }
    }
}
