package co.edu.uniquindio.reservaHotel;

public class Cliente{

protected String nombreCliente;
protected int dni;
protected int numReservasActivas;



    public Cliente(String nombre, String direccion, String correo, int telefono, int numHabitacion, String tipoHabitacion, double precioHabitacion, String fechaEntrada, String fechaSalida, String nombreCliente, int dni, int numReservasActivas) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.numReservasActivas = numReservasActivas;
    }

    public Cliente() {
        System.out.println("Juan");
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumReservasActivas() {
        return numReservasActivas;
    }

    public void setNumReservasActivas(int numReservasActivas) {
        this.numReservasActivas = numReservasActivas;
    }
}


