package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio.Professor;
import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio.Escola;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professores = new Professor("Jiraya Sensei");
        Professor professores2 = new Professor("Kakashi Sensei");
        Professor[] professoresArray = new Professor[]{professores, professores2};
        Escola escola = new Escola("Konoha", professoresArray);

        escola.imprimir();
    }
}
