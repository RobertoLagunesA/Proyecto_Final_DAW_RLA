
package Modelo;
import java.io.Serializable;
    

public class DjcontactoJB implements Serializable {
    private int id_contacto;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String comentarios;
    
    public DjcontactoJB(){
}
    
    //Insertar
     public DjcontactoJB(String nombre, String apellido, String telefono, String correo, String comentarios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.comentarios = comentarios;
    }
     
    //Eliminar
    public DjcontactoJB(int id_contacto){
        this.id_contacto = id_contacto;
    }
    
     //Modificar
    public DjcontactoJB (int id_contacto, String nombre, String apellido, String telefono, String correo, String comentarios){
        this.id_contacto=id_contacto;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.correo=correo;
        this.comentarios=comentarios;
    }
   
  
    public int getid_contacto() {
        return id_contacto;
    }

    public void setid_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
}
