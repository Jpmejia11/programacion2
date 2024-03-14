package co.edu.uniquindio.parcial1fx.empresaapp.model;

public class Usuario {
    private int edad;
    private VehiculoTransporte vehiculoAsociado;

    public Usuario() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Vehiculo getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoTransporte vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "edad=" + edad +
                ", vehiculoAsociado=" + vehiculoAsociado +
                '}';
    }
}
