/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.pojo.Usuario;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Dell
 */
public class UsuarioDAO {
    
    public static Usuario obtenerUsuario(Usuario usuario){
       Usuario sesion = null;
        SqlSession conexionBD = MyBatisUtil.getSession();
        if(conexionBD != null){
           try{
               
               sesion = conexionBD.selectOne("autenticacion.obtenerUsuario", usuario);
               
           }catch(Exception e){
               e.printStackTrace();
           }finally{
               conexionBD.close();
           }
        }
        
        return sesion;
    }
}
