//5. Calcular o salário mensal com base nas horas trabalhadas.
import java.util.Scanner;

public class Unidade_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário mensal: R$");
        float salario = sc.nextFloat();

        System.out.println("Digite quantas horas por dia essa pessoa trabalha");
        System.out.print("Horas: ");
        int hora = sc.nextInt();
        
        System.out.print("Digite quantos dias a pessoa trabalhou no mês: ");
        int diasTrabalhado = sc.nextInt();

        float valorPorHora =  hora * diasTrabalhado;

        float valorFinal =  salario / valorPorHora;

        System.out.println("Essa pessoa ganha R$" + valorFinal + "por hora trabalhada.\n "
        + "E o salário dessa pessoa é: R$" + salario);

    }
}