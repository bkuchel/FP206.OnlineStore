package Controlador;

import Vista.ClienteView;

public class ClienteController {

    public void subMenu() {
        ClienteView menuCliente = new ClienteView();
        int opcion = menuCliente.mostrarMenu();

        switch (opcion) {
            case 1:
                System.out.println("1 Gestionar clientes");
                break;
            case 2:
                System.out.println("1 Gestionar clientes");
                break;
            case 3:
                OnlineStore volver = new OnlineStore();
                volver.inicio();
            default:
                System.out.println("*** OPCION NO DISPONIBLE ***\n");
                subMenu();;

        }


    }
}

