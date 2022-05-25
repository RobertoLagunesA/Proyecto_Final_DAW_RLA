<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
         <h1>Formulario Evento</h1>
        
      
        <section id="formularioglobal"> <!-- Inicio del formulario -->
        <div id="container">
            <form action="ServletFormulario" method="post"> <!-- Metodo de envio SERVLET -->
                
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
        </table> <!-- Fin de la tabla de CLIENTE -->
        
            </div>

   
            <div>
                <h3>¿Qué tipo de evento será?</h3>
                
                <label>Categoria:</label>
                <input type="radio" id="soc" name="categoria">
                <label for="soc">Social</label>
                <input type="radio" id="priv" name="categoria">
                <label for="pri">Privado</label>
                <input type="radio" id="pub" name="categoria"> <!-- En radio el name debe de ser el mismo en todos -->
                <label for="pub">Público</label>
             
                
                <br><label for="nomevento">Nombre del evento:</label>  <!-- For es = al id -->
                <input type="text" id="nomevento" name="nomevento" class="ctrl" placeholder="Mi cumpleaños Roberto" ><br>
                
           
                <label for="tevento">Tipo de evento:</label>
                <input type="text" id="tevento" name="tipo" class="ctrl" placeholder="Cumpleaños, Boda..."><br>
                
                <label for="temati">Tematica el evento:</label>
                <input type="text" id="temati" name="tematica" class="ctrl" placeholder="Fiesta Retro, Neon party...">
            </div>
            
            
            <div>
                <h3>¿Qué género musical te gustaria escuchar?</h3>

                <label for="gen">Géneros favoritos:</label>  <!-- For es = al id -->
                <input type="text" id="gen" name="nombre_genero" class="ctrl" placeholder="Cumbia, salsa, Reggaetón...">
            </div>
            
            <div>
                <h3>¿Cuáles artistas son tus favoritos?</h3>

                <label for="art">Artistas: </label>  <!-- For es = al id -->
                <input type="text" id="art" name="nombre_artista" class="ctrl" placeholder="JBalvin, DuaLipa, Adele...">
            </div>
            
            <div>
                <h3>¿Algún grupo musical de tu agrado?</h3>

                <label for="gpom">Grupo Musical:</label>  <!-- For es = al id -->
                <input type="text" id="gpom" name=grupomusical" class="ctrl" placeholder="Coldplay, Queen...">
            </div>
            
            <div>
                <h3>Menciona canciones que no pueden faltar</h3>

                <label for="canf">Canciónes Favoritas: </label>  <!-- For es = al id -->
                <input type="text" id="canf" name=cancion_favorita" class="ctrl" placeholder="Moscow Mule-Bad Bunny">
            </div>
            
            <div>
                <h3>¿Cuentas con alguna Playlist que gustes compartir?</h3>
                
                <label for="nomp">Nombre Playlist:</label>  <!-- For es = al id -->
                <input type="text" id="nomp" name="nombreplaylist" class="ctrl" placeholder="Top 50: Global"><br>

                <label for="link">Link Playlist:</label>  <!-- For es = al id -->
                <input type="text" id="link" name=link_c" class="ctrl" placeholder="https://open.spotify.com/play">
            </div>
            
            <div>
                <h3>Menciona el lugar donde será tu evento</h3>
                
                <label for="lugar">Nombre Lugar:</label>  <!-- For es = al id -->
                <input type="text" id="lugar" name="nombre_lugar" class="ctrl" placeholder="World trade center"><br>

                <label for="direc">Dirección:</label>  <!-- For es = al id -->
                <input type="text" id="direc" name="direccion" class="ctrl" placeholder="Boulevard Manuel avila "><br>
                
                <label for="fe">Fecha:</label>  <!-- For es = al id -->
                <input type="date" id="fe" class="ctrl" name="fecha">
            </div>
            
            <div>
                <h3>Algún comentario u observación que desee añadir</h3>
                
                <label for="com">Comentarios:</label>  <!-- For es = al id -->
                <input type="text" id="com" name="comentario" class="com" placeholder="Me gustaria añadir...">

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
