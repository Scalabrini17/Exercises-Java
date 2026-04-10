//12.Calcular a área de um quadrado.
import java.util.Scanner;

public class Unidade_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do Quadrado: ");
        double larg = sc.nextDouble();

        double areaDoQuad = larg * larg;

        System.out.println("A área do quadrado é: " + areaDoQuad);
        
    }
}
