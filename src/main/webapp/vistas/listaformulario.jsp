
<%@page import="Datos.GeneroSelectDAO"%>
<%@page import="Modelo.GeneroSelectJB"%>
<%@page import="Modelo.ComentariosJB"%>
<%@page import="Datos.ComentariosDAO"%>
<%@page import="Datos.LugarEventoDAO"%>
<%@page import="Modelo.LugarEventoJB"%>
<%@page import="Datos.PlaylistDAO"%>
<%@page import="Modelo.PlaylistJB"%>
<%@page import="Datos.CancionesDAO"%>
<%@page import="Modelo.CancionesJB"%>
<%@page import="Datos.GrupoMusicalDAO"%>
<%@page import="Modelo.GrupoMusicalJB"%>
<%@page import="Datos.ArtistaDAO"%>
<%@page import="Modelo.ArtistaJB"%>
<%@page import="Datos.GeneroDAO"%>
<%@page import="Modelo.GeneroJB"%>
<%@page import="Datos.TipoEventoDAO"%>
<%@page import="Modelo.TipoEventoJB"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estiloinicio.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <title>Lista de Formulario</title>
    </head>
    <body>
        <h1>Informacion de Formulario</h1><br>


        <div class="d-flex">
            <div class="card cold-sm">
                <div class="col-sm">
                    <br> <h3>Tipo de Evento</h3>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Categoria</th>
                                <th>Tipo de evento</th>
                                <th>Tematica del evento</th>
                                <th>Nombre del evento</th>
                                <th>Accion</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<TipoEventoJB> lista = TipoEventoDAO.searchAllEvento();
                                for (TipoEventoJB t : lista) {
                            %>
                            <tr>
                                <td> <%=t.getId_evento()%> </td>
                                <td> <%=t.getCategoria()%> </td>
                                <td> <%=t.getTipo()%> </td>
                                <td> <%=t.getTematica()%> </td>
                                <td> <%=t.getNom_tpo()%>  </td>
                                <td> <a class="btn btn-warning" href="editarCliente.jsp?id=<%=t.getId_evento()%>"> Editar </a> </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>

                    <br><!-- Tabla de genero -->
                    <h3>Genero</h3>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Genero</th>
                                <th>Accion</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<GeneroSelectJB> lista_gs = GeneroSelectDAO.searchAllGeneroSelect();
                                for (GeneroSelectJB gs : lista_gs) {
                            %>
                            <tr>
                                <td> <%=gs.getId_gen_select()%> </td>
                                <td> <%=gs.getGen_select()%> </td>

                                <td> <a class="btn btn-warning" href="editarCliente.jsp?id=<%=gs.getId_gen_select()%>">Editar</a> </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>

                    <br><!-- Tabla de artista -->
                    <h3>Artista</h3>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Artista</th>
                                <th>Accion</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<ArtistaJB> lista_a = ArtistaDAO.searchAllArtista();
                                for (ArtistaJB a : lista_a) {
                            %>
                            <tr>
                                <td> <%=a.getId_artista()%> </td>
                                <td> <%=a.getNombre_artista()%> </td>
                                <td> <a class="btn btn-warning" href="editarCliente.jsp?id=<%=a.getId_artista()%>">Editar</a> </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>

                    <br><!-- Tabla de Grupo Musical -->
                    <h3>Grupo Musical</h3>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Grupo Musical</th>
                                <th>Accion</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<GrupoMusicalJB> lista_gm = GrupoMusicalDAO.searchAllGrupo();
                                for (GrupoMusicalJB gm : lista_gm) {
                            %>
                            <tr>
                                <td> <%=gm.getId_grupo()%> </td>
                                <td> <%=gm.getNombre_grupo()%> </td>
                                <td> <a class="btn btn-warning" href="editarCliente.jsp?id=<%=gm.getId_grupo()%>">Editar</a> </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>

                    <br><!-- Tabla de Canciones -->
                    <h3>Canciones</h3>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Canciones</th>
                                <th>Accion</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<CancionesJB> lista_c = CancionesDAO.searchAllCanciones();
                                for (CancionesJB c : lista_c) {
                            %>
                            <tr>
                                <td> <%=c.getId_canciones()%> </td>
                                <td> <%=c.getCancion_favorita()%> </td>
                                <td> <a class="btn btn-warning" href="editarCliente.jsp?id=<%=c.getId_canciones()%>">Editar</a> </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>

                    <br><!-- Tabla de Playlist -->
                    <h3>Playlist</h3>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Link</th>
                                <th>Accion</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<PlaylistJB> lista_p = PlaylistDAO.searchAllPlaylist();
                                for (PlaylistJB p : lista_p) {
                            %>
                            <tr>
                                <td> <%=p.getId_playlist()%> </td>
                                <td> <%=p.getNom_play()%> </td>
                                <td> <%=p.getLink_c()%> </td>
                                <td> <a class="btn btn-warning" href="editarCliente.jsp?id=<%=p.getId_playlist()%>">Editar</a> </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>

                    <br><!-- Lugar Evento -->
                    <h3>Lugar evento</h3>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Direccion</th>
                                <th>Fecha</th>
                                <th>Accion</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<LugarEventoJB> lista_l = LugarEventoDAO.searchAllLugar();
                                for (LugarEventoJB l : lista_l) {
                            %>
                            <tr>
                                <td> <%=l.getId_lugar()%> </td>
                                <td> <%=l.getNombre_lugar()%> </td>
                                <td> <%=l.getDireccion()%> </td>
                                <td> <%=l.getFecha()%> </td>
                                <td> <a class="btn btn-warning" href="editarCliente.jsp?id=<%=l.getId_lugar()%>">Editar</a> </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>

                    <br><!-- Comentario -->
                    <h3>Comentarios</h3>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Comentarios</th>
                                <th>Accion</th>
                            </tr>
                        </thead>

                        <tbody>
                            <%
                                List<ComentariosJB> lista_co = ComentariosDAO.searchAllComentarios();
                                for (ComentariosJB co : lista_co) {
                            %>
                            <tr>
                                <td> <%=co.getId_comentarios()%> </td>
                                <td> <%=co.getComentarios()%> </td>
                                <td> <a class="btn btn-warning" href="editarCliente.jsp?id=<%=co.getId_comentarios()%>">Editar</a> </td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>


    </body>
</html>
