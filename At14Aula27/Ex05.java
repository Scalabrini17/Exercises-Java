package At14Aula27;

public class Ex05 {
    public static void main(String[] args){

        int[][] matriz = { {23, 6, 14}, {7, 72, 22}, {25, 8, 2}};

        for(int i = 0; i < matriz.length; i++){
            int soma = 0;

            for(int j =0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }

            System.out.printf("A soma da linha [%d] é: %d \n",i, soma );
        }



    }
}
