//7. Calcular a subtração entre dois números.
import java.util.Scanner;

public class Unidade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        int sub = num1 - num2;

        System.out.println("A subitração entre esses dois números é: " + sub);
    }
}
