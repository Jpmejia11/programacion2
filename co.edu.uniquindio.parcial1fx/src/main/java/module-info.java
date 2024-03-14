module co.edu.uniquindio.parcial1fx.empresatransporteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.empresatransporteapp to javafx.fxml;
    exports co.edu.uniquindio.parcial1fx.empresatransporteapp;

    opens co.edu.uniquindio.parcial1fx.empresatransporteapp.controller;
    exports co.edu.uniquindio.parcial1fx.empresatransporteapp.controller;
    opens co.edu.uniquindio.parcial1fx.empresatransporteapp.model;
}