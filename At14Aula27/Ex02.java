// Exercício 2 Soma dos Elementos e Estatísticas

package At14Aula27;

public class Ex02 {
    public static void main(String[] args) {

        // declarando a matriz (1 gerar a matriz)
        int[][] matriz = { {8, 23, 6, 2}, {7, 12, 14, 2}, {5, 10, 30, 1}, {95, 2, 5, 8}};

        //soma das matrizes (2 soma das matrizes)
        int soma1 = 0; 

        for(int[] i : matriz){
            for(int soma2 : i){
                soma1 += soma2;
            }
        }

        System.out.printf("Soma dos números das Matrizes = %d \n", soma1);

        // Maior e menor valor (3 menor e maior valor e suas posisções )
        int maiornum = 1, menornum = 100;
        
        for(int[] i : matriz){
            for(int o : i){
                if(o > maiornum){
                    maiornum = o;

                }

                if(o < menornum){
                    menornum = o;
                }
            }
        }

        // Posição (3 posição dos valores )
        int posimaiorI = 0,posimaiorJ = 0,posimenorI = 0, posimenorJ = 0;

        for(int i = 0; i < matriz.length; i++){
            // soma dos elementos por lina (1)
            int somaLinha = 0;

            for(int j = 0; j < matriz[i].length; j++){
                if(maiornum == matriz[i][j]){
                    posimaiorI = i;
                    posimaiorJ = j;

                }

                if(menornum == matriz[i][j]){
                    posimenorI = i;
                    posimenorJ = j;
                }

                // Soma dos elementos por linha (2)
                somaLinha += matriz[i][j];
                
            }
            // Soma dos elementos por linha (3)
            System.out.printf("A soma da linha %d é: %d \n", i, somaLinha);

        }

        System.out.printf("O maior número é: %d [%d][%d] E o maior número é: %d [%d][%d] \n", maiornum,posimaiorI, posimaiorJ, menornum, posimenorI, posimenorJ);

        // media das elementos (4 media dos elementos)
        int totalElementos = 0;

        for(int[] i : matriz){
            for(int o : i){
                totalElementos++;
            }
        }

        // media dos elementos (2 parte do exercício 4)

        int media = soma1 / totalElementos;

        System.out.printf("media dos elementos: %d / %d = %d \n", soma1, totalElementos, media);

    }
}
