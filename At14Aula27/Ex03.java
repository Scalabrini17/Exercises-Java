package At14Aula27;

public class Ex03 {
    public static void main(String[] args) {

        int[][] matrizA = {{10, 21}, {23, 4}, {13, 5}};
        int[][] matrizB = {{5, 10, 30, 1}, {95, 2, 5, 8}};
        int[][] matrizC = new int[3][4];

        for (int lineA = 0; lineA < matrizA.length; lineA++) {
            for (int colunB = 0; colunB < matrizB[0].length; colunB++) {
                for (int p = 0; p < matrizA[0].length; p++) {
                    matrizC[lineA][colunB] += matrizA[lineA][p] * matrizB[p][colunB];
                }
            }
        }

        //Imprimindo no terminal tabela1

        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA[i].length; j++){
                System.out.printf("Matriz A [%d][%d] = %d \n", i, j, matrizA[i][j]);
            }
        }
        for(int i = 0; i < matrizB.length; i++){
            for(int j = 0; j < matrizB[i].length; j++){
                System.out.printf("Matriz B [%d][%d] = %d \n", i, j, matrizB[i][j]);
            }
        }
        for(int i = 0; i < matrizC.length; i++){
            for(int j = 0; j < matrizC[i].length; j++){
                System.out.printf("Matriz C [%d][%d] = %d \n", i, j, matrizC[i][j]);
            }
        }



    }
}

