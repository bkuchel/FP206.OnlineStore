package Modelo;

public class Premium extends Cliente{

    private double cuota;
    private double descuento;

    public Premium (String nif, String nombre, String email, String domicilio) {

        super(nif, nombre, email, domicilio);
        this.cuota = 30;
        this.descuento = 20;
    }

    public double getCuota() {
        return cuota * 12;
    }

    public double descuentoEnvio(double totalPedido) {
        return totalPedido - (totalPedido * 0.2);
    }

    @Override
    public String toString(){
        return  "Tipo de cliente: Premium" + "\n" +
                "NIF: " + this.getNif() + "\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Domicilio: " + this.getDomicilio() + "\n"+
                "Cuota: " + this.cuota + "\n" +
                "Descuento en el envio: " + this.descuento;

    }
}
