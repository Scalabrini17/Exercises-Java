//13.Calcular a área de um triângulo.
import java.util.Scanner;

public class Unidade_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número referente a Base do Triangulo: ");
        double bTri = sc.nextDouble();

        System.out.println("Digite o número referente a Altura");
        double Altu = sc.nextDouble();

        double baseAltu = bTri * Altu;

        double resulFinal = baseAltu / 2;

        System.out.println("A área de um triangulo é: " + resulFinal);

    }
}
