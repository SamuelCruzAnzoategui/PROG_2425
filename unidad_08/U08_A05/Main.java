
package U08_A05;

import U08_A04.Instrumento.notas;
public class Main {
    public static void main(String[] args) {
        Piano p = new Piano();

        p.add(notas.DO);
        p.add(notas.RE);
        p.add(notas.MI);
        p.add(notas.FA);
        p.add(notas.SOL);
        p.add(notas.LA);
        p.add(notas.SI);
        p.interpretar();
    }
}
