import java.util.Scanner;

public class CalcuDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor produto: ");
        double prod = sc.nextDouble();
        
        System.out.print("Digite o valor percentual do desconto: ");
        double perDesc = sc.nextDouble();

        double desconto = prod * (perDesc / 100);
        double valFinal = prod - desconto;
        
        System.out.printf("O valor do produto com desconto é: %.2f\n", valFinal);

        if (perDesc > 50){
            System.out.println("O desconto é maior que 50%, está muito alto!");
        }

    }
}
