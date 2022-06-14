package Datos;

import Controlador.Conexion;
import Modelo.GeneroSelectJB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GeneroSelectDAO {

    //Insertar datos de Genero
    public static int insertGeneroSelect(GeneroSelectJB gs) {
        int estatus_gs = 0; //Si se realiza o no la operacion
        try { //Conexion con la BD
            Connection con = Conexion.getConnection();
            String q = "INSERT INTO generoselect(gen_select)" //Establecemos Query
                    + "VALUES(?)";

            PreparedStatement ps = con.prepareStatement(q); //Prepara la sentencia
            //Usamos Getters and Setter

            ps.setInt(1, gs.getGen_select());
            estatus_gs = ps.executeUpdate(); //Le asignamos a estatus la sentencia para verificar si la realizo
            System.out.println("Registro Exitoso del Genero");
            con.close();

        } catch (Exception ed) {
            System.out.println("Error al registrar el Genero");
            System.out.println(ed.getMessage());
        }
        return estatus_gs;
    }

    //Buscar TODOS los datos de los generos con el ArrayList
    public static List<GeneroSelectJB> searchAllGeneroSelect() {
        List<GeneroSelectJB> lista_gs = new ArrayList<GeneroSelectJB>();//Generamos objeto de la lista     
        try {
            Connection con = Conexion.getConnection();
            String q = "SELECT * from generoselect";

            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GeneroSelectJB gs = new GeneroSelectJB(); //Intanciamos JB
                gs.setId_gen_select(rs.getInt(1));
                gs.setGen_select(rs.getInt(2));
                lista_gs.add(gs);
            }
            System.out.println("Genero Encontrado");
            con.close();
        } catch (Exception ed) {
            System.out.println("Error al buscar los generos");
            System.out.println(ed.getMessage());
        }
        return lista_gs;
    }

}
