

<%@page import="Datos.DjcontactoDAO"%>
<%@page import="Modelo.DjcontactoJB"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilogeneral.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <title>Menu</title>
    </head>
    <body>
        <h1>Consulta de Contactos</h1>
        <div class="d-flex">
            <div class="card cold-sm-6">
                <div class="col-sm-6">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Telefono</th>
                                <th>Correo</th>
                                <th>Comentarios</th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<DjcontactoJB> lista = DjcontactoDAO.searchAllContacto();
                                for (DjcontactoJB dj : lista) {
                            %>
                            <tr>
                                <td> <%=dj.getId_contacto()%> </td>
                                <td> <%=dj.getNom_cont()%> </td>
                                <td> <%=dj.getApe_cont()%> </td>
                                <td> <%=dj.getTel_cont()%> </td>
                                <td> <%=dj.getCorreo_cont()%>  </td>
                                <td> <%=dj.getComent_cont()%>  </td>
                            </tr>
                            <%
                                }
                            %>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
