/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.pojo;

/**
 *
 * @author Manuel Hernandez
 */
public class RespuestaUsuario {

    private Integer codeState;
    private String messageState;
    private Integer newId;

    public RespuestaUsuario() {
    }

    public RespuestaUsuario(Integer codeState, String messageState, Integer newId) {
        this.codeState = codeState;
        this.messageState = messageState;
        this.newId = newId;
    }

    public Integer getCodeState() {
        return codeState;
    }

    public void setCodeState(Integer codeState) {
        this.codeState = codeState;
    }

    public String getMessageState() {
        return messageState;
    }

    public void setMessageState(String messageState) {
        this.messageState = messageState;
    }

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

}
