/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.pojo;

/**
 *
 * @author Dell
 */
public class Usuario {

    private Integer usuario_id;
    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private Integer FK_tipo_usuario_id;
    private int codeState;
    private String messageState;
    private int newId;

    public Usuario() {
    }

    public Usuario(Integer usuario_id, String usuario, String contrasena, String nombre, String apellido_paterno, String apellido_materno, Integer FK_tipo_usuario_id, int codeState, String messageState, int newId) {
        this.usuario_id = usuario_id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.FK_tipo_usuario_id = FK_tipo_usuario_id;
        this.codeState = codeState;
        this.messageState = messageState;
        this.newId = newId;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public Integer getFK_tipo_usuario_id() {
        return FK_tipo_usuario_id;
    }

    public void setFK_tipo_usuario_id(Integer FK_tipo_usuario_id) {
        this.FK_tipo_usuario_id = FK_tipo_usuario_id;
    }

    public int getCodeState() {
        return codeState;
    }

    public void setCodeState(int codeState) {
        this.codeState = codeState;
    }

    public String getMessageState() {
        return messageState;
    }

    public void setMessageState(String messageState) {
        this.messageState = messageState;
    }

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

}
