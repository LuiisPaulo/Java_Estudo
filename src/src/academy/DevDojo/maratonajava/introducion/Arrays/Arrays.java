package academy.DevDojo.maratonajava.introducion.Arrays;

public class Arrays {
    public static <Sring> void main(String[] args) {
        // Arrays condjuntos de elementos/dados, que se tornam indices acoplados
        // Comeca a partir do indice 0 e acaba tento continuidade de 0 de n
        int[] idade = new int[3];
        idade[0] = 1;
        idade[1] = 2;
        idade[2] = 3;

        System.out.println(idade[0] + " " + idade[1] + " " + idade[2]);

        // continuacao:
        int[] elements = new int[3];
        String[] personagens = new String[5];
        personagens[0] = "Naruto";
        personagens[1] = "Boruto";
        personagens[2] = "Luis Paulo";
        personagens[3] = "Ola mundo";
        personagens[4] = "Heloisa Gostosa";

        // imprimi a lista
        for(int i = 0; i < personagens.length; i++){
            System.out.println(personagens[i]);
        }

        // inicializacao mais pratica
        String[] teste = {"Ola", "teste"};
        for (int j = 0; j < teste.length; j++){
            System.out.println(teste[j]);
        }

        int[] teste2 = {1, 2, 3};
        // versao simplificada de impressa
        for( int num : teste2){
            System.out.println(teste[num]);
        }

        // Array multimencionais
        // Arrays com multiplos arrays acoplados entre si
        // exemplo:
        int[][] mesesEdias =  new int[12][3];
        mesesEdias[0][0] = 1;
        mesesEdias[0][1] = 2;
        mesesEdias[0][2] = 3;

        mesesEdias[1][0] = 1;
        mesesEdias[1][1] = 2;
        mesesEdias[1][2] = 3;

        for (int i = 0; 1 < mesesEdias.length; i++){
           // System.out.println("Dias: " + i );
            for(int j = 0; j < mesesEdias[0].length; j ++){
                System.out.println(mesesEdias[i][j]);
            }
        }

        // array multimensional com foreach
        for(int[] arrBase : mesesEdias){
            for(int num:  arrBase){
                System.out.println(num);
            }
        }

        // inicializando um array multimensional
        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[4];

        for(int[] arrBase : array){
            for(int num:  arrBase){
                System.out.println(num);
            }

            // outra forma de inicializar
            int[][] array2 = {{9,9}, {1,2,4}, {3,4,5}};
            // exemplo de como inicializar ja com a possicoes e a quantidades de arrays

        }

    }
}
