//5. Calcular o quadrado de um número.
import java.util.Scanner;

public class Unidade_5 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int num = sc.nextInt();

        int quadrado = num * num;

        System.out.println("O qadrado do número digitado é: " + quadrado);

    } 
}
