package academy.DevDojo.maratonajava.introducion.Condicionais;

public class Condicionais {
    public static void main(String[] args) {
        // IF -> se
        int idade = 13;
        if(idade < 18){
            System.out.println("Nao pode comprar");
        }
        if(idade > 18){
            System.out.println("Pode comprar");
        }

        // ELSE -> se nao
        int teste = 11;
        if(teste > 12){
            System.out.println("Maior que 12");
        }else{
            System.out.println("Menor que 12");
        }

        // ELSE IF
        int teste2 = 12;
        if(teste2 > 13) {
            System.out.println("Maior que 13");
        }else if (teste2 == 12){
            System.out.println("igual");
        }else{
            System.out.println("menor que 12");
        }

        // Operador ternario
        // exemplo:
        // condition ? expr1 : expr2

        // SWITCH
        int segunda = 1;
        switch(segunda){
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terca");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("outro");
        }
        // portanto acaba sendo um switch case
    }
}
