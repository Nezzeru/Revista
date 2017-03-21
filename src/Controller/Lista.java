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
 * Base para la lista donde se almacenaran los articulos
 * @author teodora
 */
public class Lista implements Listable, Serializable {

    private Nodo inicio;
    private Nodo fin;
    private Nodo actual;
    private int contador = 0;

    /**
     * Verifica si la lista esta vacia
     */
    @Override
    public boolean esVacia() {
        return inicio == null && fin == null && actual == null;

    }

    /**
     * Añade un nuevo elemento a la lista
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

        contador++;
        inicio.setPosicion(contador);
    }

    /**
     * Localiza un elemento en la lista
     * @param elemento que se dea encontrar
     * @return devuelve un elemento ubicado en la lista
     *
     */
    @Override
    public int localizar(Object elemento) {
        int posicion = contador;

        if (!esVacia() && !inicio.getElemento().equals(elemento)) {
            inicio = inicio.getSiguiente();
        }
        return inicio.getPosicion();
    }

    /**
     * Localiza un elemento en la lista
     * @param posicion posicion del elemento
     * @return posicion
     * @throws NullPointerException excepcion vacia
     */
    public Object localizarPosicion(int posicion) throws NullPointerException {

        if (!esVacia()) {
            while (inicio.getElemento() != null && inicio.getPosicion() != posicion) {
                inicio = inicio.getSiguiente();
            }
            return inicio.getElemento();
        } else {
            throw new NullPointerException("No se ha encontrado el articulo");
        }
    }

    /**
     * Asigna el Nodo anterior como actual
     */
    public void setAnterior() {
        if (actual != null) {
            if (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            if (fin.getSiguiente() == null) {
                fin.setSiguiente(inicio);
               
            }
        }
    }
/**
 * Asigna el nodo siguiente como actual
 */
    public void setSiguiente() {
        if (actual != null) {
            if (actual.getAnterior() != null) {
                actual = actual.getAnterior();
            }
            if (inicio.getAnterior() == null) {
                inicio.setAnterior(fin);
            }
        }
    }
/**
 * Devuelve la posicion actual del nodo
 * @return posicion del nodo que desea encontrar
 */
    public int posicionActual() {
        if (esVacia()) {
            return 0;
        }
        return actual.getPosicion();
    }

    public Object elementoActual() {

        return actual.getElemento();

    }
/**
 * Elimina un elemento del nodo
 * @param elemento elemento a eliminar
 */
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

    /*
   * Clase privada que implementa el iterador
     */
    private class MiIterador implements java.util.Iterator {

        private Nodo posicion = inicio;

        public Nodo getPosicion() {
            return posicion;

        }

        /**
         * Verifica que el nodo tenga siguiente
         *
         * @return false de lo contrario
         */
        public boolean hasNext() {
            return posicion != null;
        }

        /**
         * Obtiene el elemento anterior
         *
         * @return
         */
        /**
         * Obtiene el siguiente elemento
         *
         * @return
         */
        @Override
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
        public Object last() {
            if (hasNext()) {
                Object o = posicion.getAnterior();
                posicion = posicion.getAnterior();

                return o;
            }
            return null;
        }
    }
}
