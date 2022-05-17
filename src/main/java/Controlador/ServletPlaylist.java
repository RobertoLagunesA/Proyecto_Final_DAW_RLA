package Controlador;

import Datos.PlaylistDAO;
import Modelo.PlaylistJB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPlaylist", value = "/ServletPlaylist")
public class ServletPlaylist extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String nombre, link_c;

        nombre = request.getParameter("nombre");
        link_c = request.getParameter("link_c");

        PlaylistJB p = new PlaylistJB();
        p.setNombre(nombre);
        p.setLink_c(link_c);

        int estatus = PlaylistDAO.insertPlaylist(p);
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
