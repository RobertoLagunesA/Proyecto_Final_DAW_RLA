package Modelo;
import java.io.Serializable;

public class LugarEventoJB implements Serializable {
    private int id_lugar;
    private String nombre_lugar;
    private String direccion;
    private String fecha;

    public LugarEventoJB(){
    }

    //Insertar
    public LugarEventoJB(String nombre_lugar, String direccion, String fecha){
        this.nombre_lugar = nombre_lugar;
        this.direccion = direccion;
        this.fecha = fecha;
    }

    //Eliminar
    public LugarEventoJB(int id_lugar){
        this.id_lugar = id_lugar;
    }

    //Modificar
    public LugarEventoJB(int id_lugar, String nombre_lugar, String direccion, String fecha){
        this.id_lugar=id_lugar;
        this.nombre_lugar=nombre_lugar;
        this.direccion=direccion;
        this.fecha=fecha;
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

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }
}
