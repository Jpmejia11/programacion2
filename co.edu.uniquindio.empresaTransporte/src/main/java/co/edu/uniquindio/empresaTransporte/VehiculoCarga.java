package co.edu.uniquindio.empresaTransporte;

public class VehiculoCarga {

    private Double capacidadCarga;
    private Integer numeroEjes;

    public VehiculoCarga(Double capacidadCarga, Integer numeroEjes) {
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Integer getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(Integer numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
