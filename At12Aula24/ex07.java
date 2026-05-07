// Atividade 7

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] v = {56, 47, 52, 10, 64, 16, 20, 30, 23, 47};

        System.out.println("Digite um número inteiro: ");
        int x = sc.nextInt();

        for(int i = 0; i < v.length; i++){
            int multi = x * v[i];

            System.out.printf("v[%d] -> multiplicação -> %d x %d = %d \n", i, x, v[i], multi );
        }
    }
}
