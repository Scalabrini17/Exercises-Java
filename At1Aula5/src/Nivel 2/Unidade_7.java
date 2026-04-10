//7. Calcular o valor de uma prestação com juros simples.

import java.util.Scanner;

public class Unidade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da prestação: R$ ");
        Float valPres = sc.nextFloat();

        System.out.print("Digite o valor dos Juros: R$ ");
        Float valJuros = sc.nextFloat();

        System.out.print("O tempo que a prestação está vencida é em dias ou meses? (digite o {d} para dia e {m} para mÊs): ");
        String mesoudia = sc.next();

        if (mesoudia.equalsIgnoreCase("d")){
             System.out.print("Digite o tempo em dias que a prestação está vencida: ");
            int diasVenc = sc.nextInt();

            float diasJuros = valJuros * diasVenc;
            float valorFinalJurosd = diasJuros + valPres;
            //Resposta final do if
            System.out.print("Sua prestação atualmente está com o valor de: R$ " + valorFinalJurosd);

        } else{
             System.out.print("Digite o tempo em meses que a prestação está vencida: ");
            int  mesesVenc = sc.nextInt();

            float mesviradia = mesesVenc / 30;
            float mesJuros = valJuros * mesviradia;
            float valorFinalJurosm = mesJuros + valPres;
            System.out.print("Sua prestação atuamente está com o valor de: R$ " + valorFinalJurosm);
        }

    }
}
