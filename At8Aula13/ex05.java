import java.util.Scanner;

public class ex05 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número de 1 a 100 para adivinhar qual eu escolhi!: ");
            double numesc = sc.nextDouble();

            //Gerador de número aleatório de 1 a 100
            double numale = Math.random();
            //Trasformando o número em inteiro
            int numalecom = (int) (numale * 10);

            System.out.printf("num ale com %d \n", numalecom);
            // Condição para a repetição até acerto!
            while (numesc != numale){
                System.out.println("Você errou!");
                System.out.print("Tente novamente, digite outro número: ");
                double novatent = sc.nextDouble();

                numesc = novatent;

                //Condições para instrução se o número é maior, menor ou acerto e break
                if (numesc > numalecom){
                    System.out.print("O número que vocÊ digitou é maior que o número aleatório");

                }else if (numesc < numalecom){
                    System.out.print("O número que vocÊ digitou é menor que o número aleatório");

                }else if (numesc == numalecom){
                    System.out.printf("Parabéns!! Você acertou o Número Secreto que é: %d. \n", numalecom);
                    break;
                }
                
            }

    }
}
