//6. Dia da Semana

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dias da semana \n"+
        "1: Segunda \n"+
        "2: Terça \n"+
        "3: Quarta \n"+
        "4: Quinta \n"+
        "5: Sexta \n"+
        "6: Sábado \n"+
        "7: Domingo \n"+
        "Digite o número referente ao dia que você deseja: ");
        int diaSemana = sc.nextInt();

        switch (diaSemana){

            case 1 -> System.out.println("Hoje é Segunda");
            
            case 2 -> System.out.println("Hoje é Terça");
            
            case 3 -> System.out.println("Hoje é Quarta");
            
            case 4 -> System.out.println("Hoje é Quinta");
            
            case 5 -> System.out.println("Hoje é Sexta");
            
            case 6 -> System.out.println("Hoje é Sábado");
            
            case 7 -> System.out.println("Hoje é Domingo");

        }

    }
}
