// Atividade 1

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[5];

        for(int i = 0; i < v.length; i++){
            System.out.printf("Digite o número do verto V[%d] \n", i);
            v[i] = sc.nextInt();
        }

        System.out.println("Os valores digitados foram: ");
        for(int l = 0; l <= v.length; l++){
            System.out.printf(" %d ",v[l]);
        }
    }
}
