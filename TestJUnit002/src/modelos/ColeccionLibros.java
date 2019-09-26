
package modelos;

import java.util.ArrayList;


public class ColeccionLibros {
    
    private ArrayList<Libro> libros;
    

    public ColeccionLibros(){
        this.libros=new ArrayList<Libro>();
    }
    
    public boolean Agregar(Libro libro){
        return this.libros.add(libro);
    }
    
    public boolean Eliminar(){
        return false;
    }
}
