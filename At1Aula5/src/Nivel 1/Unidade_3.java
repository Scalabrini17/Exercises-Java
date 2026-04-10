//3. Calcular o perímetro de um terreno retangular.
import java.util.Scanner;

public class Unidade_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o cumprimento da área retangular: ");
        double cumpriArea = sc.nextDouble();

        System.out.print("Digite a largura da área retangular: ");
        double largArea = sc.nextDouble();

        double somaCumpLarg = cumpriArea + largArea;

        double perimetro = somaCumpLarg * 2;

        System.out.println("O Perímetro da área é: " + perimetro);

    }
}
