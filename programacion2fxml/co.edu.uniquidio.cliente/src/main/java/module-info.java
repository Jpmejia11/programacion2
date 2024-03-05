module co.edu.uniquidio.cliente.clienteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquidio.cliente.clienteapp to javafx.fxml;
    exports co.edu.uniquidio.cliente.clienteapp;
}