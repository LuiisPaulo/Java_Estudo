package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio.Jogador;
import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Time time = new Time("Corinthians");
        Jogador jogador = new Jogador("Depay");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        //jogador.imprimir();
        time.imprimir();



    }
}
