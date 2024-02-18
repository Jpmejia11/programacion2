package co.edu.uniquindio.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> coches = new ArrayList<>();
        coches.add("Renault");
        coches.add("Audi");
        coches.add("Mercedes");
        coches.add("BMW");
        coches.add("sin marca");

        System.out.println("Lista de coches:");
        for (String coche : coches) {
            int asientos = switch (coche) {
                case "Renault" -> Coches.getAsientosRenault();
                case "Audi" -> Coches.getAsientosAudi();
                case "Mercedes" -> Coches.getAsientosMercedes();
                case "BMW" -> Coches.getAsientosBMW();
                default -> 0;
            };
            System.out.println("Coche: " + coche + ", Asientos: " + asientos);
        }
    }
}