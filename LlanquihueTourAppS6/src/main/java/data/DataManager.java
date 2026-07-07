package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private List<ServicioTuristico> servicios;

    public DataManager() {
        servicios = new ArrayList<>();
        cargarServicios();
    }

    public void cargarServicios() {

    servicios.add(new RutaGastronomica("Comida Típica Chilena", 6, 2));
    servicios.add(new RutaGastronomica("Postres del sur", 15, 3));
    servicios.add(new PaseoLacustre("Puerto Bertrand", 8, "Barco"));
    servicios.add(new PaseoLacustre("Puerto Montt", 9, "Barco"));
    servicios.add(new ExcursionCultural("Pomaire", 8, "Talleres de greda"));
    servicios.add(new ExcursionCultural("Mercado", 3, "Mercado local"));
    }

    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }
}
