package Controlador;

import Modelo.Cliente;
import Modelo.Datos;
import Modelo.Pedido;
import Modelo.Producto;
import Vista.PedidosView;

import java.util.ArrayList;
import java.util.Iterator;

public class PedidosController {
    Datos bbdd = new Datos();
    PedidosView menuPedido = new PedidosView();
    OnlineStore volver = new OnlineStore();

    public void subMenu() {
        PedidosView menuPedidos = new PedidosView();
        int opcion = menuPedidos.mostrarMenu();

        switch (opcion) {
            case 1:
                nuevoPedido();
                subMenu();
                break;
            case 2:
                System.out.println("TODO");
                break;
            case 3:
                OnlineStore volver = new OnlineStore();
                volver.inicio();
            default:
                System.out.println("*** OPCION NO DISPONIBLE ***\n");
                subMenu();

        }
    }

    public void nuevoPedido() {
        String codigoPedido = menuPedido.lecturaCodigo();

        String codigoCliente = menuPedido.lecturaCodCliente();
        String cliente = buscarCliente(codigoCliente);

        String codigoProducto = menuPedido.lecturaCodProducto();
        Integer cantidad = menuPedido.lecturaCantidad();
        String producto = buscarProducto(codigoProducto);

        Pedido datosPedido = new Pedido(codigoPedido, cliente, producto, cantidad);
    }

    public String buscarCliente(String nifCliente) {
        ArrayList clientes = bbdd.getClientes();


        Iterator<Cliente> iter = clientes.iterator();
        String nombre = iter.next().getNombre();
        boolean encontrado = false;


        while (iter.hasNext()) {
            if (iter.next().getNif().equals(nifCliente)) {
                encontrado = true;
                nombre = iter.next().getNombre();
            }
        }
        if (!encontrado) {
            return "*** Cliente no encontrado\n";
        } else {
            return nombre;
        }
    }

    public String buscarProducto(String codProducto) {
        ArrayList productos = bbdd.getProductos();


        Iterator<Producto> iter = productos.iterator();
        String nombre = iter.next().getNombre();
        boolean encontrado = false;


        while (iter.hasNext()) {
            if (iter.next().getCodigo().equals(codProducto)) {
                encontrado = true;
                nombre = iter.next().getNombre();
            }
        }
        if (!encontrado) {
            return "*** Producto no encontrado\n";
        } else {
            return nombre;
        }
    }
    }

