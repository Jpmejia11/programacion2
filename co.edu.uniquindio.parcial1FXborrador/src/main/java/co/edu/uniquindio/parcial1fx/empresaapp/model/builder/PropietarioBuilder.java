package co.edu.uniquindio.parcial1fx.empresaapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresaapp.model.Propietario;
import co.edu.uniquindio.parcial1fx.empresaapp.model.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class PropietarioBuilder {
    protected String nombre;
    protected String cedula;
    protected String email;
    protected String celular;
    protected Vehiculo vehiculoPrincipal;
    protected List<Vehiculo> listaVehiculosAsociados = new ArrayList<>();

    public PropietarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PropietarioBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public PropietarioBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PropietarioBuilder celular(String celular) {
        this.celular = celular;
        return this;
    }

    public PropietarioBuilder vehiculoPrincipal(Vehiculo vehiculoPrincipal) {
        this.vehiculoPrincipal = vehiculoPrincipal;
        return this;
    }

    public PropietarioBuilder listaVehiculosAsociados(List<Vehiculo> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
        return this;
    }
    public Propietario build(){
        return new Propietario(nombre,cedula,email,celular,vehiculoPrincipal,listaVehiculosAsociados);
    }
}
