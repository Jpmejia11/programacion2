package co.edu.uniquindio.empresaTransporte;

public class VehiculoPasajeros {

    private Integer capacidadPasajeros;
    private Integer numeroEjes;

    public VehiculoPasajeros(Integer capacidadPasajeros, Integer numeroEjes) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.numeroEjes = numeroEjes;
    }

    public Integer getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(Integer capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public Integer getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(Integer numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
