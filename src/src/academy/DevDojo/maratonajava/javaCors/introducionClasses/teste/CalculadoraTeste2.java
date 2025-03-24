package academy.DevDojo.maratonajava.javaCors.introducionClasses.teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.Metodos.Calculadora;

public class CalculadoraTeste2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] array = {1, 2, 3};
        calculadora.somaArrays(array);
        calculadora.somaVarargs(1, 2, 3, 4, 5, 6);
    }
}
