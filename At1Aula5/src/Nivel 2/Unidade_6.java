//6. Calcular o valor de um produto com acréscimo de taxa.

import java.util.Scanner;

public class Unidade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do Produto: R$ ");
        float valorProd = sc.nextFloat();

        System.out.print("Digite o valor do acréscimo: R$ ");
        float valorAcres = sc.nextFloat();

        float valorTotal = valorProd + valorAcres;

        System.out.print("O novo valor do produto com o acréscimo é: R$ " + valorTotal);

    }
}
