
package Modelo;
import java.io.Serializable;
    

public class DjcontactoJB implements Serializable {
    private int id_contacto;
    private String nom_cont;
    private String ape_cont;
    private String tel_cont;
    private String correo_cont;
    private String coment_cont;
    
    public DjcontactoJB(){
    }

    public int getId_contacto() {
        return id_contacto;
    }

    public void setId_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }

    public String getNom_cont() {
        return nom_cont;
    }

    public void setNom_cont(String nom_cont) {
        this.nom_cont = nom_cont;
    }

    public String getApe_cont() {
        return ape_cont;
    }

    public void setApe_cont(String ape_cont) {
        this.ape_cont = ape_cont;
    }

    public String getTel_cont() {
        return tel_cont;
    }

    public void setTel_cont(String tel_cont) {
        this.tel_cont = tel_cont;
    }

    public String getCorreo_cont() {
        return correo_cont;
    }

    public void setCorreo_cont(String correo_cont) {
        this.correo_cont = correo_cont;
    }

    public String getComent_cont() {
        return coment_cont;
    }

    public void setComent_cont(String coment_cont) {
        this.coment_cont = coment_cont;
    }
    
}

    