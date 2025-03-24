package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Exercicio.Dominio;

public class Seminario {
    private String titulo;
    Aluno[] aluno;
    Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] aluno) {
        this.titulo = titulo;
        this.aluno = aluno;
    }

    public Seminario(String titulo, Aluno[] aluno,  Local local) {
        this.titulo = titulo;
        this.aluno = aluno;
        this.local = local;
    }

    public void imprimir(){
        System.out.println(this.titulo);

        if(aluno == null){
            return;
        }

        for(Aluno aluno : aluno){
            System.out.println(this.aluno);
        }

        if(local != null){
            System.out.println(this.local);
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
