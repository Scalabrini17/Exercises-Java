//7. Escolha de Bebida

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha a sua Bebida \n"+
        "Agua \n"+
        "Suco \n"+
        "Refrigerante \n"+
        "Digite qual bebida você deseja: ");
        String bebida = sc.nextLine().toUpperCase();

        switch (bebida){
            
            case "AGUA" -> System.out.print("Você escolheu a água. Seu pedido foi confirmado!");
            
            case "SUCO" -> System.out.print("Você escolheu a suco. Seu pedido foi confirmado!");
            
            case "REFRIGERANTE" -> System.out.print("Você escolheu a refrigerate. Seu pedido foi confirmado!");

        }

    }
}
