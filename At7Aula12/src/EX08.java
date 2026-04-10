//8. Operação Matemática Simples

import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = sc.nextFloat();
        
        System.out.print("Digite o segundo número: ");
        float num2 = sc.nextFloat();

        System.out.println("Escolha a operação matemática \n"+
        "+ Adição \n"+
        "- Subtração \n"+
        "* Multiplicação \n"+
        "/ Divisão \n"+
        "Digite a operação desejada: ");
        String opera = sc.nextLine().toUpperCase();

        switch (opera) {

            case "+" -> System.out.printf("O resultado é: %f", (num1 + num2));
            
            case "-" -> System.out.printf("O resultado é: %f", (num1 - num2));
            
            case "*" -> System.out.printf("O resultado é: %f", (num1 * num2));
            
            case "/" -> System.out.printf("O resultado é: %f", (num1 / num2));

        }

    }
}
