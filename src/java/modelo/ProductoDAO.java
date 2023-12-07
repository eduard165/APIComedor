/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.pojo.Producto;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author aaron
 */
public class ProductoDAO {

    public static List<Producto> obtenerProductoPorNombreProvedor(Producto producto) {
        List<Producto>respuesta = new ArrayList();
        SqlSession conexionDB = mybatis.MyBatisUtil.getSession();
        System.out.println(producto.getNombre_producto());
        if (conexionDB != null){
            try {
                respuesta=conexionDB.selectList("productos.buscarPorNombre", producto);
                System.out.println("Longitud de lista"+respuesta.size());
                if (respuesta.size() > 0){
                    System.out.println("si jalaaaa");
                }
            } catch (Exception e) {
            }finally{
            }
        }
       
        return respuesta;
        
    }
    
}
