
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estiloinicio.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <title>Menu</title>
    </head>


    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="ServletValidacion?action=contacto" target="myFrame">Contacto</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="ServletValidacion?action=consultar&acciones=Listar" target="myFrame">Consulta</a>
                    </li>
                </ul>
            </div>

            <div class="dropdown">
                <button style="border: none"  class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                    ${usuario.getNombre()}
                </button>

                <div class="dropdown-menu text-center" >
                    <a class="dropdown-item" href="#">
                        <img src="../imagenes/Iconos usuario login/user.png" alt="60" width="60"/>
                    </a>
                    <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
                    <a class="dropdown-item" href="#">admin@gmail.com</a>
                    <div class="dropdown-divider"></div>
                    <form action="ServletValidar" method="post">
                        <button name="accion" value="Salir" class="dropdown-item">Salir</button>
                    </form>
                </div>         
            </div>
        </nav>

        <div class="m-4" style="height: 850px;">
            <iframe name="myFrame" style="height: 100%; width: 100%"></iframe>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

    </body>
</html>
