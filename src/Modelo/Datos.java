package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Datos {

    private List<Cliente> datosCliente = new ArrayList<>();
    private List<Pedido> datosPedidos = new ArrayList<>();
    private List<Articulo> datosArticulo = new ArrayList<>();

    
    public boolean agregarCliente(Cliente cliente) {
        datosCliente.add(cliente);
        return true;
    }

    public List<Cliente> obtenerClientes() {
        return datosCliente;
    }
}

/*
import Vista.InterfazView;

import java.util.ArrayList;
import java.util.List;

public class Datos {
    public InterfazView vista;
    private ArrayList<Articulo> articulos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;


    public Datos() {

        articulos = new ArrayList<Articulo>();
        clientes=new ArrayList<Cliente>();
        pedidos=new ArrayList<Pedido>();
    }



    public void addArticulo(Articulo articulo){
        articulos.add(articulo);
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    //faltan booleanos de encontrar pedidos etc e itinetaror//

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }        }

 */