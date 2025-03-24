package academy.DevDojo.maratonajava.javaCors.introducionClasses.dominio;

public class Funcionaria {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalarios = 0;

    public void imprimirFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salarios);
        System.out.println(this.mediaSalarios);
    }

    public double getMediaSalarios() {
        return mediaSalarios;
    }

    public void setMediaSalarios(double mediaSalarios) {
        this.mediaSalarios = mediaSalarios;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
