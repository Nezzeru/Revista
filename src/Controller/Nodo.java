package Controller;

import java.io.Serializable;

/**
 * Clase esencial para el nodo
 *
 * @author teodora
 */
public class Nodo implements  Serializable{

    private Nodo siguiente;
    private Object elemento;
    private Nodo anterior;
    private int posicion = 0;

    /**
     * Deviele la posicion del nodo
     *
     * @return posicion del nodo
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * Asigna la posicion del nodos
     *
     * @param posicion posicion a asignar
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     * Obtiene el siguiente nodo
     *
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Asigna el siguiente nodo
     *
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Obtiene el elemento del nodo
     *
     * @return the elemento2
     */
    public Object getElemento() {
        return elemento;
    }

    /**
     * Asigna el elemento del nodo
     *
     * @param elemento the elemento to set
     */
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * *
     * Devuelve el nodo anterior
     *
     * @return nodo anterior
     */
    public Nodo getAnterior() {

        return anterior;
    }

    /**
     * Asigna el nodo anterior
     *
     * @param anterior nodo anterior
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    /**
     * Constructor de los nodos
     *
     * @param siguiente nodo siguiente
     * @param elemento elemento que apunta el nodo
     */
    public Nodo(Nodo siguiente, Object elemento) {
        this.siguiente = siguiente;
        this.elemento = elemento;
    }

}
