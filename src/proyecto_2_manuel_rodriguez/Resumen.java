
package proyecto_2_manuel_rodriguez;

import java.io.*;

public class Resumen implements Serializable {
    public String titulo;
    public Lista autores;
    public String cuerpo;
    public Lista palabras;

    public Resumen(String titulo, Lista autores, String cuerpo, Lista palabras) {
        this.titulo = titulo;
        this.autores = autores;
        this.cuerpo = cuerpo;
        this.palabras = palabras;
    }
    
    public Resumen() {
        this.titulo = null;
        this.autores = null;
        this.cuerpo = null;
        this.palabras = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Lista getAutores() {
        return autores;
    }

    public void setAutores(Lista autores) {
        this.autores = autores;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Lista getPalabras() {
        return palabras;
    }

    public void setPalabras(Lista palabras) {
        this.palabras = palabras;
    }
    
    
    
}
