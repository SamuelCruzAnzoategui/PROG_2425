
package U07_A07;


public class Main {
    public static void main(String[] args) {
        
        Texto texto = new Texto(20);
        texto.añadirCaracterInicio('¡');
        texto.añadirCadenaInicio("Hola");
        texto.añadirCaracterFinal(' ');
        texto.añadirCadenaFinal("Mundo");
        texto.añadirCaracterFinal('!');
        texto.mostrarInformacion();
    }
}
