package co.edu.uniquindio.parcial1fx.empresaapp.model;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo {
    private int maximoPasajeros;
    private List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporte() {
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    public void setListaUsuariosAsociados(List<Usuario> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "maximoPasajeros=" + maximoPasajeros +
                '}';
    }
}


