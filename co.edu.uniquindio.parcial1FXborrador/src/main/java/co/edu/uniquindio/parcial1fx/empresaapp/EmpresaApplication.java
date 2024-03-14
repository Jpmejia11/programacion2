package co.edu.uniquindio.parcial1fx.empresaapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EmpresaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EmpresaApplication.class.getResource("Empresa.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("LA CARRETA");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}