package Controlador;


import Datos.CancionesDAO;
import Modelo.CancionesJB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCanciones", value = "/ServletCanciones")
public class ServletCanciones extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String cancion_favorita;

        cancion_favorita = request.getParameter("cancion_favorita");

        CancionesJB c = new CancionesJB();
        c.setCancion_favorita(cancion_favorita);

        int estatus = CancionesDAO.insertCanciones(c);
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
