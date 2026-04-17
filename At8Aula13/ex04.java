import java.util.Scanner;

public class ex04 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float saldInit = 500000.00f;
        float saldFin = 0;
        // Condição do Caixa Eletronoco
        while (true){
            System.out.printf("Seu saldo é de R$ %.2f \n", saldInit);
            System.out.print("Digite o valor que você deseja sacar (se quiser sair digite 0): ");
            float valsac = sc.nextFloat();

            //Condições para o break
            if (valsac <= 0){
                break;
            }else if (saldInit <= 0){
                System.out.println("O valor do seu saldo é insulficiente");
                break;
            }

            if (valsac <= saldInit){
                saldInit -= valsac;
                saldFin += valsac;
            }
            
        }

        

        System.out.printf("Valor disponivel para sac: R$%.2f \n", saldInit);
        System.out.printf("O valor sacado até agora foi de: R$%.2f \n", saldFin);

    }
}
