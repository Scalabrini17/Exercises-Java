import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pesquisaa demografica, informe a idade de 20 pessoas diferentes\n");
        
        int maiorIdade = 0;
        int menorIdade = 0;

        for (int i = 1; i <= 20; i++){
            System.out.print("Digite a idade da "+i +"º pessoa: ");
            int idade = sc.nextInt();

            if (idade >= 18){
                maiorIdade++;

            }else if (idade <= 18){
                menorIdade++;
            }

        }

        System.out.printf("Nessa pesquisa foram contadas: %d pessoas maior de idade e %d menor de idade \n", maiorIdade, menorIdade);

    }
}