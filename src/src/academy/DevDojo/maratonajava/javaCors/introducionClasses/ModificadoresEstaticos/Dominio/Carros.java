package academy.DevDojo.maratonajava.javaCors.introducionClasses.ModificadoresEstaticos.Dominio;

public class Carros {
    private String nome;
    private static double velocidadeLimite;
    private double velocidadeMaxima;


    public Carros(String nome, double  velocidadeLimite) {
        this.nome = nome;
        Carros.velocidadeLimite = velocidadeLimite;
        // this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimiCarros(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+Carros.velocidadeLimite);

    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carros.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
        // return Carros.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
