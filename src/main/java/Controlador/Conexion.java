
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
     public static Connection getConnection() {
        String url, userName, password;
        url = "jdbc:postgresql://localhost:5432/Proyecto_Final_DAW_RLA";
        userName = "postgres";
        password = "3312";

        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexion exitosa a la Base de Datos");
        }catch (Exception e){
            System.out.println("Error al conectar la Base de Datos");
            System.out.println(e.getMessage());
        }
        return con;
    }
}
