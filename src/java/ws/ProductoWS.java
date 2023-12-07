package ws;


import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import modelo.ProductoDAO;
import modelo.pojo.Producto;
import modelo.pojo.VentasPorCliente;

@Path("productos")
public class ProductoWS {
    
    @Context
    private UriInfo context;
    
    public ProductoWS() {
    }
    
    @GET
    @Path("obtenerProductoNombreProvedor/{nombre_producto}/{nombre_provedor}")
    @Produces(MediaType.APPLICATION_JSON)
    //@Consumes(MediaType.APPLICATION_JSON)
    public List<Producto> obtenerProductos(@PathParam("nombre_producto") String nombre_producto,
        @PathParam("nombre_provedor") String nombre_provedor){
        Producto producto= new Producto();
        producto.setNombre_producto(nombre_producto);
        producto.setNombre_provedor(nombre_provedor);
        List productos = ProductoDAO.obtenerProductoPorNombreProvedor(producto);     
        return productos;
    }
    
    @GET
    @Path("obtenerVentasPorProductos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> obtenerVentasPorProductos(){
        
        List productos = ProductoDAO.obtenerVentasPorProductos();
        
    return productos;
    }
    
    @GET
    @Path("obtenerReporteVentasPorProveedor/{proveedor_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> obtenerReporteVentasPorProveedor(
            @PathParam("proveedor_id") Integer proveedor_id){
        
        List productos = ProductoDAO.obtenerReporteVentasPorProveedor(proveedor_id);
        
        return productos;
    }
    
    @GET
    @Path("obtenerReporteVentasPorTipoCliente")
    @Produces(MediaType.APPLICATION_JSON)
    public List<VentasPorCliente> obtenerReporteVentasPorTipoCliente(){
        
        List ventasClientes = ProductoDAO.obtenerReporteVentasPorTipoCliente();
        
    return ventasClientes;
    }
}
