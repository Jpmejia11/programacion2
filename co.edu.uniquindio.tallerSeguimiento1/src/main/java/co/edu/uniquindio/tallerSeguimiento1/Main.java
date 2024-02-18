package co.edu.uniquindio.tallerSeguimiento1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Colegio> colegios = new ArrayList<>();
        colegios.add(new ColegioPrivado());
        colegios.add(new ColegioPublico());
        colegios.add(new ColegioMixto());
        imprimirNumeroEstudiantes(colegios);

        }
    public static void imprimirNumeroEstudiantes(List<Colegio> colegios) {
        for (Colegio colegio : colegios){
            System.out.println(colegio.getNumeroEstudiantes());
        }
    }
}