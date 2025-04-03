
package U07_A09;


public class Main {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        
        System.out.println("---Encender bombillas---");
        b1.encender();
        b2.encender();
        mostrar(b1, b2);
        
        System.out.println("---Apagar interruptor general---");
        Bombilla.interruptorGeneral = false;
        mostrar(b1, b2);
    }
    public static void mostrar(Bombilla b1, Bombilla b2) {
        System.out.print("Bombilla 1: ");
        b1.mostrar();
        System.out.print("Bombilla 2: ");
        b2.mostrar();
    }
}
