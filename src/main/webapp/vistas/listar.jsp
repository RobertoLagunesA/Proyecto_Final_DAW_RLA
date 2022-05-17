<%@ page import="Datos.ClienteDAO" %>
<%@ page import="Modelo.ClienteJB" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Listar</title>
</head>
<body>
<div>
    <h1>Clientes</h1>
    <a href="Controlador?accion=add">Agregar Nuevo</a>
    <table>
        <thead>
        <tr>
            <th>idCliente</th>
            <th>nombre</th>
            <th>apellido</th>
            <th>telefono</th>
            <th>correo</th>
            <th>Acciones</th>
        </tr>
        </thead>
        <%
            ClienteDAO dao=new ClienteDAO();
            List<ClienteJB>list=dao.listar();
            Iterator<ClienteJB>iter=list.iterator();
            ClienteJB cli=null;
            while(iter.hasNext())
                cli=iter.next();
        %>
        <tbody>
        <tr>
            <td><%= cli.getId_cliente() %></td>
            <td><%= cli.getNombre() %></td>
            <td><%= cli.getApellido() %></td>
            <td><%= cli.getTelefono() %></td>
            <td><%= cli.getCorreo() %></td>
            <td>
                <a href="Controlador?accion=editar&id=<%= cli.getId_cliente() %>">Edit</a>
                <a>Remove</a>
            </td>
        </tr>
        <%
}
%>
        </tbody>
    </table>
</div>
</body>
</html>
