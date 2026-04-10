
//Imposto de Renda 
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double aliquota = 0;
        double deducao = 0;

        System.out.print("Digite o valor do seu sálario: ");
        double salario = sc.nextDouble();

        if ( salario <= 2259.20){
            aliquota += 0;
            deducao += 0;
            
        }else if ( salario >= 2259.21 && salario <= 2826.65){
            aliquota += 7.5;
            deducao += 169.44;

        }else if ( salario >= 2826.66 && salario <= 3751.05){
            aliquota += 15;
            deducao += 381.44;

        }else if ( salario >= 3751.06 && salario <= 4664.68){
            aliquota += 22.5;
            deducao += 662.77;

        }else if ( salario > 4664.68){
            aliquota += 27.5;
            deducao += 896;
        }

        double valorFinal = (salario * (aliquota / 100)) - deducao;

        System.out.printf("O seu imposto de renda basiado no seu salario bruto é de: %.2f", valorFinal);

    }
}
