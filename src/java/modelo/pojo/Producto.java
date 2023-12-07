package modelo.pojo;

public class Producto {
    private Integer producto_id;
    private String nombre_producto;
    private Integer inventario;
    private float precio;
    private String nombre_provedor;

    public Producto() {
    }

    public Producto(Integer producto_id, String nombre_producto, Integer inventario, float precio, String nombre_provedor) {
        this.producto_id = producto_id;
        this.nombre_producto = nombre_producto;
        this.inventario = inventario;
        this.precio = precio;
        this.nombre_provedor = nombre_provedor;
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
    
    
    
}
