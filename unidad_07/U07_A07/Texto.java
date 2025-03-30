package U07_A07;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {

    private String cadena;
    private int longitud;
    private LocalDate fechaCreacion;
    private LocalDateTime ultimaModificacion;

    public Texto(int longitud) {
        this.longitud = longitud;
        this.cadena = "";
        this.fechaCreacion = LocalDate.now();
        this.ultimaModificacion = LocalDateTime.now();
    }

    public boolean añadirCaracterInicio(char letra) {
        if (cadena.length() < longitud) {
            cadena = letra + cadena;
            actualizar();
            return true;
        }
        return false;
    }

    public boolean añadirCaracterFinal(char letra) {
        if (cadena.length() < longitud) {
             cadena += letra;
            actualizar();
            return true;
        }
        return false;
    }

    public boolean añadirCadenaInicio(String texto) {
        if (cadena.length() + texto.length() <= longitud) {
            cadena = texto + cadena;
            actualizar();
            return true;
        }
        return false;
    }

    public boolean añadirCadenaFinal(String texto) {
        if (cadena.length() + texto.length() <= longitud) {
            cadena += texto;
            actualizar();
            return true;
        }
        return false;
    }

    public int contarVocales() {
        int contador = 0;
        String vocales = "AEIOUÁÉÍÓÚaeiouáéíóú";
        for (char c : cadena.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    private void actualizar() {
        this.ultimaModificacion = LocalDateTime.now();
    }

    public void mostrarInformacion() {
        System.out.println("Texto: " + cadena);
        System.out.println("Longitud: " + cadena.length() + "/" + longitud);
        System.out.println("Número de vocales: " + contarVocales());
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println("Última modificación: " + ultimaModificacion);
    }
}
