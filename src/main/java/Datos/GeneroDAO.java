package Datos;

import Controlador.Conexion;
import Modelo.GeneroJB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GeneroDAO {

    //Insertar datos de Genero
    public static int insertGenero(GeneroJB g){
        int estatus_gen=0; //Si se realiza o no la operacion
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO genero(nombre_genero) " //Establecemos Query
                    + "VALUES(?)";

            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia
            //Usamos Getters and Setter
            ps.setString(1, g.getNombre_genero());
            
            estatus_gen = ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso del Genero");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar el Genero");
            System.out.println(ed.getMessage());
        }
        return estatus_gen;
    }


    //Actualizar datos del genero
    public static int updateGenero(GeneroJB g){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE genero set nombre_genero=?"
                    +"WHERE id_genero=?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setString(1, g.getNombre_genero());
            estatus= ps.executeUpdate();
            System.out.println("Exito al Actualizar el genero");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar el Genero");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Eliminar datos del genero
    public static int deleteGenero(int id){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM genero WHERE id_genero = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id);
            estatus= ps.executeUpdate();
            System.out.println("Exito al eliminar el genero");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar  el genero");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Buscar datos del genero por el identificador id
    public static GeneroJB searchGenero(int id){
        GeneroJB g = new GeneroJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM genero WHERE id_genero=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                g.setId_genero(rs.getInt(1));
                g.setNombre_genero(rs.getString(2));
            }
            System.out.println("Generado Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Genero No encontrado");
            System.out.println(ed.getMessage());
        }
        return g; //Retornamos al objeto
    }

    //Buscar TODOS los datos de los generos con el ArrayList
    public static List<GeneroJB> searchAllGenero(){
        List<GeneroJB> lista_ge = new ArrayList<GeneroJB>();//Generamos objeto de la lista     
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM genero";

            PreparedStatement ps= con.prepareStatement(q);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                GeneroJB ge = new GeneroJB(); //Intanciamos JB
                ge.setId_genero(rs.getInt(1));
                ge.setNombre_genero(rs.getString(2));
                lista_ge.add(ge);
            }
            System.out.println("Genero Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar los generos");
            System.out.println(ed.getMessage());
        }
        return lista_ge;
    }
}
