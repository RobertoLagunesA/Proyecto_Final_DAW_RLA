package Modelo;
import java.io.Serializable;

public class GrupoMusicalJB implements Serializable {
    private int id_grupo;
    private String nombre_grupo;

    public GrupoMusicalJB(){
    }

    //Insertar
    public GrupoMusicalJB(String nombre_grupo){
        this.nombre_grupo = nombre_grupo;
    }

    //Eliminar
    public GrupoMusicalJB(int id_grupo){
        this.id_grupo = id_grupo;
    }

    //Modificar
    public GrupoMusicalJB(int id_grupo, String nombre_grupo){
        this.id_grupo=id_grupo;
        this.nombre_grupo=nombre_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }
    public int getId_grupo() {
        return id_grupo;
    }

    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }
    public String getNombre_grupo() {
        return nombre_grupo;
    }

 
    

}
