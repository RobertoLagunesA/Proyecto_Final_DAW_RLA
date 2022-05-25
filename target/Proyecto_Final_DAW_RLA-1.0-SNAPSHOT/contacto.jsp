<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="css/estilocontacto.css" rel="stylesheet" type="text/css"/>
        <title>Contacto</title>

    </head>
    
    <body>
        
        <header><!--Encabezado principal-->
            <div class="container">
                <p class="logo">DJ Art3mixx</p>
                <nav>
                <a href="inicio.jsp">Inicio </a>
                <a href="formulario.jsp">Formulario </a>
                <a href="contacto.jsp">Contacto </a>
                </nav>
            </div>
        </header>
        
        <!-- Formulario de contacto directo DJ -->
        
        <section id="hero"> <!-- Inicio Seccion Formulario -->
         <h1>Contáctanos</h1>
         
         <section id="formulariocontacto"> <!-- Inicio del formulario -->
        <div id="container">
            <form action="ServletContacto" method="post" name="insertContacto"> <!-- Metodo de envio SERVLET -->
                
        <table border="0" align="center" width="230px"> <!-- INICIO de la tabla de CLIENTE -->
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre" class="ctrl" placeholder="Ingrese su nombre"></td>
            </tr>
            <tr>
                <td>Apellido:</td>
                <td><input type="text" name="apellido" class="ctrl" placeholder="Ingrese su Apellido"></td>
            </tr>

            <tr>
                <td>Telefono:</td>
                <td><input type="text" name="telefono" maxlength="10" class="ctrl" placeholder="Ingrese su Telefono"></td>
            </tr>

            <tr>
                <td>Correo:</td>
                <td><input type="email" name="correo" class="ctrl" placeholder="Ingrese su correo"></td>
            </tr>
            <tr> <th colspan="2" align="center">
                    <input type="submit" name="submit" value="Enviar" class="botones"/>
                    <input type="reset" name="reset" value="Nuevo" class="botones"/>
                 </th>
            </tr>
        </table> <!-- Fin de la tabla de CLIENTE -->
            </form>
        </div> 
        </section> 
        </section> <!-- Fin Seccion Formulario -->

        
        
        <footer><!-- Final, footer -->
            <div class="container">
                <p>Aplicación en construcción, disculpe las molestias:|  &copy; </p>
            </div>
        </footer>
        
    </body>
</html>
