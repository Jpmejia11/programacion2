package co.edu.uniquidio.cliente.clienteapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquidio.cliente.clienteapp.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class ClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleGroup Cliente;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCelular;

    @FXML
    private RadioButton txtClienteBasico;

    @FXML
    private RadioButton txtClientePremium;

    @FXML
    private RadioButton txtClienteVip;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtResultado;

    @FXML
    void getCliente(MouseEvent event) {
        if (Cliente.getSelectedToggle().equals(txtClienteBasico)){
            txtResultado.setText("Cliente Básico");

        }else if (Cliente.getSelectedToggle().equals(txtClientePremium)){
            txtResultado.setText("Cliente Premium");
        }else if (Cliente.getSelectedToggle().equals(txtClienteVip)){
            txtResultado.setText("Cliente VIP");
        }
    }

    @FXML
    void onAgregarCliente(ActionEvent event) {

        agregarCliente();

        //System.out.println("Hola a todos"); por consola
    }

    @FXML
    void initialize() {

    }

    private void agregarCliente() {

       co.edu.uniquidio.cliente.clienteapp.model.Cliente cliente = new Cliente();

       cliente.setNombre(txtNombre.getText());
       cliente.setApellido(txtApellido.getText());
       cliente.setCedula(txtCedula.getText());
       cliente.setCelular(txtCelular.getText());
       cliente.setEmail(txtEmail.getText());
       cliente.setEdad(Integer.parseInt(txtEdad.getText()));

       txtResultado.setText(cliente.toString());

    }


}

