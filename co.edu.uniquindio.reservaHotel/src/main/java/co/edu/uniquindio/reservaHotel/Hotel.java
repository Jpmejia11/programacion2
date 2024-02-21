package co.edu.uniquindio.reservaHotel;

public abstract class Hotel {

    protected String nombre;
    protected String direccion;
    protected String correo;
    protected int telefono;

    public Hotel(String nombre, String direccion, String correo, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public abstract int getNumReservasActivas();

    @Override
    public String toString() {
        return super.toString();
    }
}
