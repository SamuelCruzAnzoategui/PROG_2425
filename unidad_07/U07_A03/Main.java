
package U07_A03;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        double cantidad = 0;
        
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu DNI: ");
        String dni = sc.nextLine();
        CuentaCorriente c = new CuentaCorriente(nombre, dni);
        
        while (opcion != 0) {            
            System.out.println("------------------------");
            System.out.println("Mostrar información = 1");
            System.out.println("Ingresar dinero = 2");
            System.out.println("Sacar dinero = 3");
            System.out.println("Salir = 0");
            System.out.print("Selecciona una opción (0 - 3): ");
            opcion = sc.nextInt();
            System.out.println("------------------------");
        
            switch (opcion) {
                case 0 -> System.out.println("Adios!");
                case 1 -> c.mostrarInformacion();
                case 2 -> c.ingresarDinero(cantidad);
                case 3 -> c.sacarDinero(cantidad);
                default -> System.out.println("Opción incorrecta");
            }
        }    
    }
}