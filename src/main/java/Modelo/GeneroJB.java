package Modelo;
import java.io.Serializable;

public class GeneroJB implements Serializable {
    private int id_genero;
    private String nombre_genero;
    
    public GeneroJB(){
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getNombre_genero() {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }
    
}