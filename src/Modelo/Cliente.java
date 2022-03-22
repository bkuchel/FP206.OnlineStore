package Modelo;

public class Cliente {
    private String email;
    private String nombre;
    private String domicilio;
    private String nif;

    public Cliente(String nif, String nombre, String email, String domicilio){
        this.nif = nif;
        this.nombre = nombre;
        this.email = email;
        this.domicilio = domicilio;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail() {
        this.email = email;
    }


    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

}