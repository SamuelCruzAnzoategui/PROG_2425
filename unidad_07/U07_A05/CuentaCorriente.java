package U07_A05;

public class CuentaCorriente {

    String nombre;
    String dni;
    double saldo;
    Gestor gestor;

    CuentaCorriente(String nombre, String dni, Gestor gestor) {
        this.nombre = nombre;
        this.dni = dni;
        this.gestor = gestor;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }

    public void mostrarGestor() {
        if (gestor != null) {
            System.out.println("Nombre del gestor: " + gestor.getNombre());
            System.out.println("Teléfono: " + gestor.getTeléfono());
            System.out.println("Importe máximo: " + gestor.getImporteMax());
        } else {
            System.out.println("No hay gestor");
        }
    }
}
