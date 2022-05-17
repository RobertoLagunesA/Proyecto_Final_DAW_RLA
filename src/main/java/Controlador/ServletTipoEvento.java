package Controlador;


import Datos.TipoEventoDAO;
import Modelo.TipoEventoJB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletTipoEvento", value = "/ServletTipoEvento")
public class ServletTipoEvento extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String categoria, tipo, nombre, tematica;

        categoria = request.getParameter("categoria");
        tipo = request.getParameter("tipo");
        nombre = request.getParameter("nombre");
        tematica = request.getParameter("tematica");

        TipoEventoJB t = new TipoEventoJB();
        t.setCategoria("categoria");
        t.setTipo("tipo");
        t.setNombre("nombre");
        t.setTematica("tematica");

        int estatus = TipoEventoDAO.insertEvento(t);
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
