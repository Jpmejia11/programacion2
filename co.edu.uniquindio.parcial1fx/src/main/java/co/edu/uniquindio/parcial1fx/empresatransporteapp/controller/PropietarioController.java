package co.edu.uniquindio.parcial1fx.empresatransporteapp.controller;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.factory.ModelFactory;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Propietario;

import java.util.List;

public class PropietarioController {

    ModelFactory modelFactory;
    public PropietarioController(){

        modelFactory = ModelFactory.getInstance();

    }

    public List<Propietario> obtenerPropietario() {
        return modelFactory.obtenerPropietario();
    }
}
