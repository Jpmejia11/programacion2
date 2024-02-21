package co.edu.uniquindio.reservaHotel;

public class Reserva extends Habitacion{

    protected String fechaEntrada;
    protected String fechaSalida;

    public Reserva(String nombre, String direccion, String correo, int telefono, int numHabitacion, String tipoHabitacion, double precioHabitacion, String fechaEntrada, String fechaSalida) {
        super(nombre, direccion, correo, telefono, numHabitacion, tipoHabitacion, precioHabitacion);
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Reserva() {
        super("Sanroco","Uribe","sanroco@hotmail.com",111111,101,"Simple",10000);
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }


}
