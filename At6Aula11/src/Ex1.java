
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float baseFator = 100;

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Você é fumante se sim digite (true) ou se não digite (false): ");
        boolean fumante = sc.nextBoolean();

        System.out.print("Digite qual é o seu IMC (Índice de Massa Corporal): ");
        float imc = sc.nextFloat();

        if (idade >= 18 && idade <= 35 && fumante == false && imc < 30){
            baseFator *= 1;

        }else if (idade >= 18 && idade <= 35 && fumante == false && imc >= 30){
            baseFator *= 1.3;

        }else if (idade >= 18 && idade <= 35 && fumante == true && imc < 30){
            baseFator *= 1.8;

        }else if (idade >= 18 && idade <= 35 && fumante == true && imc >= 30){
            baseFator *= 2.2;

        }else if (idade >= 36 && idade <= 55 && fumante == false && imc < 30){
            baseFator *= 1.5;

        }else if (idade >= 36 && idade <= 55 && fumante == false && imc >= 30){
            baseFator *= 2;

        }else if (idade >= 36 && idade <= 55 && fumante == true && imc < 30){
            baseFator *= 2.5;

        }else if (idade >= 36 && idade <= 55 && fumante == true && imc >= 30){
            baseFator *= 3;

        }else if (idade > 55 && fumante == false && imc < 30){
            baseFator *= 2.5;

        }else if (idade > 55 && fumante == false && imc >= 30){
            baseFator *= 3.2;
            
        }else if (idade > 55 && fumante == true && imc > 1){
            baseFator *= 4;
        }

        System.out.println("Seu prêmio mensal do seguro de vida baseado ns três informações dadas a cima é: R$ "+ baseFator);

    }
}
