package academy.DevDojo.maratonajava.javaCors.introducionClasses.Construtores.Dominio;

public class Anime {
    // sobre carga de metodos
    private String nome;
    private String tipo;
    private int episodios;
    private String categoria;
    private String genero;

    // Construtores
    // Nao pode ter retorno
    public Anime(String nome, String tipo, int episodios, String categoria) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.categoria = categoria;
    }

    // Construtor sobrecarregado
    public Anime(String nome, String tipo, int episodios, String categoria, String genero) {
        this(nome, tipo, episodios, categoria);
        System.out.println("Construtor sobrecarregado");
        this.genero = genero;
    }

    public Anime(){
        System.out.println("Construtor sem argumento");
    }

    // imprime
    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.categoria);
        System.out.println(this.genero);
    }

//    // metodo de inicializacao
//    public void init(String nome, String tipo, int episodios){
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//    }
//
//    // metodo sobrecarregado
//    public void init(String nome, String tipo, int episodios, String categoria){
////        this.nome = nome;
////        this.tipo = tipo;
////        this.episodios = episodios;
//        this.init(nome, tipo, episodios);
//        this.categoria = categoria;
//    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // getters

    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }
}
