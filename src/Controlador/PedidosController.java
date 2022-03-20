package Controlador;

import Vista.PedidosView;

public class PedidosController {

    public void subMenu() {
        PedidosView menuPedidos = new PedidosView();
        int opcion = menuPedidos.mostrarMenu();

        switch (opcion) {
            case 1:
                System.out.println("1 Gestionar productos");
                break;
            case 2:
                System.out.println("1 Gestionar clientes");
                break;
            case 3:
                OnlineStore volver = new OnlineStore();
                volver.inicio();
            default:
                System.out.println("*** OPCION NO DISPONIBLE ***\n");
                subMenu();

        }


    }
}
