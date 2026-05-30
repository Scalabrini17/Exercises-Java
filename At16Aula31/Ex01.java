package At16Aula31;

import java.util.Scanner;

public class Ex01 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        calcularMedia();
        situacao();

    }

    //Atividade 1
    public static void saudacao(){
        System.out.print("Digite o seu nome: ");
        String nome = sc.next().toUpperCase();

        System.out.printf("Olá, %s! Bem-vindo(a)", nome);
    }

    //Atividade 2
    public static void somarDois(){

        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();                                                                                                                                                            

        System.out.print("Digite mais um número inteiro: ");
        int num2 = sc.nextInt();

        int soma1 = num1 + num2;

        System.out.printf("O valor da soma é: %d ", soma1);
    }

    // Atividade 3
    public static void imprimirLinha(){

        for(int i = 0; i <= 40; i++) {
            System.out.print("-");
        }
    }

    //Atividade 4
    public static void ehPar() {
        System.out.print("Digite um número inteiro para a verificação: ");
        int num1 = sc.nextInt();

        if(num1 % 2 == 0){
            System.out.printf("O número: %d é par", num1);
        }else{
            System.out.printf("O número: %d é impar", num1);
        }
    }

    //Atividade 5
    public static void maiusculo(){

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next().toUpperCase();

        System.out.printf("A palavra que você digitou em maiusculo é: %s", palavra);
    }

    //Atividade 6
    public static void classificarNota(){
        System.out.print("Digite uma nota: ");
        double nota = sc.nextDouble();

        if(nota >= 9 ){
            System.out.printf("Sua nota é: %.2f e foi Exelente", nota);
        }else if(nota >= 7){
            System.out.printf("Sua nota é: %.2f e foi Aprovado", nota);
        }else if(nota >= 5){
            System.out.printf("Sua nota é: %.2f e foi Recuperação", nota);
        }else if(nota < 5){
            System.out.printf("Sua nota é: %.2f e foi Reprovado", nota);
        }
    }

    //Atividade 7
    public static void tabuada(){

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.printf(" %d x %d = %d \n", num, i, (num * i) );
        }

    }

    static double soma = 0;
    static double media = soma / 3;

    //Aividade 8
    public static void calcularMedia(){


        for(int i = 1; i < 4; i++){
            System.out.printf("Digite o %dº número: ", i);
            double entradaSoma = sc.nextDouble();

            soma += entradaSoma;
        }

    }
    public static void situacao(){

        if(media >= 6){
            System.out.printf("Sua nota foi: %d e você está: Aprovado", media);
        }else if(media < 6){
            System.out.printf("Sua nota foi: %d e você está: Reprovado", media);
        }
    }

}
