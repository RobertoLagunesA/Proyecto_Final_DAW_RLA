package Modelo;
import java.io.Serializable;

public class CancionesJB implements Serializable {
    private int id_canciones;
    private String cancion_popular;
    private String cancion_favorita;

    public CancionesJB(){
    }

    //Insertar
    public CancionesJB(String cancion_popular, String cancion_favorita){
        this.cancion_popular=cancion_popular;
        this.cancion_favorita=cancion_favorita;
    }
    //Eliminar
    public CancionesJB(int id_canciones){
        this.id_canciones = id_canciones;
    }

    //Modificar
    public CancionesJB (int id_canciones, String cancion_popular, String cancion_favorita){
        this.id_canciones=id_canciones;
        this.cancion_popular=cancion_popular;
        this.cancion_favorita=cancion_favorita;
    }

    public void setId_canciones(int id_canciones) {
        this.id_canciones = id_canciones;
    }
    public int getId_canciones() {
        return id_canciones;
    }

    public void setCancion_popular(String cancion_popular) {
        this.cancion_popular = cancion_popular;
    }
    public String getCancion_popular() {
        return cancion_popular;
    }

    public void setCancion_favorita(String cancion_favorita) {
        this.cancion_favorita = cancion_favorita;
    }

    public String getCancion_favorita() {
        return cancion_favorita;
    }
}
