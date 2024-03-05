package co.edu.uniquindio.reservaHotel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Reserva());
        imprimirNumReservasActivas(hotels);

       /*
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente());
        imprimirNombreCliente(clientes);

       */
       }

    private static void imprimirNombreCliente(List<Cliente> clientes) {
    }

    public static void imprimirNumReservasActivas(List<Hotel> hotels) {
    for(Hotel hotel : hotels){
        System.out.println(hotel.getNumReservasActivas());
        }
    }
}