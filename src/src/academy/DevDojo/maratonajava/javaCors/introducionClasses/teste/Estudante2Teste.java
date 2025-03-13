package academy.DevDojo.maratonajava.javaCors.introducionClasses.teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.dominio.Estudante2;

public class Estudante2Teste {
    public static void main(String[] args) {
        Estudante2  estudante2 = new Estudante2();
        estudante2.name = "Luffy";
        estudante2.idade = 18;
        estudante2.sexo = "Masculino";
        String saida = estudante2.name + " " + estudante2.idade + " " +  estudante2.sexo;
        System.out.println(saida);
    }

}
