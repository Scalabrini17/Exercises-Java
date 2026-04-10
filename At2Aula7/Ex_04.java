import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Digite o raio do circulo: ");
        double raio = sc.nextDouble();

        double raioElev2 = raio * raio; 

        double area = pi * raioElev2;

        System.out.println("A área do circulo é: " + area);

    }
}
