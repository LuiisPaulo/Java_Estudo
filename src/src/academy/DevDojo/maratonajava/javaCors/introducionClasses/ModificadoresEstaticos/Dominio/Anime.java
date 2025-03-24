package academy.DevDojo.maratonajava.javaCors.introducionClasses.ModificadoresEstaticos.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
     // 0 - Bloco de inicializacao e executado quando a JVM carregar a classe
     // 1 - Alocando espaco de memoria
     // 2 - Cada atributo ou classe e criado e inicializado com valores default ou que for passado
     // 3 - Bloco de inicializacao e executado
     // 4 - Construtor começa a ser executando

    // bloco de inicialização:
    static {
        System.out.println("Inicializando o anime");
        episodios = new int[5];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i;
        }
    }

    public Anime(String nome, int[] episodios) {
        this.nome = nome;
        Anime.episodios = episodios;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }

        for (int episodio : episodios){
            System.out.println(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}
