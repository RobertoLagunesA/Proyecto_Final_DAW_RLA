package Modelo;
import java.io.Serializable;

public class ClienteJB implements Serializable {
    private int id_cliente;
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;

    public DatosPersonalesJB(){
    }

    //Insertar
    public DatosPersonalesJB (String nombre, String apellido, int telefono, String correo){
       this.nombre=nombre;
       this.apellido=apellido;
       this.telefono=telefono;
       this.correo=correo;
    }
    //Eliminar
    public DatosPersonalesJB(int id_cliente){
        this.id_cliente = id_cliente;
    }

    //Modificar
    public DatosPersonalesJB (int id_cliente, String nombre, String apellido, int telefono, String correo){
        this.id_cliente=id_cliente;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.correo=correo;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public int getId_cliente(){
        return this.id_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }
}
