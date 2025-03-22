package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Teste;
import java.util.*;
// import java.util.Scanner;

public class LeituraDeDadosTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        //System.out.println("Digite sua altura: ");
        //float altura = input.nextFloat();
        System.out.println("Digite seu sexo: (M para masculino e F para Femino) ");
        char sexo = input.next().charAt(0);
        System.out.println("Saida ----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        //System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
    }
}
