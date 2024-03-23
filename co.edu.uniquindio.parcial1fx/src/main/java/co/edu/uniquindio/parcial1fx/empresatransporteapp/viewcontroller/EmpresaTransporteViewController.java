package co.edu.uniquindio.parcial1fx.empresatransporteapp.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.controller.EmpresaTransporteController;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.factory.ModelFactory;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.*;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder.VehiculoCargaBuilder;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder.VehiculoTransporteBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EmpresaTransporteViewController {

    EmpresaTransporteController empresaTransporteController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarMetodoVehiculoTransporte;

    @FXML
    private Button btnAgregarPropietario;

    @FXML
    private Button btnAgregarUsuario;

    @FXML
    private Button btnAgregarVehiculoCarga;

    @FXML
    private Button btnAgregarVehiculoTransporte;

    @FXML
    private Button btnMetodoPropietario;

    @FXML
    private Button btnMetodoUsuario;

    @FXML
    private Button btnMetodoVehiculoCarga;

    @FXML
    private TextField txtCapacidadVehiculoCarga;

    @FXML
    private TextField txtCedulaPropietario;

    @FXML
    private TextField txtCelularPropietario;

    @FXML
    private TextField txtColorVehiculoCarga;

    @FXML
    private TextField txtColorVehiculoTransporte;

    @FXML
    private TextField txtEmailPropietario;

    @FXML
    private TextField txtEdadUsuario;

    @FXML
    private TextField txtMarcaVehiculoCarga;

    @FXML
    private TextField txtMarcaVehiculoTransporte;

    @FXML
    private TextField txtModeloVehiculoCarga;

    @FXML
    private TextField txtModeloVehiculoTransporte;

    @FXML
    private TextField txtNombrePropietario;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private TextField txtNumPasajerosVehiculoTransporte;

    @FXML
    private TextField txtNumeroEjesVehiculoCarga;

    @FXML
    private TextField txtPlacaVehiculoCarga;

    @FXML
    private TextField txtPlacaVehiculoTransporte;

    @FXML
    private TextArea txtResultadoPropietario;

    @FXML
    private TextArea txtResultadoUsuario;

    @FXML
    private TextArea txtResultadoVehiculoCarga;

    @FXML
    private TextArea txtResultadoVehiculoTransporte;

    @FXML
    void onAgregarMetodoPropietario(ActionEvent event) {
        agregarNuevoPropietario();

    }

    @FXML
    private TableView<EmpresaTransporte> tablePropietario;

    @FXML
    private TableColumn<EmpresaTransporte, String> tcCedula;

    @FXML
    private TableColumn<EmpresaTransporte, String> tcEmail;

    @FXML
    private TableColumn<EmpresaTransporte, String> tcNombre;

    @FXML
    private TableColumn<EmpresaTransporte, String> tcelular;
    @FXML
    void onAgregarMetodoUsuario(ActionEvent event) {
        agregarNuevoUsuario();

    }
    @FXML
    void onAgregarMetodoVehiculoCarga(ActionEvent event) {
        agregarVehiculoCarga();
    }

    @FXML
    void onAgregarMetodoVehiculoTransporte(ActionEvent event) {
        agregarVehiculoTransporte();

    }

    @FXML
    void onAgregarPropietario(ActionEvent event) {
        agregarNuevoPropietario();

    }

    @FXML
    void onAgregarUsuario(ActionEvent event) {
        agregarNuevoUsuario();

    }

    @FXML
    void onAgregarVehiculoCarga(ActionEvent event) {
        agregarVehiculoCarga();

    }

    @FXML
    void onAgregarVehiculoTransporte(ActionEvent event) {
        agregarVehiculoTransporte();


    }

    private void agregarNuevoPropietario() {
        Propietario propietario = new Propietario();

        propietario.setNombrePropietario(txtNombrePropietario.getText());
        propietario.setCedula(txtCedulaPropietario.getText());
        propietario.setCelular(txtCelularPropietario.getText());
        propietario.setEmail(txtEmailPropietario.getText());
        txtResultadoPropietario.setText(propietario.toString());
    }

    private void agregarNuevoUsuario(){
        Usuario usuario = new Usuario();

        usuario.setNombreUsuario(txtNombreUsuario.getText());
        usuario.setEdad(Integer.parseInt(txtEdadUsuario.getText()));
        txtResultadoUsuario.setText(usuario.toString());
    }

    private void agregarVehiculoCarga(){
        VehiculoCarga vehiculoCarga = new VehiculoCargaBuilder()
                .placa(txtPlacaVehiculoCarga.getText())
                .modelo(txtModeloVehiculoCarga.getText())
                .marca(txtMarcaVehiculoCarga.getText())
                .color(txtColorVehiculoCarga.getText())
                .capacidadCarga(Double.parseDouble(txtCapacidadVehiculoCarga.getText()))
                .numEjes(Integer.parseInt(txtNumeroEjesVehiculoCarga.getText()))
                .build();
        txtResultadoVehiculoCarga.setText(vehiculoCarga.toString());
    }
    private void agregarVehiculoTransporte(){
        VehiculoTransporte vehiculoTransporte = new VehiculoTransporteBuilder()
                .placa(txtPlacaVehiculoTransporte.getText())
                .modelo(txtModeloVehiculoTransporte.getText())
                .marca(txtMarcaVehiculoTransporte.getText())
                .color(txtColorVehiculoTransporte.getText())
                .numPasajerosMax(Integer.parseInt(txtNumPasajerosVehiculoTransporte.getText()))
                .build();
        txtResultadoVehiculoTransporte.setText(vehiculoTransporte.toString());
    }

    // El metodo agregarMetodoVehiculoTransporte calcula la cantidad de pasajeros del vehiculoTransporte
      private void agregarMetodoVehiculoTransporte(){
        if(!txtPlacaVehiculoTransporte.getText().isEmpty()){
            String resultado = String.valueOf(modelFactory.calcularNumPasajeros(txtPlacaVehiculoTransporte.getText()));
            txtResultadoVehiculoTransporte.setText(resultado);
        }else{
            txtResultadoVehiculoTransporte.setText("No hay usuarios Asignados");
        }
    }

    // El metodo agregarMetodoUsuario busca los que sean mayores de edad
    private void agregarMetodoUsuario(){
        String resultadoEdad = String.valueOf(modelFactory.calcularMayoresEdad());
        txtResultadoUsuario.setText("Usuario mayor edad" + resultadoEdad);
    }

    @FXML
    void initialize() {
        empresaTransporteController = new EmpresaTransporteController();
    }
}