package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombreEmpresa;
    private List<VehiculoCarga> listaVehiculoCarga = new ArrayList<>();
    private List<VehiculoTransporte> listaVehiculoTransporte = new ArrayList<>();
    private List<Propietario> listaPropietario = new ArrayList<>();
    private List<Usuario> listaUsuario = new ArrayList<>();
    private List<Vehiculo> listaVehichulo = new ArrayList();

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

    public List<Vehiculo> getListaVehichulo() {
        return listaVehichulo;
    }

    public void setListaVehichulo(List<Vehiculo> listaVehichulo) {
        this.listaVehichulo = listaVehichulo;
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

    public boolean crearPropietario(Propietario nuevoPropietario){
        Propietario propietarioEncontrado = obtenerPropietario();
        if (propietarioEncontrado ==null){
            Propietario propietario = getBuildPropietario();
            getListaPropietario().add(propietario);
            return true;
        }else{
            return false;
        }
    }

    private Propietario getBuildPropietario() {
        return getBuildPropietario();
    }

    private Propietario obtenerPropietario() {
        return obtenerPropietario();
    }

    public boolean crearVehiclo(String placa, String modelo, String marca, String color){
        Vehiculo vehiculoEncontrado = obtenerVehiculo(placa);
        if (vehiculoEncontrado == null) {
            Vehiculo vehiculo = getBuildVehiculo(placa, modelo, marca, color);
            getListaVehichulo().add(vehiculo);
            return true;
        }else{
            return false;
        }

    }
        private Vehiculo getBuildVehiculo(String placa, String modelo, String marca, String color) {
        return Vehiculo.builder()
                .placa(placa)
                .modelo(modelo)
                .marca(marca)
                .color(color)
                .build();
    }

    private Vehiculo obtenerVehiculo(String placa) {
        Vehiculo vehiculo = null;
        for (Vehiculo vehiculo1: getListaVehichulo()){
            if(vehiculo1.getPlaca().equalsIgnoreCase(placa)){
                vehiculo = vehiculo1;
                break;
            }
        }
        return vehiculo;
    }

    public int calcularNumPasajeros(String placa){
        int suma = 0;
        for (VehiculoTransporte vehiculoTransporte :this.listaVehiculoTransporte){
            if(vehiculoTransporte.getPlaca().equals(placa)){
                suma += vehiculoTransporte.getListaUsuariosAsociados().size();
            }
        }
        return suma;
    }

    public int calcularMayoresEdad(){
        int contador = 0;
        for (Usuario usuario :this.listaUsuario){
            if (usuario.getEdad() >= 18){
                contador++;
            }
        }
        return contador;
    }
}