
package U07_A07;


public class Main {
    public static void main(String[] args) {
        
        Texto texto = new Texto(20);
        texto.a�adirCaracterInicio('�');
        texto.a�adirCadenaInicio("Hola");
        texto.a�adirCaracterFinal(' ');
        texto.a�adirCadenaFinal("Mundo");
        texto.a�adirCaracterFinal('!');
        texto.mostrarInformacion();
    }
}
