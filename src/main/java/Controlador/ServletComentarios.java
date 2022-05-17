package Controlador;

import Datos.ComentariosDAO;
import Modelo.ComentariosJB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletComentarios", value = "/ServletComentarios")
public class ServletComentarios extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            String comentarios;

            comentarios = request.getParameter("comentarios");

            ComentariosJB co = new ComentariosJB();
            co.setComentarios(comentarios);

            int estatus = ComentariosDAO.insertComentario(co);
            if (estatus > 0) {
                response.sendRedirect("");
            } else {
                response.sendRedirect("");
            }
        }

        }



