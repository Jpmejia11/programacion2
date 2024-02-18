package co.edu.uniquindio.tallerSeguimiento1;

public class ColegioPrivado extends Colegio {

    private int numeroEstudiantes;

    public ColegioPrivado(String nombre, String ubicacion, String rector, int numeroEstudiantes) {
        super(nombre, ubicacion, rector);
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public ColegioPrivado() {
        super("San Luis","Carrera 19","Esteban");
    }

    @Override
    public int getNumeroEstudiantes() {
        return 600;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estudiantes: " + numeroEstudiantes;
    }
}
