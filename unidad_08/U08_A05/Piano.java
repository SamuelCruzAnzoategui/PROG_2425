
package U08_A05;

import U08_A04.Instrumento;
public class Piano extends Instrumento {
    @Override
    public void interpretar() {
        System.out.print("Melodia: ");
        for (int j = 0; j < i; j++) {
            System.out.print(melodia[j] + " ");
        }
    }
}
