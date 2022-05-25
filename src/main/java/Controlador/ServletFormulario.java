package Controlador;

import Datos.ArtistaDAO;
import Datos.CancionesDAO;
import Datos.ClienteDAO;

import Modelo.ArtistaJB;
import Modelo.CancionesJB;
import Modelo.ClienteJB;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletFormulario", value = "ServletFormulario")
public class ServletFormulario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            String nombre, apellido, telefono, correo, nombre_artista, cancion_favorita;

        nombre = request.getParameter("nombre");
        apellido = request.getParameter("apellido");
        telefono = request.getParameter("telefono");
        correo = request.getParameter("correo");

        ClienteJB e = new ClienteJB();
        e.setNombre(nombre);
        e.setApellido(apellido);
        e.setTelefono(telefono);
        e.setCorreo(correo);
        
        int estatus = ClienteDAO.insertCliente(e);
        if (estatus > 0) { 
            response.sendRedirect("vistas/registroExitoso.jsp");
        } else { 
            response.sendRedirect("vistas/error.jsp");
        }
        

        nombre_artista = request.getParameter("nombre_artista");
        ArtistaJB a = new ArtistaJB();
        a.setNombre_artista(nombre_artista);
        int estatus_art = ArtistaDAO.insertArtista(a);
        if (estatus_art > 0);
        


        cancion_favorita = request.getParameter("cancion_favorita");
        CancionesJB c = new CancionesJB();
        c.setCancion_favorita(cancion_favorita);
        int estatus_can = CancionesDAO.insertCanciones(c);
        if (estatus_can > 0);
        
        

 
 
  
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletFormulario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletFormulario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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