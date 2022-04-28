package Modelo;
import java.io.Serializable;

public class ComentariosJB implements Serializable {
    private int id_comentarios;
    private String comentarios;

    public ComentariosJB(){
    }

    //Insertar
    public ComentariosJB(String comentarios){
        this.comentarios=comentarios;
    }
    //Eliminar
    public ComentariosJB(int id_comentarios){
        this.id_comentarios = id_comentarios;
    }
    //Modificar
    public ComentariosJB(int id_comentarios, String comentarios){
        this.id_comentarios=id_comentarios;
        this.comentarios=comentarios;
    }

    public void setId_comentarios(int id_comentarios) {
        this.id_comentarios = id_comentarios;
    }
    public int getId_comentarios() {
        return id_comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getComentarios() {
        return comentarios;
    }
}
