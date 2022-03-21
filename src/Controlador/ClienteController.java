package Controlador;

import Modelo.Cliente;
import Modelo.Datos;
import Vista.ClienteView;

import java.util.List;

public class ClienteController {
    Datos bbdd = new Datos();

    public void subMenu() {
        ClienteView menuCliente = new ClienteView();
        int opcion = menuCliente.mostrarMenu();

        switch (opcion) {
            case 1:
                Cliente cliente = menuCliente.lecturaCliente();
                bbdd.agregarCliente(cliente);
                subMenu();
                break;
            case 2:
                List<Cliente> datos = bbdd.obtenerClientes();
                menuCliente.mostrarClientes(datos);
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
}