package academy.DevDojo.maratonajava.javaCors.introducionClasses.Sobrecarga.Teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.Sobrecarga.Dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        // init padrao
       // anime.init("Blech", "TV", 332);
        // init sobrecarregado
        anime.init("Blech2", "TV2", 3367, "Action");
//        anime.setNome("Bleach");
//        anime.setTipo("TV");
//        anime.setEpisodios(535);
        anime.imprimir();
    }
}
