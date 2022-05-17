package Controlador;


import Datos.GrupoMusicalDAO;
import Modelo.GrupoMusicalJB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletGrupoMusical", value = "/ServletGrupoMusical")
public class ServletGrupoMusical extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String nombre_grupo, cancion_popular;

        nombre_grupo = request.getParameter("nombre_grupo");
        cancion_popular = request.getParameter("cancion_popular");

        GrupoMusicalJB g = new GrupoMusicalJB();
        g.setNombre_grupo(nombre_grupo);
        g.setCancion_popular(cancion_popular);

        int estatus = GrupoMusicalDAO.insertGrupo(g);
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
