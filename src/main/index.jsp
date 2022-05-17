<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<body>
<h2>Bienvenido a la aplicacion de Roberto Lagunes </h2>
<div class="container">
<div class="containerRegistro">
    <form method="get" name="insertCliente" action="Servlet"><table border="2">
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre" size="30"></td>
            </tr>
            <tr>

                <td>Apellido:</td>
                <td><input type="text" name="apellido" size="30"></td>
            </tr>

            <tr>
                <td>Telefono:</td>
                <td><input type="number" name="telefono" size="30"></td>
            </tr>

            <tr>
                <td>Correo:</td>
                <td><input type="email" name="correo" size="30"></td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" value="Registrar Cliente"></td>
            </tr>

        </table>
    </form>
</div>
    <br>
    <div class="consultarClientes">
        <a href="vistas/consultarClientes.jsp">Consultar a todos los Clientes</a>
    </div>
</div>
</body>
</html>
