//9. Sistema de Transporte

import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha uma das opções de Transporte\n"+
        "Onibus\n"+
        "Metro\n"+
        "Uber\n"+
        "Digite a sua escolha (digite sem assento por gentileza): ");
        String transporte = sc.nextLine().toUpperCase();

        switch (transporte) {

            case "ONIBUS" ->  System.out.println("O trasporte que você escolheu é o Ônibus e ele tem o tempo médio de 40 minutos");
           
            case "METRO" ->  System.out.println("O trasporte que você escolheu é o Metro e ele tem o tempo médio de 25 minutos");
           
            case "UBER" ->  System.out.println("O trasporte que você escolheu é o Uber e ele tem o tempo médio de 30 minutos");

        }

    }
}
