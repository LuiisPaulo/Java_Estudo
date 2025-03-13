package academy.DevDojo.maratonajava.javaCors.introducionClasses.Metodos;

public class Calculadora {
    public void  calcular(){
        System.out.println(10 + 10);
    }

    public void multiplicar(int x, int y){
        System.out.println(x * y);
    }

    public double dividir(int x, int y) {
        double resultado = x / y;
        return resultado;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 34;
        num2 = 43;
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArrays(int[] numbers){
        int soma = 0;
        for (int i: numbers) {
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarargs(int... numeros){
        int soma = 0;
        for (int i: numeros) {
            soma += i;
        };
        System.out.println(soma);
    }
}

