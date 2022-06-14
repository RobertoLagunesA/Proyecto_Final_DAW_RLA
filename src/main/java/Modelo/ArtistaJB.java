package Modelo;
import java.io.Serializable;

public class ArtistaJB implements Serializable {
    private int id_artista;
    private String nombre_artista;

    public ArtistaJB(){
    }

    //Insertar
    public ArtistaJB(String nombre_artista){
        this.nombre_artista=nombre_artista;
    }
    //Eliminar
    public ArtistaJB(int id_artista){
        this.id_artista = id_artista;
    }

    //Modificar
    public ArtistaJB (int id_artista, String nombre_artista){
        this.id_artista=id_artista;
        this.nombre_artista=nombre_artista;
    }

        public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }
    public int getId_artista() {
        return id_artista;
    }

    public void setNombre_artista(String nombre_artista) {
        this.nombre_artista = nombre_artista;
    }
    public String getNombre_artista() {
        return nombre_artista;
    }
}

