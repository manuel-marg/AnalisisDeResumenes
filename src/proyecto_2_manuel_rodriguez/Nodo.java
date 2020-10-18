
package proyecto_2_manuel_rodriguez;

import java.io.*;

public class Nodo implements Serializable {

    private Object valor;

    private Nodo siguiente;

    public void Nodo(){
        this.valor = null;
        this.siguiente = null;
    }
    

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
}
