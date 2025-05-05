
package unidad10;

import java.util.Scanner;
public class U01_A10 {

    public static void main(String[] args) {
        boolean valido = false;
        while (valido == false) {
            valido = true;
            try {
                leerEntero();
            } catch (Exception e) {
                System.out.println(e);
                valido = false;
            }
        }
    }

    static Integer leerEntero() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        Integer num = sc.nextInt();
        return num;
    }
}
