package Vista;

import java.util.Scanner;

public class PedidosView {
    static Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("MENU PEDIDOS");
        System.out.println("___________________________");
        System.out.println("1 Nuevo pedido");
        System.out.println("2 Ver pedidos");
        System.out.println("3 Volver");

        int opcion = new Scanner(System.in).nextInt();

        return opcion;
    }

    public static String lecturaCodigo() {
        System.out.println("Codigo de pedido:");
        String codigoPedido = sc.nextLine();
        return codigoPedido;
    }

    public static String lecturaCodCliente() {
        System.out.println("Busca el cliente por codigo:");
        String codigoCliente = sc.nextLine();
        return codigoCliente;
    }

    public static String lecturaCodProducto() {
        System.out.println("Busca el producto por codigo:");
        String codigoProducto = sc.nextLine();
        return codigoProducto;
    }

    public static Integer lecturaCantidad() {
        System.out.println("Cantidad producto:");
        Integer cantidadPedido = sc.nextInt();
        return cantidadPedido;
    }
}
