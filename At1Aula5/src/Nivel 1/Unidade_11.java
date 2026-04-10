//11.Converter horas para minutos.
import java.util.Scanner;

public class Unidade_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora para trsnformar em minuto: ");
        int hora = sc.nextInt();

        System.out.print("Digite os minutos: ");
        int min = sc.nextInt();

        int horaEmMin = hora * 60;
        
        int horamin = horaEmMin + min;

        System.out.println("As horas transformadas em minutos é: " + horamin);


    }
}
