package Controlador;

import Datos.ClienteDAO;
import Modelo.ClienteJB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()){
            String nom, ape, cor;
            int tel;

            nom=request.getParameter("nombre");
            ape=request.getParameter("apellido");
            tel= Integer.parseInt(request.getParameter("telefono"));
            cor=request.getParameter("correo");

            ClienteJB e= new ClienteJB();
            e.setNombre(nom);
            e.setApellido(ape);
            e.setTelefono(tel);
            e.setCorreo(cor);

            int estatus= ClienteDAO.insert(e);
        }

    }
}



