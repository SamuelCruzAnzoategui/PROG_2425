
package U07_A05;


public class Gestor {
    private String nombre;
    public int tel�fono;
    private double importeMax;
    
    Gestor (String nombre, int tel�fono, double importeMax) {
        this.nombre = nombre;
        this.tel�fono = tel�fono;
        this.importeMax = importeMax;
    }
    Gestor (String nombre, int tel�fono) {
        this(nombre, tel�fono, 10000);
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

    public int getTel�fono() {
        return tel�fono;
    }

    public void setTel�fono(int tel�fono) {
        this.tel�fono = tel�fono;
    }
    
}