package Datos;
import Controlador.Conexion;
import Modelo.ArtistaJB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArtistaDAO {
    //Insertar datos de Artista
    public static int insertArtista(ArtistaJB a){
        int estatus_art=0; //Si se realiza o no la operacion
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO artista(nombre_artista) " //Establecemos Query
                    + "VALUES(?)";
            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia

            //Usamos Getters and Setter
            ps.setString(1, a.getNombre_artista());

            estatus_art= ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso del Artista");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar el Artista");
            System.out.println(ed.getMessage());
        }
        return estatus_art;
    }


    //Actualizar datos del Artista
    public static int updateArtista(ArtistaJB a){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE cliente set nombre_artista=?"
                    +"WHERE id_artista=?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setString(1, a.getNombre_artista());
            estatus= ps.executeUpdate();
            System.out.println("Exito al Actualizar el Artista");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar el Artista");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Eliminar datos del Artista
    public static int deleteArtista(int id){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM artista WHERE id_artista = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id);

            estatus= ps.executeUpdate();
            System.out.println("Exito al eliminar el Artista");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar el Artista");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Buscar datos del Artista por el identificador id
    public static ArtistaJB searchArtista(int id){
        ArtistaJB a = new ArtistaJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM artista WHERE id_artista=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                a.setId_artista(rs.getInt(1));
                a.setNombre_artista(rs.getString(2));
            }

            System.out.println("Artista Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar Artista");
            System.out.println(ed.getMessage());
        }
        return a; //Retornamos al objeto
    }

    //Buscar TODOS los datos del Artista con el ArrayList
    public static List<ArtistaJB> searchAllArtista(){
        List<ArtistaJB> lista = new ArrayList<ArtistaJB>();//Generamos objeto de la lista
        ArtistaJB a = new ArtistaJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM artista";

            PreparedStatement ps= con.prepareStatement(q);

            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                a.setId_artista(rs.getInt(1));
                a.setNombre_artista(rs.getString(2));
                lista.add(a);
            }
            System.out.println("Artista Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar los Artistas");
            System.out.println(ed.getMessage());
        }
        return lista;
    }
}
