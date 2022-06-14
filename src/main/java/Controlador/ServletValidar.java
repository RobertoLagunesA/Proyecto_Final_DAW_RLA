 
package Controlador;

import Datos.EmpleadoDAO;
import Modelo.EmpleadoJB;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletValidar extends HttpServlet {

    EmpleadoDAO edao=new EmpleadoDAO();
    EmpleadoJB em=new EmpleadoJB();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion=request.getParameter("accion"); //Quien realiza la accion
        if(accion.equalsIgnoreCase("Ingresar")){ //Funciona cuando se presiona el boton Ingresar
            String usuario=request.getParameter("usuario");
            String contrasena=request.getParameter("contrasena");
            em=edao.validar(usuario, contrasena);
            if(em.getUsuario()!=null){
                request.setAttribute("usuario",em);
                request.getRequestDispatcher("ServletValidacion?action=Principal").forward(request, response); //principal es la accion de ServletValidacion
            }else{
                request.getRequestDispatcher("vistas/error.jsp").forward(request, response);
            }
        }
        else{ //Sino presiona ingresar o presiona otro boton
            request.getRequestDispatcher("login.jsp").forward(request, response);
            
        }
   
    }

}
