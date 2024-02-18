package co.edu.uniquindio.tallerSeguimiento1;

public class ColegioUniversitarios extends Colegio{

    private int numeroEstudiantes;

    public ColegioUniversitarios(String nombre, String ubicacion, String rector, int numeroEstudiantes) {
        super(nombre, ubicacion, rector);
        this.numeroEstudiantes = numeroEstudiantes;
    }

    @Override
    public int getNumeroEstudiantes() {
        return 2000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estudiantes: " + numeroEstudiantes;
    }

      public ColegioUniversitarios(){
        super ("Universidad del Quindio", "Carrera 14","Nicolas");
    }
}
