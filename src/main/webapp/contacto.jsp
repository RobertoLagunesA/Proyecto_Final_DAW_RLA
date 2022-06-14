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
                    <form action="ServletContacto" method="post"> <!-- Metodo de envio SERVLET -->

                        <table align="center" width="230px"> <!-- INICIO de la tabla -->
                            <tr>
                                <td>Nombre:</td>
                                <td><input type="text" name="nom_cont" class="ctrl" placeholder="Nombre"></td>
                            </tr>
                            <tr>
                                <td>Apellido:</td>
                                <td><input type="text" name="ape_cont" class="ctrl" placeholder="Apellido"></td>
                            </tr>

                            <tr>
                                <td>Telefono:</td>
                                <td><input type="text" name="tel_cont" maxlength="10" class="ctrl" placeholder="Telefono"></td>
                            </tr>

                            <tr>
                                <td>Correo:</td>
                                <td><input type="email" name="correo_cont" class="ctrl" placeholder="Correo"></td>
                            </tr>
                        </table><br><!-- Fin de la tabla-->

                        <label for="com">Comentarios:</label> <!-- For es = al id -->
                        <textarea rows="2" cols="65" id="com" type="text"  name="coment_cont" class="com" placeholder="Me gustaria añadir..."></textarea><br>

                        <div>
                            <th colspan="2">
                                <input type="submit" name="submit" value="Enviar" class="botones"/>
                                <input type="reset" name="reset" value="Nuevo" class="botones"/>
                            </th>
                        </div>

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
