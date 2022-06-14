package Controlador;

import Datos.ArtistaDAO;
import Datos.CancionesDAO;
import Datos.ClienteDAO;
import Datos.ComentariosDAO;
import Datos.GeneroSelectDAO;
import Datos.GrupoMusicalDAO;
import Datos.LugarEventoDAO;
import Datos.PlaylistDAO;
import Datos.TipoEventoDAO;


import Modelo.ArtistaJB;
import Modelo.CancionesJB;
import Modelo.ClienteJB;
import Modelo.ComentariosJB;
import Modelo.GeneroSelectJB;
import Modelo.GrupoMusicalJB;
import Modelo.LugarEventoJB;
import Modelo.PlaylistJB;
import Modelo.TipoEventoJB;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletFormulario", value = "ServletFormulario")
public class ServletFormulario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Cliente
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");

        ClienteJB e = new ClienteJB();
        
        e.setNombre(nombre);
        e.setApellido(apellido);
        e.setTelefono(telefono);
        e.setCorreo(correo);
        
        int estatus = ClienteDAO.insertCliente(e);
        if (estatus > 0);
        
         
        //Tipo de Evento
    
        String categoria = request.getParameter("categoria");
        String tipo = request.getParameter("tipo");
        String tematica = request.getParameter("tematica");
        String nom_tpo= request.getParameter("nom_tpo");

        TipoEventoJB t = new TipoEventoJB();
        
        t.setCategoria(categoria);
        t.setTipo(tipo);
        t.setTematica(tematica);
        t.setNom_tpo(nom_tpo);

        int estatus_t = TipoEventoDAO.insertEvento(t);
        if (estatus_t > 0);
            
         
        //Genero 
        /*
        String gen_select;
        gen_select = request.getParameter("gen_select");
        
        GeneroSelectJB gs = new GeneroSelectJB();
        gs.setGen_select(gen_select);
        
        int estatus_gs = GeneroSelectDAO.insertGeneroSelect(gs);
        if (estatus_gs > 0);
        */
        
        //Artista
        String nombre_artista = request.getParameter("nombre_artista");
        ArtistaJB a = new ArtistaJB();
        a.setNombre_artista(nombre_artista);
        int estatus_art = ArtistaDAO.insertArtista(a);
        if (estatus_art > 0);
       
        //Grupo Musical
        String nombre_grupo = request.getParameter("nombre_grupo");
        GrupoMusicalJB gm = new GrupoMusicalJB();
        gm.setNombre_grupo(nombre_grupo);

        int estatus_gm = GrupoMusicalDAO.insertGrupo(gm);
        if (estatus_gm > 0);
      
        
        //Canciones
        String cancion_favorita = request.getParameter("cancion_favorita");        
        CancionesJB c = new CancionesJB();
        c.setCancion_favorita(cancion_favorita);
        
        int estatus_can = CancionesDAO.insertCanciones(c);
        if (estatus_can > 0);
       
        
        //Playlist
        String nom_play = request.getParameter("nom_play");
        String link_c = request.getParameter("link_c");

        PlaylistJB p = new PlaylistJB();
        p.setNom_play(nom_play);
        p.setLink_c(link_c);

        int estatus_p = PlaylistDAO.insertPlaylist(p);
        if (estatus_p > 0);
      
        
        //Lugar Evento
        String nombre_lugar = request.getParameter("nombre_lugar");
        String direccion = request.getParameter("direccion");
        String fecha = request.getParameter("fecha");

        LugarEventoJB l = new LugarEventoJB();
        l.setNombre_lugar(nombre_lugar);
        l.setDireccion(direccion);
        l.setFecha(fecha);

        int estatus_l = LugarEventoDAO.insertLugar(l);
        if (estatus_l > 0);
        
       
        //Comentarios
        String comentario = request.getParameter("comentario");
        
        ComentariosJB co = new ComentariosJB();
        
        co.setComentarios(comentario);
        int estatus_co = ComentariosDAO.insertComentario(co);
        if (estatus_co > 0) { 
            response.sendRedirect("vistas/registroExitoso.jsp");
        } else { 
            response.sendRedirect("vistas/error.jsp");
        }
        
        }
    }

     

    
    