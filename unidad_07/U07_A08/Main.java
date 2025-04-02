
package U07_A08;


public class Main {
    public static void main(String[] args) {
        Sintonizador s = new Sintonizador();
        Sintonizador s1 = new Sintonizador(108);
        Sintonizador s2 = new Sintonizador(90);
        
        System.out.println("---Sintonizador 1---");
        s.down();
        s.display();
        System.out.println("---Sintonizador 2---");
        s1.up();
        s1.display();
        System.out.println("---Sintonizador 3---");
        s2.up();
        s2.display();
    }
}
