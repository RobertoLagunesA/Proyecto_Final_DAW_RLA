
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link href="css/estilologin.css" rel="stylesheet" type="text/css"/>       
    <title>Login</title>
    </head>
    <body>
         <header> <!-- Encabezado principal -->
            <div class="container">
                <p class="logo">DJ Art3mixx</p>
                <nav>
                <a href="inicio.jsp">Inicio </a>
                </nav>
            </div>
        </header>
   
        <div class="container mt-4 col-lg-6">
            <div class="card col-sm-15 ">
                 <div class="card-body text-center">
                     <form action="ServletValidar" method="post" class="">
                         <div class="form-group ">
                             <h3>Login</h3><br>
                             <img src="imagenes/Iconos usuario login/logo.png" alt="100" width="210"/>
                         </div>
                         
                         <div class="form-group ">
                             <label>Usuario:</label>
                             <input type="text" name="usuario" class="ctrl" placeholder="Ingrese su usuario" required>
                         </div>
                         
                         <div class="form-grou">
                             <label>Contraseña:</label>
                             <input type="password" name="contrasena" class="ctrl" placeholder="Ingrese su contraseña" required>
                             
                         </div>
                         <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">
                     </form>

                 </div>
            
            </div>
            
        </div>

        <footer>
            <div class="container">
                <p>Aplicación en construcción, disculpe las molestias:|  &copy; </p>
            </div>
        </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>
