package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio;

public class  Time {
    private String time;
    private Jogador[] jogadores;

    public Time(String time) {
        this.time = time;
    }

    public Time(String time, Jogador[] jogadores) {
        this.time = time;
        this.jogadores = jogadores;
    }

    public void imprimir(){
        System.out.println(this.time);
        if(jogadores == null){
            return;
        }
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getTime());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
