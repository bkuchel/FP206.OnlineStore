package Modelo;

public class Pedido {
    private String codigo;
    private String cliente;
    private String producto;
    private int cantidad;


    public Pedido(String codigo, String cliente, String producto, int cantidad) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}