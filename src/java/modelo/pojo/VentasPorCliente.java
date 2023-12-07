package modelo.pojo;
public class VentasPorCliente {
    private String cliente;
    private Integer total_ventas;

    public VentasPorCliente() {
    }

    public VentasPorCliente(String cliente, Integer total_ventas) {
        this.cliente = cliente;
        this.total_ventas = total_ventas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(Integer total_ventas) {
        this.total_ventas = total_ventas;
    }
    
    
}
