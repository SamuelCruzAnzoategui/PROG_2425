
package U08_A04;


public abstract class Instrumento {
    public enum notas {
        DO, RE, MI, FA, SOL, LA, SI
    }
    
    public notas[] melodia = new notas[10];
    public int i = 0;

    public void add(notas nota) {
        if (i < melodia.length) {
            melodia[i] = nota;
            i++;
        } else {
            System.out.println("La melodía está llena, no se pueden añadir más notas.");
        }
    }

    public abstract void interpretar();
}
