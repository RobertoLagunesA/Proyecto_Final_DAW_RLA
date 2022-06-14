package Controlador;

import Modelo.ClienteJB;
import Datos.ClienteDAO;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletValidacion extends HttpServlet {

    ClienteJB e = new ClienteJB();
    ClienteDAO edao = new ClienteDAO();
    int ide;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String acciones = request.getParameter("acciones");

        if (action.equals("Principal")) {
            request.getRequestDispatcher("vistas/menu.jsp").forward(request, response);
        }

        if (action.equals("contacto")) {
            request.getRequestDispatcher("vistas/consultarContactos.jsp").forward(request, response);
        }

        if (action.equals("consultar")) {
            switch (acciones) {
                case "Listar":
                    List lista = edao.listar();
                    request.setAttribute("clientes", lista);
                    break;
                case "Agregar":
                    String nombre = request.getParameter("nombre");
                    String apellido = request.getParameter("apellido");
                    String telefono = request.getParameter("telefono");
                    String correo = request.getParameter("correo");

                    e.setNombre(nombre);
                    e.setApellido(apellido);
                    e.setTelefono(telefono);
                    e.setCorreo(correo);

                    int estatus = ClienteDAO.insertCliente(e);
                    if (estatus > 0) {
                        request.getRequestDispatcher("ServletValidacion?action=consultar&acciones=Listar").forward(request, response);
                        break;
                    }
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    ClienteJB em = ClienteDAO.searchCliente(ide);
                    request.setAttribute("c", em);
                    request.getRequestDispatcher("ServletValidacion?action=consultar&acciones=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombre1 = request.getParameter("nombre");
                    String apellido1 = request.getParameter("apellido");
                    String telefono1 = request.getParameter("telefono");
                    String correo1 = request.getParameter("correo");

                    e.setNombre(nombre1);
                    e.setApellido(apellido1);
                    e.setTelefono(telefono1);
                    e.setCorreo(correo1);
                    e.setId_cliente(ide);

                    int estatus_u = edao.updateCliente(e);
                    if (estatus_u > 0) {
                        request.getRequestDispatcher("ServletValidacion?action=consultar&acciones=Listar").forward(request, response);
                        break;
                    }

                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    ClienteDAO.deleteCliente(ide);
                    request.getRequestDispatcher("ServletValidacion?action=consultar&acciones=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("vistas/consultarClientes.jsp").forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
