package At14Aula27;

public class Ex04{
    public static void main(String[] args){

        int[][] matriz = {{20, 15, 80}, {71, 38, 2}, {45, 10, 91}};
        int pares = 0;

        for(int[] i : matriz){
           for(int j : i){
               if(j % 2 == 0){
                    pares++;
               }
           }
        }

        System.out.printf("A quantidade de números pares nessa matriz é: %d ", pares);

    }
}