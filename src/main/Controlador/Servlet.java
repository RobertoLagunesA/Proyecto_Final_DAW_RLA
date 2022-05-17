package Controlador;
import Datos.ClienteDAO;
import Modelo.ClienteJB;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String nombre, apellido, telefono, correo;

        //Obtenemos los parametros de ClienteDAO
        nombre = request.getParameter("nombre");
        apellido = request.getParameter("apellido");
        telefono = request.getParameter("telefono");
        correo = request.getParameter("correo");

        //Obtenemos la estancia del Cliente
        ClienteJB e = new ClienteJB();
        e.setNombre(nombre);
        e.setApellido(apellido);
        e.setTelefono(telefono);
        e.setCorreo(correo);

        //Mandamos a llamar a nuestro estatus creado en el ClienteDAO
        int estatus = ClienteDAO.insertCliente(e);
        if (estatus > 0) { //Lo redirecciono a una vista
            response.sendRedirect("");
        } else { //Sino lo redirecciono a otra vista
            response.sendRedirect("");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}

