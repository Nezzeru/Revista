package Controller;

public class Nodo {

    private Nodo siguiente;
    private Object elemento;
    private Nodo anterior;

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the elemento
     */
    public Object getElemento() {
        return elemento;
    }

    /**
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
     * @param siguiente
     * @param elemento
     */
    public Nodo(Nodo siguiente, Object elemento) {
        this.siguiente = siguiente;
        this.elemento = elemento;
    }

  

}
