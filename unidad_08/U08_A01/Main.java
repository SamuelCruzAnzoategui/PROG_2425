
package U08_A01;


public class Main {
    public static void main(String[] args) {
        Hora h = new Hora(10, 30);
        
        System.out.println(h.toString());
        
        System.out.println("---Establecer hora a 23 y minuto a 59");
        h.setHora(23);
        h.setMinutos(59);
        System.out.println(h.toString());
        
        System.out.println("---Incrementar 1 minuto---");
        h.inc();
        System.out.println(h.toString());
    }
}
