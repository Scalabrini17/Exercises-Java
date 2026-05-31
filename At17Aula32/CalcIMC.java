
import java.util.Scanner;

public class CalcIMC {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Programa de calculo IMC");
        recebendoPesoAltura();
        clasificaIMC();
    }

    //dados recebidos
    static double peso = 0;
    static double altura = 0;

    //resultado do IMC
    static double resultadoIMC = 0;

    public static void recebendoPesoAltura(){
        System.out.print("Digite seu peso (em Kg)");
        double recebePeso = sc.nextDouble();
        peso += recebePeso;

        System.out.print("Digite sua Altura: (em metros)");
        double recebeAltura = sc.nextDouble();
        altura += recebeAltura;

        resultadoIMC = peso / (altura * altura);

    }

    public static void clasificaIMC(){

        if(resultadoIMC >= 18.5 && resultadoIMC <= 24.9){
            System.out.printf("Seu IMC é: %.2f, e sua classificação é: NORMAL", resultadoIMC);

        }else if(resultadoIMC >= 25 && resultadoIMC <= 29.9){
            System.out.printf("Seu IMC é: %.2f, e sua classificação é: SOBREPESO", resultadoIMC);

        }else if(resultadoIMC >= 30 && resultadoIMC <= 39.9){
            System.out.printf("Seu IMC é: %.2f, e sua classificação é: OBESIDADE ", resultadoIMC);

        }else if(resultadoIMC >= 40){
            System.out.printf("Seu IMC é: %.2f, e sua classificação é: OBESIDADE GRAVE ", resultadoIMC);
        }

    }

}
