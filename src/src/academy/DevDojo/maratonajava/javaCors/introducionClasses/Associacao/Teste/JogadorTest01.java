package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1  =  new Jogador("Neymar");
        Jogador jogador2  =  new Jogador("Cristiano Ronaldo");
        Jogador jogador3  =  new Jogador("Messi");

        // Jogador[] jogadores = new Jogador[]{jogador1,jogador2, jogador3};
        Jogador[] jogadores = {jogador1,jogador2, jogador3};
        for(Jogador jogador : jogadores){
            jogador.imprimirJogadores();
        }
    }
}
