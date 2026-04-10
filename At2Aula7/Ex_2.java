
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
     Scanner  sc = new Scanner(System.in);

        System.out.print("Digite a capacidade da caixa de água em litros: ");
        float capaCaixa = sc.nextFloat();

        System.out.print("Digite a vazão da torneira (em litros por minuto): ");
        float vazaoTorneira = sc.nextFloat();

        float tempoEnChimento = capaCaixa / vazaoTorneira;

        System.out.println("O tempo em que a caixa vai demorar para encher é: " + tempoEnChimento + " minutos!");

    }
}
