// Exercício 1: Preencher e Exibir Matriz
package At14Aula27;


import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de linhas de 1 a 10: ");
        int linha = sc.nextInt();

        System.out.print("Digite um número de colunas de 1 a 10: ");
        int coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for(int i = 0; i < matriz.length; i++){
            for(int o = 0; o < matriz[i].length; o++){
                System.out.printf("Matriz [%d] [%d] = %d \n", i, o, matriz[i][o]);
            }
        }

    }
}
