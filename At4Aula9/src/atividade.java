import java.util.Scanner;

public class atividade{
    public static void main(String[] args) {
            
                Scanner sc = new Scanner(System.in);
                
                double a = 0;
                double b = 0;
                double c = 0;

                System.out.println("Digite o valor de a: ");
                a = sc.nextDouble();

                System.out.println("Digite o valor de b: ");
                b = sc.nextDouble();

                System.out.println("Digite o valor de c: ");
                c = sc.nextDouble();

                System.out.printf("(%.2f * %.2f) %d * %.2f * %.2f \n", b, b, (-4), a, c);
                
                System.out.printf("%.2f %.2f * %.2f \n", (b * b), ((-4) * a), c);
                
                System.out.printf("%.2f %.2f \n", (b * b), (((-4) * a) * c));
                
                System.out.printf("%.2f \n", ((b * b) + (((-4) * a) * c)));

                System.out.println("-------------------------------------------------------");

                double delta = ((b * b) + (((-4) * a) * c));

                //cabeçalho
                System.out.printf("x = %.2f +/- %.2f // %d . %.2f \n", (-b), Math.sqrt(delta), 2 , a);
                
                System.out.printf("x1 = %.2f + %.2f / %.2f \n", (-b), Math.sqrt(delta),( 2 * a));
                
                System.out.printf("x1 = %.2f / %.2f \n", ((-b) + Math.sqrt(delta)),( 2 * a));
                
                System.out.printf("x1 = %.2f \n", (((-b) + Math.sqrt(delta)) / ( 2 * a)));

                System.out.printf("x2 = %.2f + %.2f / %.2f \n", (-b), (-Math.sqrt(delta)),( 2 * a));
                
                System.out.printf("x2 = %.2f / %.2f \n", ((-b) + (-Math.sqrt(delta))),( 2 * a));
                
                System.out.printf("x2 = %.2f \n", (((-b) + (-Math.sqrt(delta))) / ( 2 * a)));

                sc.close();
    }
}

// ajudinha.com
//Math.sqrt(numro); rais
//Math.pow(numero, 2); potencia