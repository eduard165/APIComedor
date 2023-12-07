package modelo.pojo;

public class Producto {
    private Integer producto_id;
    private String nombre_producto;
    private Integer inventario;
    private float precio;
    private String nombre_provedor;
    private Integer cantidad_total_vendida;
    private float monto_vendido;

    public Producto() {
    }

    public Producto(Integer producto_id, String nombre_producto, Integer inventario, float precio, String nombre_provedor, Integer cantidad_total_vendida, float monto_vendido) {
        this.producto_id = producto_id;
        this.nombre_producto = nombre_producto;
        this.inventario = inventario;
        this.precio = precio;
        this.nombre_provedor = nombre_provedor;
        this.cantidad_total_vendida = cantidad_total_vendida;
        this.monto_vendido = monto_vendido;
    }

    public Integer getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Integer producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre_provedor() {
        return nombre_provedor;
    }

    public void setNombre_provedor(String nombre_provedor) {
        this.nombre_provedor = nombre_provedor;
    }

    public Integer getCantidad_total_vendida() {
        return cantidad_total_vendida;
    }

    public void setCantidad_total_vendida(Integer cantidad_total_vendida) {
        this.cantidad_total_vendida = cantidad_total_vendida;
    }

    public float getMonto_vendido() {
        return monto_vendido;
    }

    public void setMonto_vendido(float monto_vendido) {
        this.monto_vendido = monto_vendido;
    }
    
    
    
    
}
