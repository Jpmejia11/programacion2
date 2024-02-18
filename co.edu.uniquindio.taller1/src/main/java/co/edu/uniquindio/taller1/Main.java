package co.edu.uniquindio.taller1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colegio> colegios = new ArrayList<>();
        colegios.add(new Colegio("Noveno",  30));
        colegios.add(new Colegio("Octavo",  27));
        colegios.add(new Colegio("Decimo",  25));
        colegios.add(new Colegio("Once",  25));

        int puestosNoveno =  0;
        int puestosOctavo =  0;
        int puestosDecimo =  0;
        int puestosOnce = 0;

        for (Colegio colegio : colegios) {
            if (colegio.getGrado().equals("Noveno")) {
                puestosNoveno += colegio.getPuestos();
            } else if (colegio.getGrado().equals("Octavo")) {
                puestosOctavo += colegio.getPuestos();
            } else if (colegio.getGrado().equals("Decimo")) {
                puestosDecimo += colegio.getPuestos();
            }else if (colegio.getGrado().equals("Once")) {
                puestosOnce += colegio.getPuestos();
            }
        }

        System.out.println("Total de puestos de grado Octavo: " + puestosOctavo);
        System.out.println("Total de puestos de grado Noveno: " + puestosNoveno);
        System.out.println("Total de puestos de grado Decimo: " + puestosDecimo );
        System.out.println("Total de puestos de grado Once: " + puestosOnce);
    }
}