import java.util.Scanner;

public class Unidade_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite qual é o seu consumo de energia em KWh: ");
        double consumo = sc.nextDouble();

        System.out.print("Digite o valor do KWh na sua cidade: ");
        double valorkwh = sc.nextDouble();

        double valorFinal = consumo * valorkwh;

        System.out.printf("O seu gasto mensal com energia elétrica é: R$ %.2f", valorFinal);

    }
}
