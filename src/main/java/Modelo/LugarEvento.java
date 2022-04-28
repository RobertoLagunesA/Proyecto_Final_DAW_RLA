package Modelo;
import java.io.Serializable;

public class LugarEvento implements Serializable {
    private int id_lugar;
    private String nombre_lugar;
    private String direccion;

    public LugarEvento(){
    }

    //Insertar
    public LugarEvento(String nombre_lugar, String direccion){
        this.nombre_lugar=nombre_lugar;
        this.direccion=direccion;
    }

    //Eliminar
    public LugarEvento(int id_lugar){
        this.id_lugar = id_lugar;
    }

    //Modificar
    public LugarEvento(int id_lugar, String nombre_lugar, String direccion){
        this.id_lugar=id_lugar;
        this.nombre_lugar=nombre_lugar;
        this.direccion=direccion;
    }

    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }
    public int getId_lugar() {
        return id_lugar;
    }

    public void setNombre_lugar(String nombre_lugar) {
        this.nombre_lugar = nombre_lugar;
    }
    public String getNombre_lugar() {
        return nombre_lugar;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
}
