
package Datos;

import Controlador.Conexion;
import Modelo.EmpleadoJB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpleadoDAO {
   
    public EmpleadoJB validar(String usuario, String dni){
        EmpleadoJB em=new EmpleadoJB();
        
        try{
            Connection con = Conexion.getConnection();
            String q ="Select * from empleado where usuario=? and dni=?";
            PreparedStatement ps= con.prepareStatement(q);
            
            
            ps.setString(1, usuario);
            ps.setString(2, dni);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                em.setUsuario(rs.getString("usuario"));
                em.setDni(rs.getString("dni"));
                em.setNombre(rs.getString("nombre"));
            }

        }catch (Exception ed){
            
        }
        return em;
    }
}

