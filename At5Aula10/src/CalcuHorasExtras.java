import java.util.Scanner;

public class CalcuHorasExtras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as horas trabalhadas da semana: ");
        float horasTraba = sc.nextFloat();

        System.out.print("Digite o valor que o funcionario recebe por hora: ");
        float valorRecebeHora = sc.nextFloat();

        System.out.print("Digite o limite do horas semanais estabelecidas pela empresa: ");
        float horasEstaEmpresa = sc.nextFloat();

        float salario = horasEstaEmpresa * valorRecebeHora ; 

        float horasExtra = horasTraba - horasEstaEmpresa;

        double valorHoraExtra = horasExtra * 7.50 ;

        if (horasExtra > 0){

            System.out.printf("O valor total que o funcionário irá reecber é: R$ %.2f ", (salario + valorHoraExtra));

        }else if (horasExtra == 0){
            System.out.println("O funcionario não teve horas excedentes!");

            System.out.printf("O valor total que o funcionário irá reecber é: R$ %.2f ", salario);
        }

    }
}
