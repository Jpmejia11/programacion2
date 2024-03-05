package co.edu.uniquindio.tallerClase;

public class ClienteVip extends Cliente{

    private String direccion;
    private String estadoCivil;
    private String correo;

    public ClienteVip(String nombre,
                      String apellido,
                      int cedula,
                      int edad,
                      double peso,
                      double estatura,
                      String direccion,
                      String estadoCivil,
                      String correo) {

        super(nombre, apellido, cedula, edad, peso, estatura);
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.correo = correo;
    }
}
