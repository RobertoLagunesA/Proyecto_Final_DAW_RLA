package Modelo;
import java.io.Serializable;

public class TipoEventoJB implements Serializable {
    private int id_evento;
    private String categoria;
    private String tipo;
    private String tematica;
    private String nom_tpo;

    public TipoEventoJB (){
    }
    //Insertar
    public TipoEventoJB (String categoria, String tipo, String tematica, String nom_tpo){
        this.categoria=categoria;
        this.tipo=tipo;
        this.tematica=tematica;
        this.nom_tpo=nom_tpo;
    }
    //Eliminar
    public TipoEventoJB(int id_evento){
        this.id_evento = id_evento;
    }

    //Modificar
    public TipoEventoJB (int id_evento, String categoria, String tipo, String tematica, String nom_tpo){
        this.id_evento=id_evento;
        this.categoria=categoria;
        this.tipo=tipo;
        this.tematica=tematica;
        this.nom_tpo=nom_tpo;
    }

    public void setId_evento(int id_evento){
        this.id_evento=id_evento;
    }
    public int getId_evento() {
        return id_evento;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }


    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }
    
    public void setNom_tpo(String nom_tpo) {
        this.nom_tpo = nom_tpo;
    }

    public String getNom_tpo() {
        return nom_tpo;
    }
}
