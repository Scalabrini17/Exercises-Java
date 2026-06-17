import java.util.Scanner;

public class SGNAC {

    public static Scanner sc = new Scanner(System.in);

    // Dados
    public static double[] notas = new double[5];
    public static double somaNotas = 0;
    public static double mediaNotas = 0;
    public static String nome = "";
    public static String situacao = "";

    public static void main(String[] args){

        System.out.println("Bem vindo ao Sistema de Gerenciamento de Notas Academicas!");
        System.out.println("Vamos iniciar!");
         System.out.println();
        NomeAluno();
        lernotas(); 
        calcularMedia();
        determinarSituacao();
        exibirRelaatorio();
    
    }

    static void NomeAluno(){

        System.out.print("Digite o nome do aluno: ");
        nome = sc.next();
        System.out.println();

    }

    static void lernotas(){

       for(int i = 1; i < notas.length; i++){
        System.out.printf("Digite a %dº nota: ", i);
        notas[i] = sc.nextDouble();
       }

    }

    public static void calcularMedia(){

        for(int i = 1; i < notas.length; i++){
             somaNotas += notas[i];
        }

        mediaNotas = somaNotas / 4;

    }

    public static void determinarSituacao(){

        if(mediaNotas >= 7){
            situacao = "APROVADO!";

        }else if(mediaNotas >= 4 && mediaNotas <= 6.9){
            situacao = "EM RECUPERAÇÃO!";

        }else if(mediaNotas < 4){
            situacao = "REPROVADO!";
        }

    }

    public static void exibirRelaatorio(){
        System.out.println();
        System.out.println("===== Relatório Final =====");
        System.out.printf("Nome do aluno: %s \n",nome);
        System.out.printf("Notas: %.1f %.1f %.1f %.1f \n", notas[1], notas[2], notas[3], notas[4]);
        System.out.printf("Média das notas: %.1f \n", mediaNotas);
        System.out.printf("Situação: %s \n", situacao);
        System.out.print("===========================");
        

    }

}
