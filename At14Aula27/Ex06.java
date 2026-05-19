package At14Aula27;

public class Ex06 {
    public static void main(String[] args){

        int[][] matriz = {{45, 21, 30}, {5, 7, 90}, {2, 11, 87}};

        int maiorDez = 0;

        for(int[] i : matriz){
            for(int j : i){
                if(j > 10){
                    maiorDez++;
                }
            }
        }

        System.out.printf("Nessa matriz 3x3 existem %d maiores que 10!", maiorDez);
    }
}
