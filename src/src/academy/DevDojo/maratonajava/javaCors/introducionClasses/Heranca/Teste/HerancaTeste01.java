package academy.DevDojo.maratonajava.javaCors.introducionClasses.Heranca.Teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.Heranca.Dominio.Endereco;
import academy.DevDojo.maratonajava.javaCors.introducionClasses.Heranca.Dominio.Funcionario;
import academy.DevDojo.maratonajava.javaCors.introducionClasses.Heranca.Dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa  = new Pessoa();
        endereco.setLogadouro("Elbaf");
        endereco.setNumero(123);
        pessoa.setNome("Loki");
        pessoa.setCpf("23345345-88483");
        pessoa.imprimir();

        System.out.println("--------------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setCpf("23345345-0000");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(23423.89);
        funcionario.imprimir();
        funcionario.getSalario();

    }
}
