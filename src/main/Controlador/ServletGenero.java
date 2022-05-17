package Controlador;

import Datos.GeneroDAO;
import Modelo.GeneroJB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletGenero", value = "/ServletGenero")
public class ServletGenero extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String nombre_genero;

        nombre_genero = request.getParameter("nombre_genero");

        GeneroJB g = new GeneroJB();
        g.setNombre_genero("nombre_genero");

        int estatus = GeneroDAO.insertGenero(g);
        if (estatus > 0) {
            response.sendRedirect("");
        } else {
            response.sendRedirect("");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
