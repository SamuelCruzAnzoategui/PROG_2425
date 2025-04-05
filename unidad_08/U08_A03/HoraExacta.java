
package U08_A03;

import U08_A01.Hora;
public class HoraExacta extends Hora {
    private int segundo;
    
    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        this.segundo = segundo;
    }
    public boolean setSegundos(int valor) {
        if (valor > 0 && valor < 60) {
            segundo = valor;
            return true;
        }
        return false;
    }
    @Override
    public void inc() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
    @Override
    public String toString() {
        String cad = "Hora exacta: " + hora + " : " + minuto + " : " + segundo;
        return cad;
    }
    @Override
    public boolean equals(Object obj) {
        HoraExacta h = (HoraExacta) obj;
        boolean iguales;
        iguales = this.hora == h.hora && this.minuto == h.minuto && this.segundo == h.segundo;
        return iguales;
    }
}
