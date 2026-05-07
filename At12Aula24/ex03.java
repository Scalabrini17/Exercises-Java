// Atividade 3 

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[4];

        int soma = 0;

        for(int i = 0; i < v.length; i++){
            System.out.println("Digite a primeira nota: ");
            v[i] = sc.nextInt();

            soma += v[i];
        }


        double media = soma / v.length;

        System.out.printf(" A média das notas do aluno é: %.2f nota \n", media);

        System.out.println("E as notas foram: ");
        for(int l = 0; l < v.length; l++){
            System.out.printf(" %d ", v[l]);
        }

    }
}
