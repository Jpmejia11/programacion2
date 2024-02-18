package co.edu.uniquindio.tallerSeguimiento1;

public class ColegioPublico extends Colegio {

    private int grado;
    private int numeroEstudiantes;

    public ColegioPublico(String nombre, String ubicacion, String rector, int grado, int numeroEstudiantes) {
        super(nombre, ubicacion, rector);
        this.grado = grado;
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public ColegioPublico() {
        super("Casd", "Barrio limonar","Juan Eugenio");
    }

    @Override
    public int getNumeroEstudiantes() {
        return 800;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grado: " + grado + ", Estudiantes: " + numeroEstudiantes;
    }
}
