package co.edu.uniquindio.parcial1fx.empresatransporteapp.factory;


import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder.VehiculoTransporteBuilder;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.EmpresaTransporte;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Propietario;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Usuario;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.VehiculoTransporte;


import java.util.ArrayList;

public class ModelFactory {
    private static ModelFactory modelFactory;

    private EmpresaTransporte empresaTransporte;

    private ModelFactory(){
        empresaTransporte = new EmpresaTransporte();
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {

        Propietario propietario = new Propietario();

        propietario.setNombrePropietario("Andres");
        propietario.setCedula("12345");
        propietario.setCelular("32000000");
        propietario.setEmail("andres@gmail.com");

        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("Raul");
        usuario.setEdad(18);

        Usuario usuario1 = new Usuario();
        usuario1.setNombreUsuario("Juan");
        usuario1.setEdad(25);

        Usuario usuario2 = new Usuario();
        usuario2.setNombreUsuario("Juan David");
        usuario2.setEdad(30);

        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario.add(usuario);
        listaUsuario.add(usuario1);

        empresaTransporte.getListaUsuario().add(usuario);
        empresaTransporte.getListaUsuario().add(usuario1);
        empresaTransporte.getListaUsuario().add(usuario2);

        VehiculoTransporte vehiculoTransporte = new VehiculoTransporteBuilder()
                .placa("BZQ-752")
                .modelo("2024")
                .marca("Mazda")
                .color("Negro")
                .numPasajerosMax(5)
                .listaUsuariosAsociados(listaUsuario)
                .build();
        propietario.getVehiculoList().add(vehiculoTransporte);
        empresaTransporte.getListaVehiculoTransporte().add(vehiculoTransporte);
    }

    public boolean crearVehiclo(String placa, String modelo, String marca, String color){
        return empresaTransporte.crearVehiclo(placa,modelo,marca,color);
    }

    public int calcularNumPasajeros(String placa){
        return empresaTransporte.calcularNumPasajeros(placa);
    }

    public int calcularMayoresEdad(){
        return empresaTransporte.calcularMayoresEdad();
    }
}


