package academy.DevDojo.maratonajava.javaCors.introducionClasses.dominio;

public class Pessoa2 {
    public String nome;
    public int idade;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // seta/define o nome
    public void setNome(String nome){
        this.nome = nome;
    }

    // seta/define a idade
    public void setIdade(int idade){
        this.idade = idade;
    }

    // retornar o nome
    public String getNome(){
        return this.nome;
    }

    // retorna idade
    public int getIdade(){
        return this.idade;
    }
}
