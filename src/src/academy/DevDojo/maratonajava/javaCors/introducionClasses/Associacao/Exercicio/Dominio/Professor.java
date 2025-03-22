package academy.DevDojo.maratonajava.javaCors.introducionClasses.Associacao.Exercicio.Dominio;

public class Professor {
    private String nome;
    private String especialidade;
    Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimir(){
        System.out.println("Infos Professor");
        System.out.println(this.nome);
        System.out.println(this.especialidade);

        if(seminarios == null){
            return;
        }

        System.out.println("Seminarios cadastrados: ");
        for(Seminario seminarios : seminarios){
            System.out.println(seminarios.getTitulo());
            System.out.println(seminarios.getLocal().getEndereco());
            System.out.println("Alunos inseridos nesse seminario:");
            if(seminarios.getAluno() == null) continue;
            for(Aluno aluno : seminarios.getAluno()){
                System.out.println("Nome e Idade do Aluno");
                System.out.println(aluno.getNome() + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
