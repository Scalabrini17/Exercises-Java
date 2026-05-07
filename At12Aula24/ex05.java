// Atividade 5

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = {"ANA", "ITALLO", "PEDRO", "GABRIEL", "VITURINO", "RENAN", "MARCELO", "VICTOR"};

        System.out.println();

        System.out.println("Digite um nome da lista (escreva corretamente): ");
        String nomeDig = sc.next().toUpperCase();

        for (int i = 0; i < nome.length; i++) {
            if (nomeDig.equalsIgnoreCase(nome[i])) {

                System.out.printf("v[%d] nome = %s \n", i, nome[i]);

            }else{
                System.out.println("Nome não encontrado!");
                break;
            }
        }

    }
}
