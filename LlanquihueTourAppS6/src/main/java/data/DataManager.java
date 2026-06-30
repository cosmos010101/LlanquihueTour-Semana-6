package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class DataManager {

    RutaGastronomica rg1 = new RutaGastronomica("Comida Típica Chilena", 6, 2);
    RutaGastronomica rg2 = new RutaGastronomica("Postres del sur", 15, 3);
    PaseoLacustre pl1 = new PaseoLacustre("Puerto Bertrand", 8, "Barco");
    PaseoLacustre pl2 = new PaseoLacustre("Puerto Montt", 9, "Barco");
    ExcursionCultural ec1 = new ExcursionCultural("Pomaire", 8, "Talleres de greda");
    ExcursionCultural ec2 = new ExcursionCultural("Mercado", 3, "Mercado local");


    @Override
    public String toString() {
        return rg1 + "\n" + rg2 + "\n" + pl1 + "\n" + pl2 + "\n" + ec1 + "\n" + ec2;
    }
}
