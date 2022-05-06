package Datos;
import Conexion.Conexion;
import Modelo.ClienteJB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    //Insertar datos de Clientes
    public static int insertCliente(ClienteJB e){
        int estatus=0; //Si se realiza o no la operacion/
        try{ //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q ="INSERT INTO cliente(nombre, apellido, telefono, correo)" //Establecemos Query
                    + "VALUES(?,?,?,?)";
            PreparedStatement ps= con.prepareStatement(q); //Prepara la sentencia

            //Usamos Getters and Setter
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getTelefono());
            ps.setString(4, e.getCorreo());

            estatus= ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso del Cliente");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al registrar el Cliente");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }


    //Actualizar datos del cliente
    public static int updateCliente(ClienteJB e){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="UPDATE cliente set nombre=?, apellido=?, telefono=?, correo=?"
                    +"WHERE id_cliente=?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getTelefono());
            ps.setString(4, e.getCorreo());
            ps.setInt(5, e.getId_cliente());

            estatus= ps.executeUpdate();
            System.out.println("Exito al Actualizar el Cliente");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al Actualizar el Cliente");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Eliminar datos del cliente
    public static int deleteCliente(int id){
        int estatus=0; //Si se realiza o no la operacion
        try{
            Connection con = Conexion.getConnection();
            String q ="DELETE FROM Cliente WHERE id_cliente = ?";
            PreparedStatement ps= con.prepareStatement(q);

            //Usamos Getters and Setter
            ps.setInt(1, id);

            estatus= ps.executeUpdate();
            System.out.println("Exito al eliminar el Cliente");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al eliminar el Cliente");
            System.out.println(ed.getMessage());
        }
        return estatus;
    }

    //Buscar datos del cliente por el identificador id
    public static ClienteJB searchCliente(int id){
        ClienteJB e = new ClienteJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM cliente WHERE id_cliente=?"; //Query

            PreparedStatement ps= con.prepareStatement(q);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){ //Si dentro de la consulta obtengo el elemento de la tabla
                e.setId_cliente(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setApellido(rs.getString(3));
                e.setTelefono(rs.getInt(4));
                e.setCorreo(rs.getString(5));
            }

            System.out.println("Cliente Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar cliente");
            System.out.println(ed.getMessage());
        }
        return e; //Retornamos al objeto
    }

    //Buscar TODOS los datos del cliente con el ArrayList
    public static List<ClienteJB> searchAllCliente(){
        List<ClienteJB> lista = new ArrayList<ClienteJB>();//Generamos objeto de la lista
        ClienteJB e = new ClienteJB(); //Intanciamos JB
        try{
            Connection con = Conexion.getConnection();
            String q ="SELECT * FROM cliente";

            PreparedStatement ps= con.prepareStatement(q);

            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                e.setId_cliente(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setApellido(rs.getString(3));
                e.setTelefono(rs.getInt(4));
                e.setCorreo(rs.getString(5));
                lista.add(e);
            }

            System.out.println("Cliente Encontrado");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar los clientes");
            System.out.println(ed.getMessage());
        }
        return lista;
    }


}
