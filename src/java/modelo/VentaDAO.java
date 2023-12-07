/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
                
                respuesta.setCodeState(venta.getCodeState());
                respuesta.setMessageState(venta.getMessageState());
                respuesta.setNewId(venta.getNewId());
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                session.close();
            }
        }
    
        return respuesta;
    }
}
