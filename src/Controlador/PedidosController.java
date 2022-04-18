package Controlador;

import Modelo.*;
import Vista.PedidosView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
                verPedidos();
                subMenu();
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

        List parametros = menuPedido.lecturaPedido();
        bbdd.agregarPedido(parametros);
        }

    public void verPedidos() {
        List<Pedido> datos = bbdd.getPedidos();
        menuPedido.mostrarPedidos(datos);
    }

    }

