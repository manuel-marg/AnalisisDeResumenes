
package proyecto_2_manuel_rodriguez;

import java.io.*;


public class Lista implements Serializable {
    
    public Nodo primero;
    public int tamano;
    
    public void Lista(){
        primero = null;
        tamano = 0;
    }
    
    public boolean esVacia(){
        return primero == null;
    }
    
    public int getTamano(){
        return tamano;
    }
    
    public void agregarAlFinal(Object valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            primero = nuevo;
        } else{
            Nodo aux = primero;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamano++;
    }

    
    public Object getValor(int posicion) throws Exception{
        if(posicion>=0 && posicion<tamano){
            if (posicion == 0) {
                return primero.getValor();
            }else{
                Nodo aux = primero;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getValor();
            }
        } else {
            throw new Exception("Error.");
        }
    }
    
    public boolean buscar(Object referencia){
        Nodo aux = primero;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if (referencia == aux.getValor()){
                encontrado = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }

    
    public void eliminar(){
        primero = null;
        tamano = 0;
    }
    
    
    
}