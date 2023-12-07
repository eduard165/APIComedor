/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import modelo.VentaDAO;
import modelo.pojo.RespuestaUsuario;
import modelo.pojo.Venta;

/**
 * REST Web Service
 *
 * @author Dell
 */
@Path("ventas")
public class VentaWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of VentaWS
     */
    public VentaWS() {
    }

 
    @POST
    @Path("registrar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaUsuario registrarVenta(String json) {
        Gson gson = new Gson();
        
        Venta venta = gson.fromJson(json, Venta.class);
        if(venta!= null){
            return VentaDAO.registrarVenta(venta);
        }else{
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
    }
}
