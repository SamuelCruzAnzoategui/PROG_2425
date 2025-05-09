
package unidad10;

import java.io.*;
public class U10_A02 {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("C:\\Users\\samue\\Documents\\NetBeansProjects\\U07_A10\\src\\main\\java\\Main\\Main.java");
            int caracter;
            while ((caracter = in.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch(IOException e) {
            System.out.println(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
