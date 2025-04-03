
package U07_A09;


public class Bombilla {
    public static boolean interruptorGeneral = true;
    private boolean interruptor;

    public Bombilla() {
        interruptor = false;
    }

    public void encender() {
        interruptor = true;
    }

    public void apagar() {
        interruptor = false;
    }

    public boolean estado() {
        return interruptorGeneral && interruptor;
    }

    public void mostrar() {
        if (estado() == true) {
            System.out.println("Encendida");
        } else {
            System.out.println("Apagada");
        }
    }
}
