// Atividade 4

import java.util.Scanner;

public class ex04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        System.out.println("Sistema de contagem de números pares!");

        int par = 0; 

        for(int i = 0; i < v.length; i++){
            System.out.println("Digite um número inteiro");
            v[i] = sc.nextInt();

            if( v[i] % 2 == 0 ){
                par++;
            }
        }

        System.out.printf("Dentre os números que foram digitados %d são pares", par);

    }
}