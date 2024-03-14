package co.edu.uniquindio.parcial1fx.empresaapp.model;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private Propietario propietarioAsociado;
    private List<Propietario> listaPropietariosAsociados = new ArrayList<>();


    public Vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Propietario getPropietarioAsociado() {
        return propietarioAsociado;
    }

    public void setPropietarioAsociado(Propietario propietarioAsociado) {
        this.propietarioAsociado = propietarioAsociado;
    }

    public List<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }

    public void setListaPropietariosAsociados(List<Propietario> listaPropietariosAsociados) {
        this.listaPropietariosAsociados = listaPropietariosAsociados;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", propietarioAsociado=" + propietarioAsociado +
                '}';
    }
}
