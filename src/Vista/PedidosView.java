package Vista;

import java.util.Scanner;

public class PedidosView {

    public int mostrarMenu() {
        System.out.println("MENU PEDIDOS");
        System.out.println("___________________________");
        System.out.println("1 Nuevo pedido");
        System.out.println("2 Ver pedidos");
        System.out.println("3 Volver");

        int opcion = new Scanner(System.in).nextInt();

        return opcion;
    }
}
