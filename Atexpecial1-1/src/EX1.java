
//Calculo de números pares
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = sc.nextFloat();
        
        System.out.print("Digite o segundo número: ");
        float num2 = sc.nextFloat();
        
        System.out.print("Digite o terceiro número: ");
        float num3 = sc.nextFloat();
        
        System.out.print("Digite o quarto número: ");
        float num4 = sc.nextFloat();

        float rest = 0;

        if(num1 % 2 == 0){
            rest += num1;
        }
        
        if(num2 % 2 == 0){
            rest += num2;
        }
        
        if(num3 % 2 == 0){
            rest += num3;
        }
        
        if(num4 % 2 == 0){
            rest += num4;
        }

        System.out.printf("A soma dos números que são pares é: %.2f", rest);
    }
}
