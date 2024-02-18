package co.edu.uniquindio.tallerSeguimiento1;

public abstract class Colegio {

    protected String nombre;
    protected String ubicacion;
    protected String rector;

    public Colegio(String nombre, String ubicacion, String rector) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.rector = rector;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getRector() {
        return rector;
    }

    public abstract int getNumeroEstudiantes();

    @Override
    public String toString() {
        return "Colegio: " + nombre + ", Ubicación: " + ubicacion + ", Rector: " + rector;
    }
 }

