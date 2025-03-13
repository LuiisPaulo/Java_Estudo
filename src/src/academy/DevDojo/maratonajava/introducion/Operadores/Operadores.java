package academy.DevDojo.maratonajava.introducion.Operadores;

public class Operadores {
    public static void main(String[] args) {
        // operadores aritmeticos
        // +, -, *, /
        int number1  = 2;
        int number2 = 2;
        int sameNumber = number1 + number2;
        int subNumber = number1 - number2;
        int multNumber = number1 * number2;
        int divNumber = number1 / number2;

        System.out.println("sameNumber: " + sameNumber);
        System.out.println("subNumber: " + subNumber);
        System.out.println("multNumber: " + multNumber);
        System.out.println("divNumber: " + divNumber);


        // operadores relacionais
        // resto -> %
        // exemplo de divisao
        int resto = 4 % 2;
        System.out.println("resto: " + resto);

        // operador maior >, operador menor <
        // operador maior igual >=, menor igual <=
        // igualdade ==, diferente !=
        boolean isMaior = 10 >  20;
        boolean isMenor = 10 < 20;
        boolean isMaiorOuIgual = 10 >= 20;
        boolean isMenorOuIgual = 10 <= 20;
        boolean isIgual =  10 == 20;
        boolean isDifente =  10 != 20;

        System.out.println(isMaior);
        System.out.println(isMenor);
        System.out.println(isMaiorOuIgual);
        System.out.println(isMenorOuIgual);
        System.out.println(isIgual);
        System.out.println(isDifente);

        // Operadores Logicos
        // AND -> && ( e )
        // OR -> || ( ou )
        // NOT -> ! ( negacao )

        // AND
        int idade = 49;
        float salario =  4500.00f;
        boolean isConformidade = idade < 40 && salario > 4500;
        System.out.println(isConformidade);

        // OR
        int idade2 = 50;
        float salario2 = 4500.00f;
        boolean isConformidade2 = idade < 54 || salario2 > 4500;
        System.out.println(isConformidade2);

        // operadores aritimeticos
        // ==, +=, -=, *=, /=, %=
        int bonus = 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 111;
        bonus /= 111;
        bonus %= 111;
        System.out.println(bonus);


    }
}
