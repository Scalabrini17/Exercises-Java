
//Controle de estoque 
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Produto: ");
        String prod = sc.next();

        System.out.print("Qual a quantidade de "+prod+" que tem no estoque: ");
        float quant = sc.nextFloat();

        if (quant > 100){
            System.out.println("O produto "+prod+" tem a quantidade em estoque equivalente a "+quant+" e ele está SUFICIENTE!");
        }else if (quant>= 50 && quant <= 100){
            System.out.println("O produto "+prod+" tem a quantidade em estoque equivalente a "+quant+" e ele está EM ALERTA!");
        }else if (quant < 50 ){
            System.out.println("O produto "+prod+" tem a quantidade em estoque equivalente a "+quant+" e ele está ABAIXO DO IDEAL!");
        }

    }
}
