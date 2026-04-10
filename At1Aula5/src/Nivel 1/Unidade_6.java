//6. Calcular a soma de dois números.
import java.util.Scanner;

public class Unidade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma entre os dois números é: " + soma);

    }
}

