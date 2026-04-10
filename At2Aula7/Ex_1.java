//1. Resolver uma equação de primeiro grau

import java.util.Scanner;

public class Ex_1{
    public static void main(String[] args) {
      Scanner  sc = new Scanner(System.in);

        System.out.print("DIgite o valor de (a): ");
        float valorA = sc.nextFloat();

        System.out.print("Digite o valor de (b positivo): ");
        float valorB = sc.nextFloat();

        System.out.println("Vamos resolver a equação: " + valorA + "x +" + valorB + "=");

        float calculo1 = -valorB / valorA;

        System.out.print("x = " + calculo1);
    } 
}