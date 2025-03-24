package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprimir(){
        System.out.println(this.nome);
        if(professores == null){
            return;
        }
        for(Professor professores : professores){
            System.out.println(professores.getNome());
        }
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Escola(String nome, Professor professores) {
        this.nome = nome;
    }
}
