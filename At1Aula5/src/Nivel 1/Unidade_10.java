//10.Converter metros para centímetros.
import java.util.Scanner;

public class Unidade_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em Mt: ");
        double metros = sc.nextDouble();

        double cent = metros * 100;

        System.out.println("O valor digitado, em centímetros é: " + cent);

    }
}