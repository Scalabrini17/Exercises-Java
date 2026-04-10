//9. Calcular a divisão entre dois números.
import java.util.Scanner;

public class Unidade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        int divi  = num1 / num2;

        System.out.println("A divisão entre os dois números digitados é: " + divi);
    }
}
