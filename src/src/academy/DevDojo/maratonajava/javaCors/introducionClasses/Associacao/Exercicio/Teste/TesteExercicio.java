package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Exercicio.Teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Exercicio.Dominio.Aluno;
import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Exercicio.Dominio.Local;
import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Exercicio.Dominio.Professor;
import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Exercicio.Dominio.Seminario;

public class TesteExercicio {
    public static void main(String[] args) {
        Local local = new Local("Londrina");
        Aluno aluno = new Aluno("Luffy", 22);
        Professor professor =  new Professor("Oda", "Mangaka");
        Seminario seminario = new Seminario("Onde achar o One Piece");
        Aluno[] alunoParaSeminario = {aluno};
        Seminario[] seminarioDisponiveis = {seminario};
        professor.setSeminarios(seminarioDisponiveis);

        professor.imprimir();

    }
}
