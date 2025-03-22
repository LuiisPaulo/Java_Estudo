package academy.DevDojo.maratonajava.javaCors.introducionClasses.ModificadoresEstaticos.Teste;

import academy.DevDojo.maratonajava.javaCors.introducionClasses.ModificadoresEstaticos.Dominio.Carros;

public class CarrosTeste {
    public static void main(String[] args) {
        Carros c1 = new Carros("BMW",200);
        Carros c2 = new Carros("Mercedes",275);
        Carros c3 = new Carros("Audi", 290);

        Carros.setVelocidadeLimite(320); // fara referencia para todos os objetos
        c1.imprimiCarros();
        c2.imprimiCarros();
        c3.imprimiCarros();
    }
}
