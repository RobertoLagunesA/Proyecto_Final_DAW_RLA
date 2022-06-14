
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Modelo.ClienteJB" %>
<%@ page import="Datos.ClienteDAO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estiloinicio.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <title>Consulta</title>
    </head>
    <body>

        <h1>Editar datos formulario</h1><br>


        <div class="d-flex">
            <div class="card cold-sm-4">
                <div class="card-body">

                    <form action="ServletValidacion?action=consultar" method="post"> 
                        <div class="form-group">
                            <label>Nombre</label>
                            <input type="text" name="nombre" value="${c.getNombre()}" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Apellido</label>
                            <input type="text" name="apellido" value="${c.getApellido()}" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Telefono</label>
                            <input type="text" name="telefono" value="${c.getTelefono()}" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Correo</label>
                            <input type="text" name="correo" value="${c.getCorreo()}" class="form-control">
                        </div>

                        <input type="submit" name="acciones" value="Agregar" class="btn btn-info">
                        <input type="submit" name="acciones" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>



            <div class="card cold-sm-8">
                <div class="col-sm-6">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
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

                            <c:forEach var="e" items="${clientes}">

                                <tr>
                                    <td> ${e.getId_cliente()} </td>
                                    <td> ${e.getNombre()} </td>
                                    <td> ${e.getApellido()} </td>
                                    <td> ${e.getTelefono()} </td>
                                    <td> ${e.getCorreo()} </td>
                                    <td> <a class="btn btn-warning " href="ServletValidacion?action=consultar&acciones=Editar&id=${e.getId_cliente()}">Editar</a> </td>
                                    <td> <a class="btn btn-danger" href="ServletValidacion?action=consultar&acciones=Delete&id=${e.getId_cliente()}"> Borrar </a> </td> 
                                    <td> <a class="btn btn-info" href="vistas/listaformulario.jsp">Info</a> </td>
                                </tr>
                            </c:forEach>
                        </tbody>

                    </table>
                </div>
            </div>
        </div>



        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>


