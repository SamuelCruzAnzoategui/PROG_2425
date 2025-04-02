
package U07_A08;


public class Sintonizador {
    private double frecuencia;

    public Sintonizador(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    public Sintonizador() {
        this(80);
    }
    public double up() {
        frecuencia += 0.5;
        comprobarRango();
        return frecuencia;
    }
    public double down() {
        frecuencia -= 0.5;
        comprobarRango();
        return frecuencia;
    }
    public void display() {
        System.out.println("Frecuencia: " + frecuencia);
    }
    public boolean comprobarRango() {
        if (frecuencia < 80) {
            frecuencia = 108;
            return true;
        } else if (frecuencia > 108) {
            frecuencia = 80;
            return true;
        }
        return false;
    }
}
