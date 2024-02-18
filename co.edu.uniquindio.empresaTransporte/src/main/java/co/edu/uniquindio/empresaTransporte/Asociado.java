package co.edu.uniquindio.empresaTransporte;

public class Asociado {

    private String nombreAsociado;
    private Integer numeroId;
    private String correo;
    private Integer numeroCelular;

    public Asociado(String nombreAsociado, Integer numeroId, String correo, Integer numeroCelular) {
        this.nombreAsociado = nombreAsociado;
        this.numeroId = numeroId;
        this.correo = correo;
        this.numeroCelular = numeroCelular;
    }

    public String getNombreAsociado() {
        return nombreAsociado;
    }

    public Integer getNumeroId() {
        return numeroId;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNombreAsociado(String nombreAsociado) {
        this.nombreAsociado = nombreAsociado;
    }

    public void setNumeroId(Integer numeroId) {
        this.numeroId = numeroId;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

}
