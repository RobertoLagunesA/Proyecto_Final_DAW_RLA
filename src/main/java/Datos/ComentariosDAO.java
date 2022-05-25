package Datos;

import Controlador.Conexion;
import Modelo.ComentariosJB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ComentariosDAO {

    //Insertar datos de comentarios
    public static int insertComentario(ComentariosJB co){
        int estatus=0; //Si se realiza o no la operacion
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO comentarios(comentarios) " //Establecemos Query
                    + "VALUES(?)";

            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia
            //Usamos Getters and Setter
            ps.setString(1, co.getComentarios());
            estatus= ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso del comentario");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar el comentario");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }


    //Actualizar datos de los comentarios
    public static int updateComentario(ComentariosJB co){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE comentarios set comentario=?"
                    +"WHERE id_canciones=?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setString(1, co.getComentarios());
            estatus= ps.executeUpdate();
            System.out.println("Exito al Actualizar el comentario");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar el comentario");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Eliminar datos de los comentarios
    public static int deleteComentario(int id){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM comentarios WHERE id_comentarios = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id);
            estatus= ps.executeUpdate();
            System.out.println("Exito al eliminar el comentario");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar  el comentario");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Buscar datos de los comentarios por el identificador id
    public static ComentariosJB searchComentario(int id){
        ComentariosJB co = new ComentariosJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM comentarios WHERE id_comentarios=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                co.setId_comentarios(rs.getInt(1));
                co.setComentarios(rs.getString(2));
            }
            System.out.println("Comentario Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar Comentario");
            System.out.println(ed.getMessage());
        }
        return co; //Retornamos al objeto
    }

    //Buscar TODOS los datos de los comentarios con el ArrayList
    public static List<ComentariosJB> searchAllComentarios(){
        List<ComentariosJB> lista = new ArrayList<ComentariosJB>();//Generamos objeto de la lista
        ComentariosJB co = new ComentariosJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM comentarios";

            PreparedStatement ps= con.prepareStatement(q);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                co.setId_comentarios(rs.getInt(1));
                co.setComentarios(rs.getString(2));
                lista.add(co);
            }
            System.out.println("Comentarios Encontrados");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar los Comentarios");
            System.out.println(ed.getMessage());
        }
        return lista;
    }
}
