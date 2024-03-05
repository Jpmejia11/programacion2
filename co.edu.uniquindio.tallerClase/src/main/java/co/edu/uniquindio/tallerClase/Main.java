package co.edu.uniquindio.tallerClase;

public class Main {
    public static void main(String[] args) {

        crearCliente();
    }

    public static void crearCliente(){

        Cliente cliente = new Cliente("Juan",
                "Mejia",
                1094927972,
                30,
                80,
                1.30);
        Cliente cliente1 = new Cliente("Juan",
                "Mejia",
                1094927972);

    }
}