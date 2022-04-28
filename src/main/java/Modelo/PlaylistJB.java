package Modelo;
import java.io.Serializable;

public class PlaylistJB implements Serializable {
    private int id_playlist;
    private String nombre;
    private String link_c;

    public PlaylistJB(){
    }

    //Insertar
    public PlaylistJB(String nombre, String link_c){
        this.nombre=nombre;
        this.link_c=link_c;
    }

    //Eliminar
    public PlaylistJB(int id_playlist){
        this.id_playlist = id_playlist;
    }

    //Modificar
    public PlaylistJB(int id_playlist, String nombre, String link_c){
        this.id_playlist=id_playlist;
        this.nombre=nombre;
        this.link_c=link_c;
    }

    public void setId_playlist(int id_playlist) {
        this.id_playlist = id_playlist;
    }
    public int getId_playlist() {
        return id_playlist;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setLink_c(String link_c) {
        this.link_c = link_c;
    }
    public String getLink_c() {
        return link_c;
    }

}
