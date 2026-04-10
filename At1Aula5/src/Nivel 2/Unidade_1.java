//1. Calcular o valor do troco.
import java.util.Scanner;

public class Unidade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valcompra = sc.nextDouble();

        System.out.print("Digite o valor pago ao caixa: ");
        double valpago = sc.nextDouble();

        double troco = valpago - valcompra;

        System.out.println("O valor do troco é: " + troco);

    }
}