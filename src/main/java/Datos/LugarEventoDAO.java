package Datos;

import Conexion.Conexion;
import Modelo.LugarEventoJB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LugarEventoDAO {

    //Insertar datos de Lugar
    public static int insertLugar(LugarEventoJB l){
        int estatus=0; //Si se realiza o no la operacion/
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO lugarevento (nombre_lugar, direccion, fecha)" //Establecemos Query
                    + "VALUES(?,?,?)";
            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia
            //Usamos Getters and Setter
            ps.setString(1, l.getNombre_lugar());
            ps.setString(2, l.getDireccion());
            ps.setString(3, l.getFecha());
            estatus= ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso del Lugar");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar el Lugar");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }


    //Actualizar datos del lugar
    public static int updateLugar(LugarEventoJB l){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE lugarevento set nombre_lugar=?, direccion=?, fecha=?"
                    +"WHERE id_lugar=?";
            PreparedStatement ps= con.prepareStatement(q);
            //Usamos Getters and Setter
            ps.setString(1, l.getNombre_lugar());
            ps.setString(2, l.getDireccion());
            ps.setString(3, l.getFecha());
            ps.setInt(4, l.getId_lugar());
            estatus= ps.executeUpdate();
            System.out.println("Exito al Actualizar el Lugar");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar el Lugar");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Eliminar datos del lugar
    public static int deleteLugar(int id){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM lugarevento WHERE id_lugar = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id);

            estatus= ps.executeUpdate();
            System.out.println("Exito al eliminar el Lugar");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar el Lugar");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Buscar datos del lugarpor el identificador id
    public static LugarEventoJB searchLugar(int id){
        LugarEventoJB l = new LugarEventoJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM lugarevento WHERE id_lugar=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id);

            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                l.setId_lugar(rs.getInt(1));
                l.setNombre_lugar(rs.getString(2));
                l.setDireccion(rs.getString(3));
                l.setFecha(rs.getString(4));
            }
            System.out.println("Cliente Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar cliente");
            System.out.println(ed.getMessage());
        }
        return l; //Retornamos al objeto
    }

    //Buscar TODOS los datos del cliente con el ArrayList
    public static List<LugarEventoJB> searchAllLugar(){
        List<LugarEventoJB> lista = new ArrayList<LugarEventoJB>();//Generamos objeto de la lista
        LugarEventoJB l = new LugarEventoJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM lugarevento";

            PreparedStatement ps= con.prepareStatement(q);

            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                l.setId_lugar(rs.getInt(1));
                l.setNombre_lugar(rs.getString(2));
                l.setDireccion(rs.getString(3));
                l.setFecha(rs.getString(4));
                lista.add(l);
            }

            System.out.println("Evento Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al encontrar el evento");
            System.out.println(ed.getMessage());
        }
        return lista;
    }
}
