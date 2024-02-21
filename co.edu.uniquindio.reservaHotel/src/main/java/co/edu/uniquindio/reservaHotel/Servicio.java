package co.edu.uniquindio.reservaHotel;

public abstract class Servicio {

    protected String tipoServicios;

    protected abstract void servicioSpa();
    protected abstract void servicioRestaurante();
    protected abstract void servicioLimpieza();

}
