import java.util.Scanner;


public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Recebendo dados
        System.out.print("Digite a quantidade de termos: ");
        int num = sc.nextInt();

        //Função de repetição de segurança e resposta para o N termos iniciais do Fibonacci
        if (num <= 0) {
            System.out.println("Digite um número inteiro positivo.");
        } else {
            System.out.printf("Os %d primeiros termos da sequência de Fibonacci são: ", num);

            long termo1 = 0;
            long termo2 = 1;

            for (int i = 1; i <= num; i++) {

                System.out.print(termo1 + " ");

                long proximoTermo = termo1 + termo2;
                termo1 = termo2;
                termo2 = proximoTermo;
            }

            System.out.println();
        }

    }

}