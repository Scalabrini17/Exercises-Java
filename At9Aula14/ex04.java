import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // apresentação
        System.out.println("Tabuada das operações matemáticas!");

        // escolhendo o número
        System.out.print("Digite o número que você deseja ver a tabuada: ");
        int numEscolhido = sc.nextInt();

        // escolha da operação
        System.out.print("Agora escolha a operação matemática: \n"+
            "1. adição + \n"+
            "2. subtração - \n"+
            "3. multiplicação * \n"+
            "4. divisão / \n"+
            "Digite o número da operação que você deseja: ");
            int opcao = sc.nextInt();
        
        switch (opcao){
            case 1 -> { 
                for (int i = 1; i <= 10; i++){ int soma = numEscolhido + i; 
                    System.out.printf("%d + %d = %d \n", numEscolhido, i, soma);
                }
            }
            case 2 -> { 
                for (int i = 1; i <= 10; i++){ int subtracao = numEscolhido - i; 
                    System.out.printf("%d - %d = %d \n", numEscolhido, i, subtracao);
                }
            }
            case 3 -> { 
                for (int i = 1; i <= 10; i++){ int multiplicacao = numEscolhido * i; 
                    System.out.printf("%d x %d = %d \n", numEscolhido, i, multiplicacao);
                }
            }
            case 4 -> { 
                for (int i = 1; i <= 10; i++){ int divisao = numEscolhido / i; 
                    System.out.printf("%d / %d = %d \n", numEscolhido, i, divisao);
                }
            }
        }

    }
}