import java.util.Scanner;

public class ex03 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float soma = 0;

        for (int i = 1; i <= 7; i++){
            System.out.printf("Digite a %dº venda: ", i);
            float num = sc.nextFloat(); 
            soma += num;
        }

        float media = soma / 7;

        System.out.printf("A soma entre as sete vendas da semana é: R$%.2f\n", soma);

        System.out.printf("A média entre as sete vendas da semana é: R$%.2f\n", media);
    }
}
