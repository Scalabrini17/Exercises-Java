import java.util.Scanner;

public class SGNAC {

    public static Scanner sc = new Scanner(System.in);

    // Dados
    public static double[] notas = new double[4];
    public static double somaNotas = 0;
    public static double mediaNotas = 0;
    public static String nome = "";
    public static String situacao = "";

    public static void main(String[] args){

        System.out.println("Bem vindo ao Sistema de Gerenciamento de Notas Academicas!");
        System.out.println("Vamos iniciar!");
        lernotas();
        calcularMedia();
        determinarSituacao();
        exibirRelaatorio();
    }

    public static void lernotas(){

        System.out.print("Digite o nome do aluno: ");
        nome = sc.next();

        System.out.printf("Insira as 4 notas do aluno %s \n", nome);
        for(int i = 0; i < 4; i++){
            System.out.printf("Insira a %dº nota: ", i);
            notas[i] = sc.nextDouble();
        }

    }

    public static void calcularMedia(){

        for(int i = 0; i < 4; i++){
            if(notas[i] != 0){
                notas[i] += somaNotas;
            }
        }

        mediaNotas += (somaNotas / notas.length);

    }

    public static void determinarSituacao(){

        if(mediaNotas >= 7){
            situacao += "APROVADO!";

        }else if(mediaNotas >= 4 && mediaNotas <= 6.9){
            situacao += "EM RECUPERAÇÃO!";

        }else if(mediaNotas < 4){
            situacao += "REPROVADO!";
        }

    }

    public static void exibirRelaatorio(){

        System.out.println("===== Relatório Final =====");
        System.out.printf("Nome do aluno: %s \n",nome);
        System.out.printf("Notas: %.2f %.2f %.2f %.2f \n", notas[0], notas[1], notas[2], notas[3]);
        System.out.printf("Média das notas: %.2f \n", mediaNotas);
        System.out.printf("Situação: %s \n", situacao);
        System.out.print("===========================");


    }

}
