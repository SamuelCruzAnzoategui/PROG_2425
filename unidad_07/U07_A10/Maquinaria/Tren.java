
package Maquinaria;

import Personal.Maquinista;


public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinista;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = new Vagon[5];
        this.numVagones = 0;
    }

    public void agregarVagon(Vagon vagon) {
        if (numVagones < 5) {
            vagones[numVagones++] = vagon;
        } else {
            System.out.println("No se pueden agregar más de 5 vagones.");
        }
    }

    public int getNumVagones() {
        return numVagones;
    }
}
