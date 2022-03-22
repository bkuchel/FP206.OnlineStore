package Modelo;
import java.util.ArrayList;

public class Datos {

    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    private ArrayList<Pedido> pedidos;

    public Datos() {
        productos = new ArrayList<Producto>();
        clientes = new ArrayList<Cliente>();
        pedidos = new ArrayList<Pedido>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

}
