
import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundio número (Esse número deve ser maior que o primeiro!): ");
        int num2 = sc.nextInt();

        

        // Exibindo todos os números pares entre o num1 e num2 
        for (int i = num1; i <= num2; i++){
            if (i % 2 == 0){
                System.out.printf("Os números pares entre %d e %d é: %d \n", num1, num2, i);
            }
        }
    }
}