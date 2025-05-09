
package unidad10;

import java.io.*;
public class U10_A04 {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("C:\\Users\\samue\\Documents\\NúmerosReales.txt");
            int caracter;
            String contenido = "";
            while ((caracter = in.read()) != -1) {
                contenido += (char) caracter;
                System.out.print((char) caracter);
            }
            String[] numeros = contenido.split(" ");
            double suma = 0;
            int cantidad = 0;
            for (String num : numeros) {
                if (!" ".equals(num)) {
                    double numero = Double.parseDouble(num);
                    suma += numero;
                    cantidad++;
                }
            }
            double media = suma / cantidad;
            System.out.println("\nSuma: " + suma);
            System.out.println("Media: " + media);
        } catch(IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch(IOException e) {
                System.out.println(e);
            }
        }
    }
}
