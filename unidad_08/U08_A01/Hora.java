
package U08_A01;


public class Hora {
    public int hora;
    public int minuto;
    
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }    
    }
    public boolean setMinutos(int valor) {
        if (valor > 0 && valor < 60) {
            minuto = valor;
            return true;
        }
        return false;
    }
    public boolean setHora(int valor) {
        if (valor > 0 && valor < 24) {
            hora = valor;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String cad = "Hora: " + hora + " : " + minuto;
        return cad;
    }
}
