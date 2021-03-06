/**
 * Paquete en donde se encuentra el controlador
 */
package Controller;

import java.io.Serializable;

/**
 * Controlador de los articulos
 * @author teodora
 */
public class Articulo implements Serializable{

    private String titulo;
    private String cuerpo;
    private String ruta;

    /**
     * Obtiene el titulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Asigna el titulo
     * @param titulo titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el cuerpo
     * @return cuerpo
     */
    public String getCuerpo() {
        return cuerpo;
    }
    /**
     * Asigna el cuerpo
     * @param cuerpo cuerpo
     */
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
/**
 * Obtiene la ruta
 * @return ruta
 */
    public String getRuta() {
        return ruta;
    }
/**
 * Asigna la ruta
 * @param ruta ruta
 */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
/**
 * Constructor
 * @param titulo titulo del articulo
 * @param cuerpo cuerpo del aritculo
 */
    public Articulo(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
       ruta = null;
       
        
    }

   

}
