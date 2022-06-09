<%@ page import="Datos.ClienteDAO" %>
<%@ page import="Modelo.ClienteJB" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link href="css/estilotabla.css" rel="stylesheet" type="text/css"/>
    <title>Listar</title>
</head>


<body>
<div id="main-container">
    <h1>Clientes</h1>
    <a href="">Agregar Nuevo</a>
    <table>
        <thead>
        <tr>
            <th>ID Cliente</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Telefono</th>
            <th>Correo</th>
            <th>Acciones</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
           <%
            List<ClienteJB> lista = ClienteDAO.searchAllCliente();
            for(ClienteJB e : lista){
            %>
       <tr>
    <td> <%=e.getId_cliente()%> </td>
    <td> <%=e.getNombre()%> </td>
    <td> <%=e.getApellido()%> </td>
    <td> <%=e.getTelefono()%> </td>
    <td> <%=e.getCorreo()%>  </td>
    <td> <a href="editarCliente.jsp?id=<%=e.getId_cliente()%>"> Editar </a> </td>
    <td> <a href="deleteCliente?id=<%=e.getId_cliente()%>"> Borrar </a> </td>
    <td> <a href="consultarClientes?id=<%=e.getId_cliente()%>"> Consultar </a> </td>
      </tr>
  <%
    }
  %>      
        </tbody>
    </table>
        <br>
    <a href="menu.jsp">Regresar al Menu Principal</a>
</div>
</body>
</html>
