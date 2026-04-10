//8. Calcular a multiplicação entre dois números.
import java.util.Scanner;

public class Unidade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        int mult = num1 * num2;

        System.out.println("A multiplicação entre esses dois números é: " + mult);
    }
}
