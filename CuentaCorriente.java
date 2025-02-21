
package U07_A02;

public class CuentaCorriente {
    String nombre;
    String dni;
    double saldo;
    
    CuentaCorriente (String nombre, String dni, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }
    CuentaCorriente (String dni, double saldo) {
        this("", dni, saldo);
    }
    public void mostrarInformacion() {
        System.out.println("Nombre del titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}