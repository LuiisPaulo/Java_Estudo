package academy.DevDojo.maratonajava.introducion.TiposPrimitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Tipos primitivos");
        // exemplo
        int age = 10;
        double height = 1.5;
        float weight = 12.5f;
        char gender = 'M';
        short yearOfBirth = 1980;
        byte   hoursOfWork = 7;
        boolean trueOrFalse = true;

        // para mostrar a variavel de ambiente conctenada com uma string
        System.out.println("Age : " + age);

        // As variaveis podem fazer um casting, como:
        int age2 = (int) 3333; // forcando a ser um int

        // String -> nao e um tipo primitivo
        String name = "teste";

        System.out.println("Name : " + name);
    }
}
