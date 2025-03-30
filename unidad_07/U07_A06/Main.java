package U07_A06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        Hora h = new Hora(hora, minutos, segundos);

        System.out.println("Hora completa: " + hora + " : " + minutos + " : " + segundos);
        System.out.print("Hora los " + n + " segundos siguientes: ");
        
        for (int i = 0; i <= n; i++) {
            h.incrementarHora();
            h.mostrarHora();
        }
    }
}
