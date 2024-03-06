package co.edu.uniquidio.cliente.clienteapp.model;

public class Cliente {

    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private int edad;
    private String celular;

    public Cliente() {
    }

    public Cliente(String nombre,
                   String apellido,
                   String cedula,
                   String email,
                   int edad,
                   String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", celular='" + celular + '\'' +
                '}';
    }
}