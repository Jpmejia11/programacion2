package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombreEmpresa;

    private List<VehiculoCarga> listaVehiculoCarga = new ArrayList<>();
    private List<VehiculoTransporte> listaVehiculoTransporte = new ArrayList<>();
    private List<Propietario> listaPropietario = new ArrayList<>();

    private List<Usuario> listaUsuario = new ArrayList<>();

    public EmpresaTransporte() {
    }
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public List<VehiculoCarga> getListaVehiculoCarga() {
        return listaVehiculoCarga;
    }

    public void setListaVehiculoCarga(List<VehiculoCarga> listaVehiculoCarga) {
        this.listaVehiculoCarga = listaVehiculoCarga;
    }

    public List<VehiculoTransporte> getListaVehiculoTransporte() {
        return listaVehiculoTransporte;
    }

    public void setListaVehiculoTransporte(List<VehiculoTransporte> listaVehiculoTransporte) {
        this.listaVehiculoTransporte = listaVehiculoTransporte;
    }

    public List<Propietario> getListaPropietario() {
        return listaPropietario;
    }

    public void setListaPropietario(List<Propietario> listaPropietario) {
        this.listaPropietario = listaPropietario;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
}
