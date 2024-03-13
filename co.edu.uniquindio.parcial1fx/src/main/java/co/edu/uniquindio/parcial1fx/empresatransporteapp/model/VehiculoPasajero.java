package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

public class VehiculoPasajero extends Vehiculo{

    private int numeroMaximoPasajeros;

    public VehiculoPasajero() {
    }

    public VehiculoPasajero(String placa, String modelo, String marca, String color, int numeroMaximoPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }
}
