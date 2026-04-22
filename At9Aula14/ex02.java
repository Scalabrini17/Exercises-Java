import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Para iniciar o programa de notas digite S: ");
        String inicio = sc.next().toUpperCase();

        double somaNota = 0;
        int contador  = 0;
        
        System.out.println("AVISO: Se em algum mmento quiser sair do programa digite (0)! ");

        while (inicio.equalsIgnoreCase("S")) {

            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();

            if(nota <= 0){
                System.out.println("Você não digitou nenhum número!");
                System.out.println("Se quiser sair do programa digite S se quiser continuar digite C: ");
                String sair = sc.next().toUpperCase();

                if(sair.equalsIgnoreCase("S")) {
                System.out.println("Fim do programa. Calculando a média das notas...");
                break;
            }

            }

            somaNota += nota;
            contador++;

        }
         double mediaNota = somaNota / contador;

        System.out.printf("nota: %.2f \n", mediaNota);

    }
}