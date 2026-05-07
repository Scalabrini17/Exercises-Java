//Atividade 2

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        for(int i = 0; i < v.length; i++){
            System.out.printf("Digite o número do vetor v[%d]:", i);
            v[i] = sc.nextInt();
        }
        
        System.out.println("Od números lidos em ordem são: ");

        for(int l = v.length -1; l >=0; l--){
            System.out.printf(" %d ", v[l]);
        }

    }
}
