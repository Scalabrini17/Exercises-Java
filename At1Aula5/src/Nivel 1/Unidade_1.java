//1. Calcular o valor do troco.
import java.util.Scanner;

public class Unidade_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite o valor da compra: ");
        int compra = sc.nextInt();

        System.out.print("Digite o valor pago pela compra: ");
        int valorPago = sc.nextInt();

        int  valorTotal = compra - valorPago;

        System.out.println("O valor total pago é R$" + valorTotal);

    }
}
