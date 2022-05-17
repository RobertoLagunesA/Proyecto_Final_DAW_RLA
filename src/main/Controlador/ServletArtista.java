package Controlador;

import Datos.ArtistaDAO;
import Modelo.ArtistaJB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletArtista", value = "/ServletArtista")
public class ServletArtista extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String nombre_artista;

        nombre_artista = request.getParameter("nombre_artista");

        ArtistaJB a = new ArtistaJB();
        a.setNombre_artista(nombre_artista);

        int estatus = ArtistaDAO.insertArtista(a);
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
