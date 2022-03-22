package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Datos {

    private ArrayList<Cliente> clientes;

    public Datos() {

        //articulos = new ArrayList<Articulo>();
        clientes=new ArrayList<Cliente>();
        //pedidos=new ArrayList<Pedido>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
/*
    public boolean agregarPremium(Premium cliente) {
        datosClientes.add(cliente);
        return true;
    }


    public List<Estandar> obtenerEstandar() {
        return datosEstandar;
    }

    public List<Premium> obtenerPremium() {
        return datosPremium;
    }
}

*/
/*
package Modelo;
import Vista.AppView;

import java.util.ArrayList;
import java.util.List;

public class Datos {
    public AppView vista;
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