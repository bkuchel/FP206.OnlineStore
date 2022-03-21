package Modelo;

import java.sql.Date;

public class Pedido {
    private int numero;
    private int cantidad;
    private Date fecha;
    private Cliente cliente;
    private Articulo articulo;


    public Pedido(int numero, int cantidad, Date fecha) {
        this.numero=numero;
        this.cantidad=cantidad;
        this.fecha=fecha;
        this.cliente=cliente;
        this.articulo=articulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}