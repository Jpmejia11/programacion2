package co.edu.uniquindio.parcial1fx.empresaapp.model;

import co.edu.uniquindio.parcial1fx.empresaapp.model.builder.PropietarioBuilder;

import java.util.ArrayList;
import java.util.List;

public class Propietario {

    private String nombre;
    private String cedula;
    private String email;
    private String celular;
    private Vehiculo vehiculoPrincipal;
    private List<Vehiculo> listaVehiculosAsociados = new ArrayList<>();

    public Propietario(String nombre,
                       String cedula,
                       String email,
                       String celular,
                       Vehiculo vehiculoPrincipal,
                       List<Vehiculo> listaVehiculosAsociados) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.vehiculoPrincipal = vehiculoPrincipal;
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    public static PropietarioBuilder builder(){
        return new PropietarioBuilder();
    }

    public String getNombre() {
        return nombre;
    }


    public String getCedula() {
        return cedula;
    }


    public String getEmail() {
        return email;
    }


    public String getCelular() {
        return celular;
    }


    public Vehiculo getVehiculoPrincipal() {
        return vehiculoPrincipal;
    }


    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }
    

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", vehiculoPrincipal=" + vehiculoPrincipal +
                '}';
    }
}
