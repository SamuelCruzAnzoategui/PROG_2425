
package U08_A02;


public class Main {
    public static void main(String[] args) {
        HoraExacta he = new HoraExacta(10, 30, 00);
        
        System.out.println(he.toString());
        
        System.out.println("---Establecer hora a 23 : 59 : 59---");
        he.setHora(23);
        he.setMinutos(59);
        he.setSegundos(59);
        System.out.println(he.toString());
        
        System.out.println("---Incrementar 1 segundo---");
        he.inc();
        System.out.println(he.toString());
    }
}
