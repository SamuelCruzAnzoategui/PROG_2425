
package U07_A04;

import java.util.Scanner;
public class CuentaCorriente {
    String nombre;
    String dni;
    double saldo;
    String banco;
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
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public void mostrarBanco() {
        System.out.println("Nomnbre del banco: " + banco);
        System.out.print("¿Desea cambiar el nombre del banco? ");
        String nombreBanco = sc.nextLine();
        nombreBanco = nombreBanco.toLowerCase();
        if ("si".equals(nombreBanco)) {
            System.out.print("Introduce el nombre del banco: ");
            banco = sc.nextLine();
        }
    }
}