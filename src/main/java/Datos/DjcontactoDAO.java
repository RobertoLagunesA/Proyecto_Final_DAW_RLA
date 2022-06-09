
package Datos;
import Controlador.Conexion;
import Modelo.DjcontactoJB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DjcontactoDAO {
    
    //Insertar datos de Clientes
    public static int insertContacto(DjcontactoJB dj){
        int estatus_dj=0; //Si se realiza o no la operacion/
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO djcontacto(nombre, apellido, telefono, correo, comentarios)" //Establecemos Query
                    + "VALUES(?,?,?,?,?)";
            
            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia

            //Usamos Getters and Setter
            ps.setString(1, dj.getNombre());
            ps.setString(2, dj.getApellido());
            ps.setString(3, dj.getTelefono());
            ps.setString(4, dj.getCorreo());
            ps.setString(5, dj.getComentarios());

            estatus_dj = ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso del Contacto");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar el Contacto");
            System.out.println(ed.getMessage());
        }
        return estatus_dj;
    }
    
    //Actualizar datos del cliente
    public static int updateContacto(DjcontactoJB dj){
        int estatus_dj=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE djcontacto set nombre=?, apellido=?, telefono=?, correo=? comentarios=?"
                    +"WHERE id_contacto=?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setString(1, dj.getNombre());
            ps.setString(2, dj.getApellido());
            ps.setString(3, dj.getTelefono());
            ps.setString(4, dj.getCorreo());
            ps.setInt(5, dj.getid_contacto());

            estatus_dj= ps.executeUpdate();
            System.out.println("Exito al Actualizar el Contacto");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar el Contacto");
            System.out.println(ed.getMessage());
        }
        return estatus_dj;
    }

    //Eliminar datos del cliente
    public static int deleteContacto(int id_contacto){
        int estatus_dj=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM djcontacto WHERE id_contacto = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id_contacto);

            estatus_dj= ps.executeUpdate();
            System.out.println("Exito al eliminar el Contacto");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar el Contacto");
            System.out.println(ed.getMessage());
        }
        return estatus_dj;
    }

    //Buscar datos del cliente por el identificador id
    public static DjcontactoJB searchContacto(int id_contacto){
        DjcontactoJB dj = new DjcontactoJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM djcontacto WHERE id_contacto=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id_contacto);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                dj.setid_contacto(rs.getInt(1));
                dj.setNombre(rs.getString(2));
                dj.setApellido(rs.getString(3));
                dj.setTelefono(rs.getString(4));
                dj.setCorreo(rs.getString(5));
                dj.setComentarios(rs.getString(6));
            }

            System.out.println("Contacto Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar contacto");
            System.out.println(ed.getMessage());
        }
        return dj; //Retornamos al objeto
    }

    //Buscar TODOS los datos del cliente con el ArrayList
    public static List<DjcontactoJB> searchAllContacto(){
        List<DjcontactoJB> lista = new ArrayList<DjcontactoJB>();//Generamos objeto de la lista
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM djcontacto";
            
            PreparedStatement ps= con.prepareStatement(q);

            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                DjcontactoJB dj = new DjcontactoJB(); //Intanciamos JB
                dj.setid_contacto(rs.getInt(1));
                dj.setNombre(rs.getString(2));
                dj.setApellido(rs.getString(3));
                dj.setTelefono(rs.getString(4));
                dj.setCorreo(rs.getString(5));
                lista.add(dj);
            }

            System.out.println("Contacto Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar los Contactos");
            System.out.println(ed.getMessage());
        }
        return lista;
    }


}


