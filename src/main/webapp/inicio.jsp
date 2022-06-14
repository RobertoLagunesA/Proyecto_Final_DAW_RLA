
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Inicio</title>
        <link href="css/estiloinicio.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <body>
        
        <header> <!-- Encabezado principal -->
            <div class="container">
                <p class="logo">DJ Art3mixx</p>
                <nav>
                <a href="inicio.jsp">Inicio </a>
                <a href="formulario.jsp">Formulario </a>
                <a href="contacto.jsp">Contacto </a>
                <a href="login.jsp">Login </a>
                </nav>
            </div>
        </header>
        
     
        
        <section id="hero"> <!-- INICIO Primera seccion  -->
            <h1>Elige tu temática, tu música <br> y tú estilo.</h1>
                            <form action="formulario.jsp">
                    <button>Empezar Formulario</button>
                </form>
        </section> <!-- FIN Primera seccion  -->
        
        <section id="somosdj"> <!--  INICIO Segunda seccion  -->
            <div class="container">
            <div class="imgdj"></div>
            
            <div class="texto">
                <h2>Buscamos lo mejor <br> para tu evento</h2>
            <p>Soy un DJ de eventos sociales, amante de la musica, de la fiesta y del ambiente que busca la forma de darte
            un mejor servicio por lo que pongo a tu disposición una manera mas
            efectiva de llevar tu evento.</p>
            </div>
            </div>
            
        </section> <!--  FIN Segunda seccion  -->
        
        <section id="nuestroservicio"> <!-- INICIO Tercera seccion  -->
            <div class="container">
            <h2>Información</h2>
            <div class="programas">
            
            <div class="servicios">
                <h3>Formulario de Evento</h3>
                <p>El DJ del evento podra saber todo lo relacionado al mismo, tomando en cuenta
                varios factores a los cuales se podra acoplar de acuerdo a tu informacion .</p>
                <form action="formulario.jsp">
                    <button>+ Info</button>
                </form>
            </div>
                <div class="servicios">
                <h3>Música</h3>
                <p>Musica top del momento, los mejores hits, los artistas mas escuchados, una seccion
                    para saber mas a fondo el ambiente que tendra tu evento.</p>
                    <form action="formulario.jsp">
                      <button>+ Info</button>
                    </form>
            </div>
                <div class="servicios">
                <h3>Mixes</h3>
                <p>Las mejores mezclas y recopilacion musical hechas mixs, tu genero favorito, la duracion
                perfecta para cualquier ambiente o actividad en el dia a dia.</p>
                <form action="formulario.jsp">
                    <button>+ Info</button>
                </form>
            </div>
            
            </div>
            </div>
        </section> <!-- FIN Tercera seccion  -->
 

        <footer>
            <div class="container">
                <p>Aplicación en construcción, disculpe las molestias:|  &copy; </p>
            </div>
        </footer>
        
    </body>
</html>
