
package U07_A05;


public class Gestor {
    private String nombre;
    public int teléfono;
    private double importeMax;
    
    Gestor (String nombre, int teléfono, double importeMax) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.importeMax = importeMax;
    }
    Gestor (String nombre, int teléfono) {
        this(nombre, teléfono, 10000);
    }

    public double getImporteMax() {
        return importeMax;
    }

    public void setImporteMax(double importeMax) {
        if (importeMax >= 0) {
            this.importeMax = importeMax;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }
    
}