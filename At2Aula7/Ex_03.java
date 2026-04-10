import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Digite o raio da base do Cilíndrico: ");
        double raio = sc.nextFloat();

        System.out.print("Digite a altura do Cilíndrico: ");
        double altura = sc.nextFloat();

        double raioElevado2 = raio * raio;

        double calculo1 = pi * raioElevado2;

        double volume = calculo1 * altura;
        
        System.out.print("O rasultado desse calculo é: Volume = " + volume);
        
    }
}
