//4. Calcular o triplo de um número.
import java.util.Scanner;

public class Unidade_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int num = sc.nextInt();

        int triplo = num * 3;

        System.out.println("O triplo do número digitado é: " + triplo);

    }
}