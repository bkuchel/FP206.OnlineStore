package Vista;

import java.util.Scanner;

public class ClienteView {

    public int mostrarMenu() {
        int opcion = 0;
            System.out.println("MENU CLIENTES");
            System.out.println("___________________________");
            System.out.println("1 Agregar cliente");
            System.out.println("2 Ver clientes");
            System.out.println("3 Volver");

            opcion = new Scanner(System.in).nextInt();

            return opcion;

    }
}
