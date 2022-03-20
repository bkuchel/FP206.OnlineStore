package Vista;

import java.util.Scanner;

public class ProductosView {

    public int mostrarMenu() {
        System.out.println("MENU PRODUCTOS");
        System.out.println("___________________________");
        System.out.println("1 Agregar productos");
        System.out.println("2 Ver productos");
        System.out.println("3 Volver");

        int opcion = new Scanner(System.in).nextInt();

        return opcion;
    }
}
