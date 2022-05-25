<%@ page import="Modelo.ClienteJB" %>
<%@ page import="Datos.ClienteDAO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>Tabla de todos los Clientes</h1>
<br>
<table border="2">
  <thead>
  <tr>
    <th>ID</th>
    <th>Nombre</th>
    <th>Apellido</th>
    <th>Telefono</th>
    <th>Correo</th>
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
  </tr>
  <%
    }
  %>
  </tbody>
</table>
<br>
      <a href="../index.jsp">Regresar al Menu Principal</a>
   </body>
</html>
