
package U07_A05;


public class Main {
    public static void main(String[] args) {
        
        Gestor g = new Gestor("Pedro", 628166293);
        Gestor g1 = new Gestor("Paca", 638229173, 20000);
        CuentaCorriente c = new CuentaCorriente("Paco", "52820165Y", g);
        CuentaCorriente c1 = new CuentaCorriente("Paqui", "36272829P", null);
        CuentaCorriente c2 = new CuentaCorriente("Pa", "52820165Y", g1);
        
        c.mostrarInformacion();
        c.mostrarGestor();
        c1.mostrarInformacion();
        c1.mostrarGestor();
        c2.mostrarInformacion();
        c2.mostrarGestor();
          
    }
}