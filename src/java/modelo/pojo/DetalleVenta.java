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
public class DetalleVenta {
    private Integer detalles_venta_id;
    private Integer cantidad;
    private Integer FK_venta_id;
    private Integer FK_producto_id;
    private int codeState;
    private String messageState;
    private int newId;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer detalles_venta_id, Integer cantidad, Integer FK_venta_id, Integer FK_producto_id, int codeState, String messageState, int newId) {
        this.detalles_venta_id = detalles_venta_id;
        this.cantidad = cantidad;
        this.FK_venta_id = FK_venta_id;
        this.FK_producto_id = FK_producto_id;
        this.codeState = codeState;
        this.messageState = messageState;
        this.newId = newId;
    }
    

    public Integer getDetalles_venta_id() {
        return detalles_venta_id;
    }

    public void setDetalles_venta_id(Integer detalles_venta_id) {
        this.detalles_venta_id = detalles_venta_id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getFK_venta_id() {
        return FK_venta_id;
    }

    public void setFK_venta_id(Integer FK_venta_id) {
        this.FK_venta_id = FK_venta_id;
    }

    public Integer getFK_producto_id() {
        return FK_producto_id;
    }

    public void setFK_producto_id(Integer FK_producto_id) {
        this.FK_producto_id = FK_producto_id;
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
