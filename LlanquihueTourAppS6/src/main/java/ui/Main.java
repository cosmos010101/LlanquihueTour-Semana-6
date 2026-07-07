package ui;

import data.DataManager;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.List;

/**
 * Autor Lorena Padilla
 */

public class Main {

    public static void main(String[] args) {

        DataManager dataManager = new DataManager();
        List<ServicioTuristico> lista = dataManager.obtenerServicios();

        for(ServicioTuristico servicio : lista){
            servicio.mostrarInformacion();

            if(servicio instanceof ExcursionCultural){
                ExcursionCultural mensaje1 = (ExcursionCultural) servicio;
                mensaje1.excursion();
            }else if(servicio instanceof PaseoLacustre){
                PaseoLacustre mensaje2 = (PaseoLacustre) servicio;
                mensaje2.embarcacion();
            }else if(servicio instanceof RutaGastronomica){
                RutaGastronomica mensaje3 = (RutaGastronomica) servicio;
                mensaje3.ruta();
            }

            System.out.println("\n‿︵‿୨୧‿︵‿\n");
        }

    }
}