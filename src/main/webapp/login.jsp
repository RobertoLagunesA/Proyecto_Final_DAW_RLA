
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


        <div class="modal-dialog text-center">
            <div class="col-sm-8 main-section">
                <div class="modal-content">
                <div class="col-12 user-img">
                    <img src="imagenes/Iconos usuario login/user.png" alt="60" width="100" />
                </div>
                    <form class="col-12" action="ServletValidar" method="post" >

                        <div class="form-group" id="user-group">
                            <label class="leter">Usuario:</label>
                            <input type="text" name="usuario" class="form-control" placeholder="Ingrese su usuario" required>
                       </div>

                        <div class="form-group" id="contrasena-group">
                            <label class="leter">Contraseña:</label>
                            <input type="password" name="contrasena" class="form-control" placeholder="Ingrese su contraseña" required><br>
 
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-warning">
                    </form><br>
                </div>
            </div>
        </div><br>


        <footer>
            <div class="container">
                <p>Aplicación en construcción, disculpe las molestias:|  &copy; </p>
            </div>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>
