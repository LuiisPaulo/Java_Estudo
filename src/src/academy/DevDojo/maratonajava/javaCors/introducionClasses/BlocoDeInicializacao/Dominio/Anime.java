package academy.DevDojo.maratonajava.javaCors.introducionClasses.BlocoDeInicializacao.Dominio;

public class Anime {
    private String nome;
    private int[] episodios;
     // 1 - Alocando espaco de memoria
     // 2 - Cada atributo ou classe e criado e inicializado com valores default ou que for passado
     // 3 - Bloco de inicializacao e executado
     // 4 - Construtor começa a ser executando

    // bloco de inicialização:
    {
        System.out.println("Inicializando o anime");
        episodios = new int[5];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i;
        }
    }

    public Anime(String nome, int[] episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }

        for (int episodio : this.episodios){
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
        this.episodios = episodios;
    }
}
