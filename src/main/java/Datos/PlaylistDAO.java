package Datos;

import Controlador.Conexion;
import Modelo.PlaylistJB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlaylistDAO {

    //Insertar datos de Playlist
    public static int insertPlaylist(PlaylistJB p){
        int estatus_p = 0; //Si se realiza o no la operacion/
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO playlist(nom_play, link_c)" //Establecemos Query
                    + "VALUES(?,?)";
            
            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia

            //Usamos Getters and Setter
            ps.setString(1, p.getNom_play());
            ps.setString(2, p.getLink_c());

            estatus_p = ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso de la playlist");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar Playlist");
            System.out.println(ed.getMessage());
        }
        
        return estatus_p;
    }


    //Actualizar datos del cliente
    public static int updatePlaylist(PlaylistJB p){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE playlist set nombre=?, link_c=?"
                    +"WHERE id_playlist=?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setString(1, p.getNom_play());
            ps.setString(2, p.getLink_c());
            ps.setInt(3, p.getId_playlist());
            estatus= ps.executeUpdate();
            System.out.println("Exito al Actualizar la playlist");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar la playlist");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Eliminar datos del cliente
    public static int deletePlaylist(int id){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM playlist WHERE id_playlist = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id);

            estatus= ps.executeUpdate();
            System.out.println("Exito al eliminar la playlist");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar la playlist");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Buscar datos del cliente por el identificador id
    public static PlaylistJB searchPlaylist(int id){
        PlaylistJB p = new PlaylistJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM playlist WHERE id_playlist=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                p.setId_playlist(rs.getInt(1));
                p.setNom_play(rs.getString(2));
                p.setLink_c(rs.getString(3));
            }
            System.out.println("Playlist Encontrada");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar Playlist");
            System.out.println(ed.getMessage());
        }
        return p; //Retornamos al objeto
    }

    //Buscar TODOS los datos del cliente con el ArrayList
    public static List<PlaylistJB> searchAllPlaylist(){
        List<PlaylistJB> lista_p = new ArrayList<PlaylistJB>(); //Generamos objeto de la lista
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM playlist";

            PreparedStatement ps= con.prepareStatement(q);

            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                PlaylistJB p = new PlaylistJB(); //Intanciamos JB
                p.setId_playlist(rs.getInt(1));
                p.setNom_play(rs.getString(2));
                p.setLink_c(rs.getString(3));
                lista_p.add(p);
            }

            System.out.println("Playlist Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar la Playlist");
            System.out.println(ed.getMessage());
        }
        return lista_p;
    }
}
