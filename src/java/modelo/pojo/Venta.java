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
public class Venta {

    private Integer venta_id;
    private Float total;
    private String cliente;
    private Integer FK_usuario_id;
    private Integer cantidad;
    private Integer FK_producto_id; 
    private int codeState;
    private String messageState;
    private int newId;

    public Venta() {
    }

    public Venta(Integer venta_id, Float total, String cliente, Integer FK_usuario_id, Integer cantidad, Integer FK_producto_id, int codeState, String messageState, int newId) {
        this.venta_id = venta_id;
        this.total = total;
        this.cliente = cliente;
        this.FK_usuario_id = FK_usuario_id;
        this.cantidad = cantidad;
        this.FK_producto_id = FK_producto_id;
        this.codeState = codeState;
        this.messageState = messageState;
        this.newId = newId;
    }

    public Integer getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(Integer venta_id) {
        this.venta_id = venta_id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getFK_usuario_id() {
        return FK_usuario_id;
    }

    public void setFK_usuario_id(Integer FK_usuario_id) {
        this.FK_usuario_id = FK_usuario_id;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getFK_producto_id() {
        return FK_producto_id;
    }

    public void setFK_producto_id(Integer FK_producto_id) {
        this.FK_producto_id = FK_producto_id;
    }

}
