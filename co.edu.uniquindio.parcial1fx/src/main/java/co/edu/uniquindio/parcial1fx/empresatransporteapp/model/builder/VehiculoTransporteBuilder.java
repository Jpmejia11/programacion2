package co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Usuario;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.VehiculoTransporte;

import java.util.ArrayList;

 public class VehiculoTransporteBuilder extends VehiculoBuilder<VehiculoTransporteBuilder> {
        protected int numPasajerosMax;

        protected ArrayList<Usuario> listaUsuariosAsociados = new ArrayList<>();

        public VehiculoTransporteBuilder numPasajerosMax(int numPasajerosMax) {
            this.numPasajerosMax = numPasajerosMax;
            return this;
        }

        public VehiculoTransporteBuilder listaUsuariosAsociados(ArrayList<Usuario> listaUsuariosAsociados) {
            this.listaUsuariosAsociados = listaUsuariosAsociados;
            return this;
        }

        @Override
        public VehiculoTransporte build() {
            return new VehiculoTransporte(placa, modelo, marca, color, propietarioAsociado, listaPropietariosAsociados, numPasajerosMax, listaUsuariosAsociados);
        }

        @Override
        protected VehiculoTransporteBuilder self() {
            return this;
        }
     }
