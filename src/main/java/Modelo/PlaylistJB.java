package Modelo;
import java.io.Serializable;

public class PlaylistJB implements Serializable {
    private int id_playlist;
    private String nom_play;
    private String link_c;

    public PlaylistJB(){
    }

    //Insertar
    public PlaylistJB(String nom_play, String link_c){
        this.nom_play = nom_play;
        this.link_c = link_c;
    }

    //Eliminar
    public PlaylistJB(int id_playlist){
        this.id_playlist = id_playlist;
    }

    //Modificar
    public PlaylistJB(int id_playlist, String nom_play, String link_c){
        this.id_playlist=id_playlist;
        this.nom_play=nom_play;
        this.link_c=link_c;
    }

    public void setId_playlist(int id_playlist) {
        this.id_playlist = id_playlist;
    }
    public int getId_playlist() {
        return id_playlist;
    }

    public void setNom_play(String nom_play) {
        this.nom_play = nom_play;
    }
    public String getNom_play() {
        return nom_play;
    }

    public void setLink_c(String link_c) {
        this.link_c = link_c;
    }
    public String getLink_c() {
        return link_c;
    }

}
