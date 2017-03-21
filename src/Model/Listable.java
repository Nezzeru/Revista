/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Nodo;
import java.io.FileNotFoundException;

/**
 *
 * @author teodora
 */
public interface Listable {

    /**
     * Verifica que la lista esta vacia
     * @return true si esta vacia, false de lo contrario
     */
    public boolean esVacia();

    /**
     * Añade un elemento a la lista
     * @param elemento elemento que se desea añadir
     */
    public void añadir(Object elemento);

    /**
     * Localiza un elemento en la lista
     *
     * @param elemento elemento que se desea localizar
     * @return devuelve un elemento ubicado en la lista
     */
    public int localizar(Object elemento);

    /**
     * Elimina un elemento de la lista
     *
     * @param elemento elemento que se desea eliminar
     */
    public void eliminar(Object elemento);

    /**
     * Verifica si la lista contiene un elemento
     *
     * @param elemento elemento que desea verificar
     * @return true si lo encuentra, false de lo contrario.
     */
    public boolean contiene(Object elemento);

    /**
     * Remplaza un elemento en la lista
     *
     * @param actual elemento actual que desea remplazar
     * @param nuevo nuevo elemento a remplazar
     */
    public void sustituir(Object actual, Object nuevo);

    /**
     * Iterador de la clase
     *
     * @return iterador
     */
    public java.util.Iterator iterador();

}
