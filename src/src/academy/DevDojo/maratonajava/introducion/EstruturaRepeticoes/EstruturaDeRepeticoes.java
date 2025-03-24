package academy.DevDojo.maratonajava.introducion.EstruturaRepeticoes;

public class EstruturaDeRepeticoes {
    public static void main(String[] args) {
        // estrutura de repeticao
        // FOR
        System.out.println("For rodando");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // WHILE
        int i = 0;
        System.out.println("While rodando");
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        // DO WHILE
        int y = 0;
        System.out.println("DO While rodando");
        do {
            System.out.println(y);
            y++;
        }while(y <= 10);

        // Exercicio
        for(int z = 0; z<1000; z++){
            if(z % 2==0){
                System.out.println("E par: " + z);
            }
        }

        // break
        for(int h  = 0; h<1000; h++){
            if(h%2==0){
                System.out.println("Numero e par: " + h);
                if(h == 20){
                    System.out.println("Chegamos no vinte: " + h);
                    break;
                }
            }
        }

        // Continue
        for(int l = 0; l<1000; l++){
            if(l%2==0){
                System.out.println("Par: " + l);
                if(l == 20){
                    System.out.println("Chegamos no vinte: " + l);
                    System.out.println("Continuando");
                    continue;
                }
                if(l == 30){
                    System.out.println("Pararemos no: " + l);
                    break;
                }
            }
        }
    }
}
