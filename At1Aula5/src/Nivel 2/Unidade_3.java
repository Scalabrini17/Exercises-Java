//3. Calcular o consumo médio de combustível.
import java.util.Scanner;

public class Unidade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a distancia percorrida com o automóvel: ");
        long distancia = sc.nextLong();

        System.out.print("Quantos litros tem dentro do tanque de combustivel: ");
        float tanque = sc.nextFloat();

        float consMedio = distancia / tanque;

        System.out.println("O consumo médio do automóvel é de: " + consMedio + "km/lt");

    }
}
