
package unidad10;

import java.io.*;
public class U10_A07 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\samue\\Documents\\Fichero.txt");
            String linea1 = "En un lugar de La Mancha,";
            String linea2 = "de cuyo nombre no quiero acordarme";
            for (int i = 0; i < linea1.length(); i++) {
                fw.write(linea1.charAt(i));
            }
            fw.write("\n");
            fw.write(linea2);
        } catch(IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }   
            } catch(IOException e) {
                System.out.println(e);
            }
        }
    }
}
