//4. Calcular o valor total de uma compra (preço × quantidade).
import java.util.Scanner;

public class Unidade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de cada item comprado: ");
        int quantiItens = sc.nextInt();

        System.out.print("Digite o valor do item comprado: ");
        float valorItem = sc.nextFloat();

        double valorFinal = valorItem * quantiItens;

        System.out.println("O valor total da sua compra é: " + valorFinal);

    }
}
