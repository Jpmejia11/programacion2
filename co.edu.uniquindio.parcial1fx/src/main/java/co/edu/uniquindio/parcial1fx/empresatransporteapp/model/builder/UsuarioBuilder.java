package co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Usuario;

public class UsuarioBuilder {

    protected String nombreUsuario;
    protected int edad;

    public UsuarioBuilder(){

    }

    public UsuarioBuilder nombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        return this;
    }

    public UsuarioBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    public Usuario build(){
        return new Usuario( );
    }
}
