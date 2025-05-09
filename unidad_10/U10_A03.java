
package unidad10;

import java.io.*;
public class U10_A03 {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("C:\\Users\\samue\\Documents\\NetBeansProjects\\U07_A10\\src\\main\\java\\Main\\Main.java");
            BufferedReader buffer = new BufferedReader(in);
            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
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
