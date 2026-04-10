//2. Dividir uma conta de restaurante entre amigos.
import java.util.Scanner;

public class Unidade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor da conta do Restaurante: ");
        double ct = sc.nextDouble();

        System.out.print("Quantas pessoas irão pagar a conta: ");
        int pc = sc.nextInt();

        double valpessoa = ct / pc;

        System.out.println("O valor que cada pessoa deve pagar ao restaurante é de: R$" + valpessoa);

    }
}
