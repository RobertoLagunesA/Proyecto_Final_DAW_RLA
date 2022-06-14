package Modelo;
import java.io.Serializable;

public class GeneroSelectJB implements Serializable {
    private int id_gen_select;
    private int gen_select;
 

   
    public GeneroSelectJB(){
    }
    
    //Insertar
    public GeneroSelectJB(int gen_select){
        this.gen_select = gen_select;
    }
 
    //Modificar
    public GeneroSelectJB (int id_gen_select, int gen_select){
        this.id_gen_select=id_gen_select;
        this.gen_select=gen_select;
    }

    public void setId_gen_select(int id_gen_select) {
        this.id_gen_select=id_gen_select;
    }
    public int getId_gen_select() {
        return id_gen_select;
    }

    public void setGen_select(int gen_select) {
        this.gen_select = gen_select;
    }
    public int getGen_select() {
        return gen_select;
    }
  
}
