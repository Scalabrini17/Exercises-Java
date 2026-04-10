//3. Turno escolar

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo dados
        System.out.print("Digite o código (M, V ou N): ");
        String turno = sc.nextLine().toUpperCase();

        switch (turno) {
            case "M" -> System.out.println("Turno MATUTINO");
            
            case "V" -> System.out.println("Turno VESPERTINO");
            
            case "N" -> System.out.println("Turno NOTURNO");

        }

    }
}
