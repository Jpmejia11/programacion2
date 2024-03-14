package co.edu.uniquindio.parcial1fx.empresaapp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmpresaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearPropietario;

    @FXML
    private Button btnCrearUsuario;

    @FXML
    private Button btnCrearVehiculo;

    @FXML
    private Button btnCrearVehiculoCarga;

    @FXML
    private Button btnCrearVehiculoTransporte;

    @FXML
    private Button btnMetodo1Edad;

    @FXML
    private Button btnMetodo1Propietario;

    @FXML
    private Button btnMetodo1Vehiculo;

    @FXML
    private Button btnMetodo1VehiculoCarga;

    @FXML
    private Button btnMetodo1VehiculoTransporte;

    @FXML
    private Button btnMetodo2Edad;

    @FXML
    private Button btnMetodo2Propietario;

    @FXML
    private Button btnMetodo2Vehiculo;

    @FXML
    private Button btnMetodo2VehiculoCarga;

    @FXML
    private Button btnMetodo2VehiculoTransporte;

    @FXML
    private TextField txtCapacidadCargaVehiculoCarga;

    @FXML
    private TextField txtCedulaPropietario;

    @FXML
    private TextField txtCelularPropietario;

    @FXML
    private TextField txtColorVehiculo;

    @FXML
    private TextField txtEdadUsuario;

    @FXML
    private TextField txtEmailPropietario;

    @FXML
    private TextField txtMarcaVehiculo;

    @FXML
    private TextField txtMaximoPasajerosVehiculoTransporte;

    @FXML
    private TextField txtMetodo2Edad;

    @FXML
    private TextField txtMetodo2Propietario;

    @FXML
    private TextField txtMetodo2Vehiculo;

    @FXML
    private TextField txtMetodo2Vehiculo1;

    @FXML
    private TextField txtMetodo2Vehiculo11;

    @FXML
    private TextField txtModeloVehiculo;

    @FXML
    private TextField txtNombrePropietario;

    @FXML
    private TextField txtNumeroEjesCargaVehiculoCarga;

    @FXML
    private TextField txtPlacaVehiculo;

    @FXML
    private TextArea txtResultadoEdad;

    @FXML
    private TextArea txtResultadoOperacionesEdad;

    @FXML
    private TextArea txtResultadoOperacionesPropietario;

    @FXML
    private TextArea txtResultadoOperacionesVehiculoCarga;

    @FXML
    private TextArea txtResultadoOperacionesVehiculoTransporte;

    @FXML
    private TextArea txtResultadoPropietario;

    @FXML
    private TextArea txtResultadoVehiculo;

    @FXML
    private TextArea txtResultadoVehiculoCarga;

    @FXML
    private TextArea txtResultadoVehiculoTransporte;

    @FXML
    void onCrearPropietario(ActionEvent event) {

    }

    @FXML
    void onCrearUsuario(ActionEvent event) {

    }

    @FXML
    void onCrearVehiculo(ActionEvent event) {

    }

    @FXML
    void onCrearVehiculoCarga(ActionEvent event) {

    }

    @FXML
    void onCrearVehiculoTransporte(ActionEvent event) {

    }

    @FXML
    void onMetodo2(ActionEvent event) {

    }

    @FXML
    void onMetodo2Propietario(ActionEvent event) {

    }

    @FXML
    void onMetodo2Usuario(ActionEvent event) {

    }

    @FXML
    void onMetodo2VehiculoCarga(ActionEvent event) {

    }

    @FXML
    void onMetodo2VehiculoTransporte(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCrearPropietario != null : "fx:id=\"btnCrearPropietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnCrearUsuario != null : "fx:id=\"btnCrearUsuario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnCrearVehiculo != null : "fx:id=\"btnCrearVehiculo\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnCrearVehiculoCarga != null : "fx:id=\"btnCrearVehiculoCarga\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnCrearVehiculoTransporte != null : "fx:id=\"btnCrearVehiculoTransporte\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo1Edad != null : "fx:id=\"btnMetodo1Edad\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo1Propietario != null : "fx:id=\"btnMetodo1Propietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo1Vehiculo != null : "fx:id=\"btnMetodo1Vehiculo\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo1VehiculoCarga != null : "fx:id=\"btnMetodo1VehiculoCarga\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo1VehiculoTransporte != null : "fx:id=\"btnMetodo1VehiculoTransporte\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo2Edad != null : "fx:id=\"btnMetodo2Edad\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo2Propietario != null : "fx:id=\"btnMetodo2Propietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo2Vehiculo != null : "fx:id=\"btnMetodo2Vehiculo\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo2VehiculoCarga != null : "fx:id=\"btnMetodo2VehiculoCarga\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert btnMetodo2VehiculoTransporte != null : "fx:id=\"btnMetodo2VehiculoTransporte\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtCapacidadCargaVehiculoCarga != null : "fx:id=\"txtCapacidadCargaVehiculoCarga\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtCedulaPropietario != null : "fx:id=\"txtCedulaPropietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtCelularPropietario != null : "fx:id=\"txtCelularPropietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtColorVehiculo != null : "fx:id=\"txtColorVehiculo\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtEdadUsuario != null : "fx:id=\"txtEdadUsuario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtEmailPropietario != null : "fx:id=\"txtEmailPropietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtMarcaVehiculo != null : "fx:id=\"txtMarcaVehiculo\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtMaximoPasajerosVehiculoTransporte != null : "fx:id=\"txtMaximoPasajerosVehiculoTransporte\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtMetodo2Edad != null : "fx:id=\"txtMetodo2Edad\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtMetodo2Propietario != null : "fx:id=\"txtMetodo2Propietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtMetodo2Vehiculo != null : "fx:id=\"txtMetodo2Vehiculo\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtMetodo2Vehiculo1 != null : "fx:id=\"txtMetodo2Vehiculo1\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtMetodo2Vehiculo11 != null : "fx:id=\"txtMetodo2Vehiculo11\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtModeloVehiculo != null : "fx:id=\"txtModeloVehiculo\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtNombrePropietario != null : "fx:id=\"txtNombrePropietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtNumeroEjesCargaVehiculoCarga != null : "fx:id=\"txtNumeroEjesCargaVehiculoCarga\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtPlacaVehiculo != null : "fx:id=\"txtPlacaVehiculo\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtResultadoEdad != null : "fx:id=\"txtResultadoEdad\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtResultadoOperacionesEdad != null : "fx:id=\"txtResultadoOperacionesEdad\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtResultadoOperacionesPropietario != null : "fx:id=\"txtResultadoOperacionesPropietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtResultadoOperacionesVehiculoCarga != null : "fx:id=\"txtResultadoOperacionesVehiculoCarga\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtResultadoOperacionesVehiculoTransporte != null : "fx:id=\"txtResultadoOperacionesVehiculoTransporte\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtResultadoPropietario != null : "fx:id=\"txtResultadoPropietario\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtResultadoVehiculo != null : "fx:id=\"txtResultadoVehiculo\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtResultadoVehiculoCarga != null : "fx:id=\"txtResultadoVehiculoCarga\" was not injected: check your FXML file 'Empresa.fxml'.";
        assert txtResultadoVehiculoTransporte != null : "fx:id=\"txtResultadoVehiculoTransporte\" was not injected: check your FXML file 'Empresa.fxml'.";

    }

}
