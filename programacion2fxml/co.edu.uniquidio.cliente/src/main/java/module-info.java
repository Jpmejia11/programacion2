module co.edu.uniquidio.cliente.clienteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquidio.cliente.clienteapp to javafx.fxml;
    exports co.edu.uniquidio.cliente.clienteapp;

    opens co.edu.uniquidio.cliente.clienteapp.controller;
    exports co.edu.uniquidio.cliente.clienteapp.controller;

    //opens co.edu.uniquidio.cliente.clienteapp.model;

}