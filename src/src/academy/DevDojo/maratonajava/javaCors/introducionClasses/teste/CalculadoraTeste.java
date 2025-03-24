package academy.DevDojo.maratonajava.javaCors.introducionClasses.teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.Metodos.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.calcular();
        calculadora.multiplicar(1, 2);
        calculadora.dividir(2, 2);
        int num1 = 4;
        int num2 = 5;
        calculadora.alteraDoisNumeros(num1, num2);
    }
}
