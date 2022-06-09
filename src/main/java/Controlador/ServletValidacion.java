
package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletValidacion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        switch (accion){
            case"Principal":
                request.getRequestDispatcher("vistas/menu.jsp").forward(request, response);
                break;
                
            case"consultarClientes":
                request.getRequestDispatcher("vistas/consultarClientes.jsp").forward(request, response);
                break;
                
            case"nuevocliente":
                request.getRequestDispatcher("vistas/nuevoCliente.jsp").forward(request, response);
                break;
               
            case"editarCliente":
                request.getRequestDispatcher("vistas/editarCliente.jsp").forward(request, response);
                break;   
            default:
                throw new AssertionError();
        }
        
    }
      
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 

}
