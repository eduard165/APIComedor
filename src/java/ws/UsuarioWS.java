/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import modelo.UsuarioDAO;
import modelo.pojo.RespuestaUsuario;
import modelo.pojo.Usuario;

/**
 * REST Web Service
 *
 * @author Dell
 * @author Manuel Hernandez
 */
@Path("usuario")
public class UsuarioWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsuarioWS
     */
    public UsuarioWS() {
    }

    @POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Usuario conexion(String json) {
        Gson gson = new Gson();
        Usuario usuario = gson.fromJson(json, Usuario.class);

        return UsuarioDAO.obtenerUsuario(usuario);
    }

    @POST
    @Path("registrar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaUsuario registrar(String json) {
        Gson gson = new Gson();
        Usuario usuario = gson.fromJson(json, Usuario.class);

        return UsuarioDAO.registrarUsuario(usuario);
    }

    @DELETE
    @Path("eliminar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaUsuario eliminar(String json) {
        Gson gson = new Gson();
        Usuario usuario = gson.fromJson(json, Usuario.class);
        RespuestaUsuario respuesta = null;

        try {
            respuesta = UsuarioDAO.eliminarUsuario(usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return respuesta;
    }

    @PUT
    @Path("editar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaUsuario editar(String json) {
        Gson gson = new Gson();
        Usuario usuario = gson.fromJson(json, Usuario.class);
        RespuestaUsuario respuesta = null;

        try {
            respuesta = UsuarioDAO.editarUsuario(usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return respuesta;
    }
}
