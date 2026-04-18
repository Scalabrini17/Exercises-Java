// ler a taxa de cambio 1 dolar é 2,25 reais 
// O usuario digita um valor (scanner) e o programa faz a conversão de dolar para real em um loop, (pode fazer mais de uma converção)
//no final mostrar quantas conversãoes foram feitas e o valor total das converções

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valTaxa = 5.25;
        int contagem = 0;
        double valorTotal = 0;
        String sair = "";

        System.out.println("Seja bem vindo ao sistema de conversão de moeda!");
        System.out.print("Você quer comerçar o programa digite (S):  ");
        String start = sc.next().toUpperCase();

        while(!(start.equalsIgnoreCase("N") || sair.equalsIgnoreCase("N"))){

            if(start.equalsIgnoreCase("S")){
                contagem ++;

                System.out.print("Digite um valor em dolar para converter para real: ");
                double valor = sc.nextDouble();

                double valconv = valTaxa * valor;

                valorTotal += valconv;
            }

            System.out.println("Você deseja continuar? Digite S para sim e N para não: ");
            sair = sc.next().toUpperCase();
            
        }

        System.out.printf("O valor total de todas as conversões é: R$%.2f \n", valorTotal);
        System.out.printf("O valor total de converções que foram feitas é: %d conversões \n", contagem);

       
    }
}
