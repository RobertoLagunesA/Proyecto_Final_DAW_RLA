package Datos;
import Controlador.Conexion;
import Modelo.GrupoMusicalJB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GrupoMusicalDAO {

    //Insertar datos de Grupo
    public static int insertGrupo(GrupoMusicalJB gm){
        int estatus_gm = 0; //Si se realiza o no la operacion/
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO grupomusical(nombre_grupo)" //Establecemos Query
                    + "VALUES(?)";
            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia

            //Usamos Getters and Setter
            ps.setString(1, gm.getNombre_grupo());

            estatus_gm = ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso del Grupo");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar el Grupo");
            System.out.println(ed.getMessage());
        }
        return estatus_gm;
    }


    //Actualizar datos del grupo
    public static int updateGrupo(GrupoMusicalJB gm){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE grupomusical set nombre_grupo=?, cancion_popular=?"
                    +"WHERE id_grupo=?";
            PreparedStatement ps= con.prepareStatement(q);
            //Usamos Getters and Setter
            ps.setString(1, gm.getNombre_grupo());
            ps.setInt(2, gm.getId_grupo());
            estatus= ps.executeUpdate();
            System.out.println("Exito al Actualizar el Grupo");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar el Grupo");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Eliminar datos del grupo
    public static int deleteGrupo(int id){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM grupomusical WHERE id_grupo = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id);

            estatus= ps.executeUpdate();
            System.out.println("Exito al eliminar el grupo");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar el grupo");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Buscar datos del grupo por el identificador id
    public static GrupoMusicalJB searchGrupo(int id){
        GrupoMusicalJB gm = new GrupoMusicalJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM grupomusical WHERE id_grupo=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                gm.setId_grupo(rs.getInt(1));
                gm.setNombre_grupo(rs.getString(2));
            }

            System.out.println("Grupo Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar el Grupo");
            System.out.println(ed.getMessage());
        }
        return gm; //Retornamos al objeto
    }

    //Buscar TODOS los grupos con el ArrayList
    public static List<GrupoMusicalJB> searchAllGrupo(){
        List<GrupoMusicalJB> lista_gm = new ArrayList<GrupoMusicalJB>();//Generamos objeto de la lista
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM grupomusical";

            PreparedStatement ps= con.prepareStatement(q);

            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                GrupoMusicalJB gm = new GrupoMusicalJB(); //Intanciamos JB
                gm.setId_grupo(rs.getInt(1));
                gm.setNombre_grupo(rs.getString(2));;
                lista_gm.add(gm);
            }
            System.out.println("Grupo Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar el Grupo Musical");
            System.out.println(ed.getMessage());
        }
        return lista_gm;
    }

}
