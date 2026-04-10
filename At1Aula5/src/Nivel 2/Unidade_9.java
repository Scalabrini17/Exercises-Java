import java.util.Scanner;

public class Unidade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do azulejo (em metros quadrados): ");
        double tamanhoAzul = sc.nextDouble();

        System.out.print("Digite o tamanho da parede (em metros quadrados): ");
        double tamanhoParede = sc.nextDouble();

        double quantMetros = tamanhoAzul * tamanhoParede;

        System.out.printf("A quantidade de azulejos que precisa para preencher a parede é de %.2f m²", quantMetros);

    }
}