package co.edu.uniquindio.tallerSeguimiento1;

public class ColegioMixto extends Colegio{

    private int numeroEstudiantes;

    public ColegioMixto(String nombre, String ubicacion, String rector, int numeroEstudiantes) {
        super(nombre, ubicacion, rector);
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public ColegioMixto() {
        super("Inmaculada","Avenida 19","Madre Calculta");
    }


    @Override
    public int getNumeroEstudiantes() {
        return 550;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estudiantes: " + numeroEstudiantes;
    }
}
