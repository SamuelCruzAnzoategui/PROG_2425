
package Maquinaria;


public class Vagon {
    private int numero;
    private double cargaMaxima;
    private double cargaActual;
    private String tipoMercancia;

    public Vagon(int numero, double cargaMaxima, double cargaActual, String tipoMercancia) {
        this.numero = numero;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }
}
