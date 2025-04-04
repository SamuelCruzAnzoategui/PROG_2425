
package Main;

import Personal.*;
import Maquinaria.*;
public class Main {
    public static void main(String[] args) {
        Mecanico mecanico1 = new Mecanico("Bingus", "627182319", "Electricista");
        Locomotora locomotora1 = new Locomotora("L1", 3000, 2025, mecanico1);
        Maquinista maquinista1 = new Maquinista("Bongus", "37183291S", 2500, "Senior");
        Tren tren1 = new Tren(locomotora1, maquinista1);

        Vagon vagon1 = new Vagon(1, 10000, 5000, "Piedra");
        Vagon vagon2 = new Vagon(2, 15000, 10000, "Hierro");

        tren1.agregarVagon(vagon1);
        tren1.agregarVagon(vagon2);

        System.out.println("Número de vagones: " + tren1.getNumVagones());
    }
}
