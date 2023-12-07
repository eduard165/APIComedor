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

    private int codeState;
    private String messageState;
    private int newId;

    public RespuestaUsuario() {
    }

    public RespuestaUsuario(int codeState, String messageState, int newId) {
        this.codeState = codeState;
        this.messageState = messageState;
        this.newId = newId;
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
