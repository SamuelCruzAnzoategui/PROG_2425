
package unidad10;

import java.io.*;
import java.util.Scanner;
public class U10_A08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo: ");
        String nombre = sc.nextLine();
        String copia = "copia de " + nombre;
        try {
            BufferedReader leer = new BufferedReader(new FileReader(nombre));
            BufferedWriter escribir = new BufferedWriter(new FileWriter(copia));
            String linea = leer.readLine();
            while(linea != null) {
                escribir.write(linea);
                escribir.newLine();
            }
            System.out.println("Archivo duplicado como: " + copia);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
