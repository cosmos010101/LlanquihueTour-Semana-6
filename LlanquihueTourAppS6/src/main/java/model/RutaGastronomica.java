package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println(".... Ruta Gastronómica ....");
        System.out.println("Número de paradas: "+this.numeroDeParadas);
    }

    public void ruta(){
        System.out.println("\n¡Buen provecho!");
    }
}
