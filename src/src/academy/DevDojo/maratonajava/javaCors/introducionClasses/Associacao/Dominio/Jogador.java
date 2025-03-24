package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprimirJogadores(){
        System.out.println("Nome: "+this.nome);
        if( time != null){
            System.out.println(time.getTime() );
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
