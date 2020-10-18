package proyecto_2_manuel_rodriguez;

public class TablaHash {
    
    private static class ListaNodo {
        int key;
        Object valor;
        ListaNodo siguiente;  
    }
    
    private ListaNodo[] tabla;  
    private int contador;  
    
    public TablaHash() {
        tabla = new ListaNodo[64];
    }
     
    public void put(int key, Object valor) { 
        int espacio = hash(key); 
        ListaNodo lista = tabla[espacio]; 
        while (lista != null) {
            if (lista.key == key) {
                break;
            }
            lista = lista.siguiente;
        }
        if (lista != null) {
            lista.valor = valor;
        } else {
            if (contador >= 0.75 * tabla.length) {
                cambiarTamano();
                espacio = hash(key);  
            }
            ListaNodo nuevoNodo = new ListaNodo();
            nuevoNodo.key = key;
            nuevoNodo.valor = valor;
            nuevoNodo.siguiente = tabla[espacio];
            tabla[espacio] = nuevoNodo;
            contador++;            
        }
    }
    
    public Object get(int key) {
        int espacio = hash(key);  
        ListaNodo lista = tabla[espacio];  
        while (lista != null) {
            if (lista.key == key) {
                return lista.valor;
            }
            lista = lista.siguiente;  
        }
        return null;        
    }
    
    public boolean containsKey(int key) {
        int espacio = hash(key);  
        ListaNodo lista = tabla[espacio];        
        while (lista != null) {
            if (lista.key == key) {
                return true;
            }
            lista = lista.siguiente;
        }
        return false;
    }

    private int hash(Object key) {
        return (Math.abs(key.hashCode())) % tabla.length;
    }
    
    private void cambiarTamano() {
        ListaNodo[] nuevaTabla = new ListaNodo[tabla.length * 2];
        for (int i = 0; i < tabla.length; i++) {
            ListaNodo lista = tabla[i]; 
            while (lista != null) {
                ListaNodo auxSiguiente = lista.siguiente;                
                int hash = (Math.abs(lista.hashCode())) % nuevaTabla.length;
                lista.siguiente = nuevaTabla[hash];
                nuevaTabla[hash] = lista;
                lista = auxSiguiente;                
            }
        }
        tabla = nuevaTabla;        
    }    
    
}
