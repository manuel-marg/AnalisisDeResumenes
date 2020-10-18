
package proyecto_2_manuel_rodriguez;

import java.io.*;

public class Autor implements Serializable {
    
    private String Nombre;

    public Autor(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public Autor() {
        this.Nombre = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
}
