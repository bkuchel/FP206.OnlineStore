package Controlador;

import Modelo.Producto;
import Modelo.Datos;
import Vista.ProductosView;

import java.util.List;

public class ProductosController {
    Datos bbdd = new Datos();
    ProductosView menuProducto = new ProductosView();
    OnlineStore volver = new OnlineStore();

    public void subMenu() {

        int opcion = menuProducto.mostrarMenu();

        switch (opcion) {
            case 1:
                nuevoProducto();
                subMenu();
                break;
            case 2:
                verProductos();
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

        public void nuevoProducto() {
            List parametros = menuProducto.lecturaProducto();

            //String codigo = parametros.get(0).toString();
            String nombre = parametros.get(0).toString();
            float precioVenta = Float.parseFloat(parametros.get(1).toString());
            float gastosEnvio = Float.parseFloat(parametros.get(2).toString());
            int tiempoPrep = Integer.parseInt(parametros.get(3).toString());

            Producto datosProducto = new Producto(null,nombre, precioVenta, gastosEnvio, tiempoPrep);
            bbdd.agregarProducto(datosProducto);
        }


        public void verProductos() {
            List<Producto> datos = bbdd.getProductos();
            menuProducto.mostrarProductos(datos);
        }


}
