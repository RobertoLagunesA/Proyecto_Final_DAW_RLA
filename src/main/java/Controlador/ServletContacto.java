package Controlador;

import Datos.DjcontactoDAO;
import Modelo.DjcontactoJB;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletContacto", value = "ServletContacto")
public class ServletContacto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Contacto
        String nom_cont = request.getParameter("nom_cont");
        String ape_cont = request.getParameter("ape_cont");
        String tel_cont = request.getParameter("tel_cont");
        String correo_cont = request.getParameter("correo_cont");
        String coment_cont = request.getParameter("coment_cont");

        DjcontactoJB dj = new DjcontactoJB();

        dj.setNom_cont(nom_cont);
        dj.setApe_cont(ape_cont);
        dj.setTel_cont(tel_cont);
        dj.setCorreo_cont(correo_cont);
        dj.setComent_cont(coment_cont);

        int estatus_dj = DjcontactoDAO.insertContacto(dj);
        if (estatus_dj > 0) {
            response.sendRedirect("vistas/registroExitoso.jsp");
        } else {
            response.sendRedirect("vistas/error.jsp");
        }
    }

}
