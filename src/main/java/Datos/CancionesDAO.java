package Datos;

import Controlador.Conexion;
import Modelo.CancionesJB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CancionesDAO {

    //Insertar datos de Canciones
    public static int insertCanciones(CancionesJB c){
        int estatus_can=0; //Si se realiza o no la operacion
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO canciones(cancion_favorita)" //Establecemos Query
                    + "VALUES(?)";

            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia
            //Usamos Getters and Setter
            ps.setString(1, c.getCancion_favorita());
            
            estatus_can= ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso de la cancion");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar la cancion");
            System.out.println(ed.getMessage());
        }
        return estatus_can;
    }


    //Actualizar datos de las canciones
    public static int updateCanciones(CancionesJB c){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE canciones set cancion_favorita=?"
                    +"WHERE id_canciones=?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setString(1, c.getCancion_favorita());
            estatus= ps.executeUpdate();
            System.out.println("Exito al Actualizar la cancion");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar la cancion");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Eliminar datos de las canciones
    public static int deleteCanciones(int id){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM canciones WHERE id_canciones = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id);
            estatus= ps.executeUpdate();
            System.out.println("Exito al eliminar la cancion");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar  las canciones");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Buscar datos de las canciones por el identificador id
    public static CancionesJB searchCanciones(int id){
        CancionesJB c = new CancionesJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM canciones WHERE id_canciones=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                c.setId_canciones(rs.getInt(1));
                c.setCancion_favorita(rs.getString(2));
            }
            System.out.println("Cancion Encontrada");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar Cancion");
            System.out.println(ed.getMessage());
        }
        return c; //Retornamos al objeto
    }

    //Buscar TODOS los datos de las canciones con el ArrayList
    public static List<CancionesJB> searchAllCanciones(){
        List<CancionesJB> lista_c = new ArrayList<CancionesJB>();//Generamos objeto de la lista
        
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM canciones";

            PreparedStatement ps= con.prepareStatement(q);

            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                CancionesJB c = new CancionesJB(); //Intanciamos JB
                c.setId_canciones(rs.getInt(1));
                c.setCancion_favorita(rs.getString(2));
                lista_c.add(c);
            }
            System.out.println("Canciones Encontradas");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar las canciones");
            System.out.println(ed.getMessage());
        }
        return lista_c;
    }
}
