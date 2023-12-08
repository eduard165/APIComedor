/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;
import java.util.List;
import modelo.pojo.DetalleVenta;
import modelo.pojo.RespuestaUsuario;
import modelo.pojo.Venta;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Dell
 */
public class VentaDAO {
    
        public static RespuestaUsuario registrarVenta(Venta venta){
        RespuestaUsuario respuesta = new RespuestaUsuario();
        SqlSession session = MyBatisUtil.getSession();
        
        if(session != null){
            try {
                session.insert("venta.registrar", venta);
                session.commit();
                System.out.println(venta.getDetalles().size());
                if (venta.getDetalles().size()!=0) {
                    insertarDetalles(venta.getNewId(), venta.getDetalles());
                    respuesta.setCodeState(venta.getCodeState());
                    respuesta.setMessageState(venta.getMessageState());
                    respuesta.setNewId(venta.getNewId());
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                session.close();
            }
        }
    
        return respuesta;
    }
        
        public static void insertarDetalles(Integer newId, List<DetalleVenta> ventas){
         SqlSession session = MyBatisUtil.getSession();
        
        if(session != null){
            try {
                if (ventas.size()>0) {
                    for(int i=0;i>=ventas.size();i++){
                        DetalleVenta detalle = ventas.get(i);
                        
                        detalle.setFK_venta_id(newId);
                        System.out.println(detalle.getFK_venta_id() + detalle.getCantidad());
                        session.insert("venta.registrarDetalle", detalle);
                        session.commit();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                session.close();
            }
        }   
        
        }
}
