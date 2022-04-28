package Modelo;
import java.io.Serializable;

public class TipoEventoJB implements Serializable {
    private int id_evento;
    private String categoria;
    private String tipo;
    private String nombre;
    private String tematica;

    public TipoEventoJB (){
    }
    //Insertar
    public TipoEventoJB (String categoria, String tipo, String nombre, String tematica){
        this.categoria=categoria;
        this.tipo=tipo;
        this.nombre=nombre;
        this.tematica=tematica;
    }
    //Eliminar
    public TipoEventoJB(int id_evento){
        this.id_evento = id_evento;
    }

    //Modificar
    public TipoEventoJB (int id_evento, String categoria, String tipo, String nombre, String tematica){
        this.id_evento=id_evento;
        this.categoria=categoria;
        this.tipo=tipo;
        this.nombre=nombre;
        this.tematica=tematica;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }
}
