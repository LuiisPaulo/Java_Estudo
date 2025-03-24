package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio.Jogador;
import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio.Time;

public class JogadorTeste2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar" );

        Time time = new Time("Tokyo Inspiron");

        jogador1.setTime(time);
        jogador1.imprimirJogadores();
    }
}
