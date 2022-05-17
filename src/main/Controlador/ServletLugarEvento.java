package Controlador;

import Datos.LugarEventoDAO;
import Modelo.LugarEventoJB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletLugarEvento", value = "/ServletLugarEvento")
public class ServletLugarEvento extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String nombre_lugar, direccion, fecha;

        nombre_lugar = request.getParameter("nombre_lugar");
        direccion = request.getParameter("direccion");
        fecha = request.getParameter("fecha");

        LugarEventoJB l = new LugarEventoJB();
        l.setNombre_lugar(nombre_lugar);
        l.setDireccion(direccion);
        l.setFecha(fecha);

        int estatus = LugarEventoDAO.insertLugar(l);
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
