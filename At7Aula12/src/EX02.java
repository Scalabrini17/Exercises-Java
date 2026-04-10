//2. Plano de internet

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Recebedo dados
        System.out.println("Olá seja bem vindo a Compania de Internet (WIFI)");
        System.out.println("Para começar vou te apresentar nossos planos");

        System.out.println("Temos o plano BÁSICO que custa R$50");
        System.out.println("Temos o plano PREMIUM que custa R$100");
        System.out.println("Temos o plano ULTRA que custa R$150");

        System.out.print("Digite qual o nome do plano você deseja (BASICO, PREMIUM OU ULTRA): ");
        String plano = sc.nextLine().toUpperCase();

        switch (plano) {
            case "BASICO" -> System.out.print("O plano que você escolheu é o BÁSICO você agora pagará uma assinatura de R$ 50 por mês");

            case "PREMIUM" -> System.out.print("O plano que você escolheu é o BÁSICO você agora pagará uma assinatura de R$ 100 por mês");

            case "ULTRA" -> System.out.print("O plano que você escolheu é o BÁSICO você agora pagará uma assinatura de R$ 150 por mês");
            
            default -> System.out.print("O plano que você digitou é invalido, digite novamente por favor!");

        }
    }
}
