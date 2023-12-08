/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.pojo.Producto;
import modelo.pojo.VentasPorCliente;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author aaron
 */
public class ProductoDAO {

    public static List<Producto> obtenerProductoPorNombreProvedor(Producto producto) {
        List<Producto>respuesta = new ArrayList();
        SqlSession conexionDB = mybatis.MyBatisUtil.getSession();
       
        if (conexionDB != null){
            try {
                respuesta=conexionDB.selectList("productos.buscarPorNombre", producto);
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                conexionDB.close();         
            }
        }
       
        return respuesta;
        
    }

    public static List obtenerVentasPorProductos() {
        List<Producto>respuesta = new ArrayList<>();
        SqlSession conexionDB = mybatis.MyBatisUtil.getSession();
        
        if (conexionDB != null){
            try {
                respuesta = conexionDB.selectList("productos.obtenerPorVentas");
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                conexionDB.close();
            }
        }
        return respuesta;
    }

    public static List obtenerReporteVentasPorProveedor(Integer proveedor_id) {
        List<Producto> respuesta = new ArrayList<>();
        SqlSession conexionDB = mybatis.MyBatisUtil.getSession();
        
        if (conexionDB != null){
            try {
                respuesta = conexionDB.selectList("productos.obtenerReporteVentasProovedor",proveedor_id);
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                conexionDB.close();
            }
        }
        return respuesta;
    }

    public static List obtenerReporteVentasPorTipoCliente() {
        List<VentasPorCliente> respuesta = new ArrayList<>();
        SqlSession conexionDB = mybatis.MyBatisUtil.getSession();
        
         if (conexionDB != null){
            try {
                respuesta = conexionDB.selectList("productos.obtenerReporteVentasPorTipoCliente");
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                conexionDB.close();
            }
        }
        return respuesta;
    }
        
    
    
}
