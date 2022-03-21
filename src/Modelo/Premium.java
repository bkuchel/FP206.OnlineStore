package Modelo;

public class Premium extends Cliente{

    private int cuota;

    public Premium(String email, String nombre, String domicilio, String nif) {
        super(email, nombre, domicilio, nif);
        this.cuota=cuota;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }
}
