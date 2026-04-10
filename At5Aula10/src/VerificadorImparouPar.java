import java.util.Scanner;

public class VerificadorImparouPar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número para a verificação: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O número "+ num +" é par");
        } else{
            System.out.println("O número "+ num +" é ímpar");
        }

        if (num > 0){
            System.out.println("O número " + num + " é positivo");
        } else if ( num < 0 ){
            System.out.println("O número "+ num + " é negativo");
        } else {
            System.out.println("O número é igual a zero!");
        }
    }
}