package Datos;
import Conexion.Conexion;
import Modelo.TipoEventoJB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TipoEventoDAO {

    //Insertar datos de Evento
    public static int insertEvento(TipoEventoJB t){
        int estatus=0; //Si se realiza o no la operacion/
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO tipoevento(categoria, tipo, nombre, tematica)" //Establecemos Query
                    + "VALUES(?,?,?,?)";

            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia
            //Usamos Getters and Setter
            ps.setString(1, t.getCategoria());
            ps.setString(2, t.getTipo());
            ps.setString(3, t.getNombre());
            ps.setString(4, t.getTematica());

            estatus= ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso del Evento");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar el Evento");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }


    //Actualizar datos del evento
    public static int updateEvento(TipoEventoJB t){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE tipoevento set categoria=?, tipo=?, nombre=?, tematica=?"
                    +"WHERE id_evento=?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setString(1, t.getCategoria());
            ps.setString(2, t.getTipo());
            ps.setString(3, t.getNombre());
            ps.setString(4, t.getTematica());
            ps.setInt(5, t.getId_evento());

            estatus= ps.executeUpdate();
            System.out.println("Exito al Actualizar el Evento");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar el Evento");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Eliminar datos del evento
    public static int deleteEvento(int id){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM tipoevento WHERE id_evento = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id);
            estatus= ps.executeUpdate();
            System.out.println("Exito al eliminar el Evento");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar el Evento");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Buscar datos del Evento por el identificador id
    public static TipoEventoJB searchEvento(int id){
        TipoEventoJB t = new TipoEventoJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM tipoevento WHERE id_evento=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                t.setId_evento(rs.getInt(1));
                t.setCategoria(rs.getString(2));
                t.setTipo(rs.getString(3));
                t.setNombre(rs.getString(4));
                t.setTematica(rs.getString(5));
            }

            System.out.println("Cliente Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar cliente");
            System.out.println(ed.getMessage());
        }
        return t; //Retornamos al objeto
    }

    //Buscar TODOS los datos del evento con el ArrayList
    public static List<TipoEventoJB> searchAllEvento(){
        List<TipoEventoJB> lista = new ArrayList<TipoEventoJB>();//Generamos objeto de la lista
        TipoEventoJB t = new TipoEventoJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM tipoevento";

            PreparedStatement ps= con.prepareStatement(q);

            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                t.setId_evento(rs.getInt(1));
                t.setCategoria(rs.getString(2));
                t.setTipo(rs.getString(3));
                t.setNombre(rs.getString(4));
                t.setTematica(rs.getString(5));
                lista.add(t);
            }

            System.out.println("Evento Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar el evento");
            System.out.println(ed.getMessage());
        }
        return lista;
    }

}
