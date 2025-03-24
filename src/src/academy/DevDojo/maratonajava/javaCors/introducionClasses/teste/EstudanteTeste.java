package academy.DevDojo.maratonajava.javaCors.introducionClasses.teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Ichigo";
        estudante.idade =  21;
        estudante.sexo = "Masculino";

        System.out.println(estudante.name);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
