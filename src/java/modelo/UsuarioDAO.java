/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.pojo.RespuestaUsuario;
import modelo.pojo.Usuario;
import modelo.pojo.Venta;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Dell
 */
public class UsuarioDAO {

    public static Usuario obtenerUsuario(Usuario usuario) {
        Usuario sesion = null;
        SqlSession conexionBD = MyBatisUtil.getSession();
        if (conexionBD != null) {
            try {
                sesion = conexionBD.selectOne("autenticacion.obtenerUsuario", usuario);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conexionBD.close();
            }
        }

        return sesion;
    }

    public static RespuestaUsuario registrarUsuario(Usuario usuario) {
        SqlSession session = MyBatisUtil.getSession();
        RespuestaUsuario respuesta = new RespuestaUsuario();

        if (session != null) {
            try {
                session.insert("usuario.registrar", usuario);

                respuesta.setCodeState(usuario.getCodeState());
                respuesta.setMessageState(usuario.getMessageState());
                respuesta.setNewId(usuario.getNewId());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                session.close();
            }
        }

        return respuesta;
    }
    

}
