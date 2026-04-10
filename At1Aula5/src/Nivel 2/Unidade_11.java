import java.util.Scanner;

public class Unidade_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Taxi Fatesg");
        System.out.println("---------------");

        System.out.print("Digite o nome do Passageiro: ");
        String nomepass = sc.next();

        System.out.print("Digite qual o valor por quilometro rodado: ");
        double valorporkm = sc.nextDouble();

        System.out.print("Digite quantos quilometros foram rodados: ");
        double kmrodado = sc.nextDouble();

        System.out.print("Por fim digite o valor fixo da corrida: ");
        double valorfix = sc.nextDouble();

        // Calculos!
        double valorKmTotal = kmrodado * valorporkm;
        double valorFinal = valorKmTotal + valorfix;

        // Resposta final!
        System.out.printf("A corrida do passageiro %s é %.2f", nomepass, valorFinal );

    }
}
