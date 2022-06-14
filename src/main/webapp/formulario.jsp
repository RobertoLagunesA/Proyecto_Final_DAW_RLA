
<%@page import="Modelo.GeneroJB"%>
<%@page import="Datos.GeneroDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<GeneroJB> lista_ge = GeneroDAO.searchAllGenero();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="css/estiloformulario.css" rel="stylesheet" type="text/css"/>
        <title>Formulario</title>

    </head>
    <body>

        <header><!-- Encabezado principal -->
            <div class="container">
                <p class="logo">DJ Art3mixx</p>
                <nav>
                    <a href="inicio.jsp">Inicio</a>
                    <a href="formulario.jsp">Formulario</a>
                    <a href="contacto.jsp">Contacto</a>
                </nav>
            </div>
        </header>

        <section id="hero"> <!-- Inicio Seccion Formulario -->
            <h2>Formulario Evento</h2>


            <section id="formularioglobal"> <!-- Inicio del formulario -->
                <div id="container">
                    <form action="ServletFormulario" method="post"> <!-- Metodo de envio SERVLET -->

                        <table border="0" align="center" width="230px"> <!-- INICIO de la tabla de CLIENTE -->
                            <tr>
                                <td>Nombre:</td>
                                <td><input type="text" name="nombre" class="ctrl" placeholder="Ingrese su nombre" ></td>
                            </tr>
                            <tr>
                                <td>Apellido:</td>
                                <td><input type="text" name="apellido" class="ctrl" placeholder="Ingrese su Apellido"></td>
                            </tr>

                            <tr>
                                <td>Telefono:</td>
                                <td><input type="text" name="telefono" maxlength="10" class="ctrl" placeholder="Ingrese su Telefono" ></td>
                            </tr>

                            <tr>
                                <td>Correo:</td>
                                <td><input type="email" name="correo" class="ctrl" placeholder="Ingrese su correo"></td>
                            </tr>
                        </table> <!-- Fin de la tabla de CLIENTE -->

                </div>

                <div>
                    <h3>Tipo de evento</h3>

                    <label>Categoria:</label>
                    <input type="radio" name="categoria" value="Social" />Social
                    <input type="radio" name="categoria" value="Privado" />Privado
                    <input type="radio" name="categoria" value="Publico" />Publico

                    <br><label for="tevento">Tipo de evento:</label>
                    <input type="text" id="tevento" name="tipo" class="ctrl" placeholder="Cumpleaños, Boda..." ><br>

                    <label for="temati">Tematica el evento:</label>
                    <input type="text" id="temati" name="tematica" class="ctrl" placeholder="Fiesta Retro, Neon party..." ><br>

                    <label for="nom_tpo">Nombre del evento:</label>  <!-- For es = al id -->
                    <input type="text" id="nomevento" name="nom_tpo" class="ctrl" placeholder="Mi cumpleaños Roberto" >

                </div>


                <div>

                    <h3>Genero Musical</h3>

                    <!--  <label for="gen">Géneros favoritos:</label>   -->
                    <!--  <input type="text" id="gen" name="nombre_genero" class="ctrl" placeholder="Cumbia, salsa, Reggaetón..." required> -->

                    <label for="gen">Géneros favoritos:</label>
                    <select name="nombre_genero">
                        <%
                            for (GeneroJB ge : lista_ge) {
                                out.print("<option value=\"" + ge.getId_genero() + "\">" + ge.getNombre_genero() + "</option>");
                            }
                        %>      
                    </select>

                </div>


                <div>
                    <h3>Artistas Favoritos</h3>     

                    <label for="art">Artistas: </label>  <!-- For es = al id -->
                    <input type="text" id="art" name="nombre_artista" class="ctrl" placeholder="JBalvin, DuaLipa, Adele..." >
                </div>

                <div>
                    <h3>Grupo Musical</h3>           
                    <label for="gm">Grupo Musical:</label>  <!-- For es = al id -->
                    <input type="text" id="gm" name="nombre_grupo" class="ctrl" placeholder="Coldplay, Queen...">
                </div>

                <div>
                    <h3>Canciones que no pueden faltar</h3>      

                    <label for="canf">Canciónes Favoritas: </label>  <!-- For es = al id -->
                    <input type="text" id="canf" name="cancion_favorita" class="ctrl" placeholder="Moscow Mule-Bad Bunny" >
                </div>

                <div>
                    <h3>Compartenos tu playlist</h3>

                    <label for="nomp">Nombre Playlist:</label>  <!-- For es = al id -->
                    <input type="text" id="nomp" name="nom_play" class="ctrl" placeholder="Top 50: Global" ><br>

                    <label for="link">Link Playlist:</label>  <!-- For es = al id -->
                    <input type="text" id="link" name="link_c" class="ctrl" placeholder="https://open.spotify.com/play" >
                </div>

                <div>
                    <h3>Lugar del evento</h3>       

                    <label for="lugar">Nombre Lugar:</label>  <!-- For es = al id -->
                    <input type="text" id="lugar" name="nombre_lugar" class="ctrl" placeholder="World trade center" ><br>

                    <label for="direc">Dirección:</label>  <!-- For es = al id -->
                    <input type="text" id="direc" name="direccion" class="ctrl" placeholder="Boulevard Manuel avila" ><br>

                    <label for="fe">Fecha:</label>  <!-- For es = al id -->
                    <input type="date" id="fe" class="ctrl" name="fecha">
                </div>

                <div>
                    <h3>Algun comentario</h3>

                    <label for="com">Comentarios:</label> <!-- For es = al id -->
                    <textarea rows="2" cols="4" id="com" type="text"  name="comentario" class="com" placeholder="Me gustaria añadir..."></textarea>

                </div>

                <div><br>
                    <th colspan="2" align="center">
                        <input type="submit" name="submit" value="Enviar" class="botones"/>
                        <input type="reset" name="reset" value="Nuevo" class="botones"/>
                    </th>

                </div>
                </form><!-- Fin del formulario FORM -->             

            </section> 
        </section> <!-- FIN Seccion Formulario -->

        <footer> <!-- Inicio footer-->
            <div class="container">
                <p>Aplicación en construcción, disculpe las molestias:|  &copy; </p>
            </div>
        </footer> <!-- FIN footer-->

    </body>
</html>
