
package U08_A03;


public class Main {
    public static void main(String[] args) {
        HoraExacta h1 = new HoraExacta(10, 30, 0);
        HoraExacta h2 = new HoraExacta(10, 30, 0);
        HoraExacta h3 = new HoraExacta(11, 31, 1);
        
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
    }
}
