package co.edu.uniquindio.reservaHotel;

public class Habitacion extends Hotel {

    protected int numHabitacion;
    protected String tipoHabitacion;
    protected double precioHabitacion;


    public Habitacion(String nombre, String direccion, String correo, int telefono, int numHabitacion, String tipoHabitacion, double precioHabitacion) {
        super(nombre, direccion, correo, telefono);
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public int getNumReservasActivas() {
        return 5;
    }
}
