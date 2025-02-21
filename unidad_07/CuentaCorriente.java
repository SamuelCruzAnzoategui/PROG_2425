
package U07_A03;

import java.util.Scanner;
public class CuentaCorriente {
    public String nombre;
    String dni;
    private double saldo;
    Scanner sc = new Scanner(System.in);
    
    CuentaCorriente (String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public boolean sacarDinero(double cantidad) {
        System.out.print("Introduce una cantidad: ");
        cantidad = sc.nextDouble();
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Cantidad restante: " + saldo);
            return true;
        } else {
            System.out.println("Operación fallida");
            return false;
        }
    }
    public double ingresarDinero(double cantidad) {
        System.out.print("Introduce una cantidad: ");
        cantidad = sc.nextDouble();
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Saldo: " + saldo);
        } else {
            System.out.println("Operación fallida");
        }
        return saldo;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre del titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}