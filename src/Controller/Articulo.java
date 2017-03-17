/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.ImageIcon;

/**
 *
 * @author teodora
 */
public class Articulo {

    private String titulo;
    private String cuerpo;
    private String ruta;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Articulo(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
       ruta = null;
       
        
    }

   

}
