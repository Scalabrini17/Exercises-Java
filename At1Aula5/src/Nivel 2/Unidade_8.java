//8. Calcular o valor total pago em uma compra parcelada.

import java.util.Scanner;

public class Unidade_8 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Digite o valor da parcela: R$ ");
      float valparc = sc.nextFloat();

      System.out.print("Digite a quantidade de parcelas: ");
      int quantparc = sc.nextInt();

      float valorTotal = valparc * quantparc;

      System.out.println("O valor total pago da compra percelada foi: R$ " + valorTotal);
  }  
}