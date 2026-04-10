import java.util.Scanner;

public class Ex_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int num5 = 0;
           
            System.out.printf("Digite o primeiro número da equção %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num1 = sc.nextInt();
           
            System.out.printf("Digite o segundo número da equção %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num2 = sc.nextInt();
           
            System.out.printf("Digite o terceiro número da equção %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num3 = sc.nextInt();
           
            System.out.printf("Digite o quarto número da equção %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num4 = sc.nextInt();
           
            System.out.printf("Digite o quinto número da equção %d(%d - x) = -%d(x + %d) + %d: ", num1, num2, num3, num4, num5);
            num5 = sc.nextInt();
           
            System.out.println("Equação: ");

            System.out.printf(" %d(%d - x) = -%d(x + %d) + %d: \n", num1, num2, num3, num4, num5);
            
            System.out.printf(" %d -%dx = -%dx -%d + %d: \n", (num1 * num2), num1, num3,(num3 * num4), num5);
            
            System.out.printf(" %d -%dx = -%dx -%d: \n", (num1 * num2), num1, num3,((num3 * num4) - num5));
            
            System.out.printf(" %d = +%dx -%dx -%d: \n", (num1 * num2), num1, num3,((num3 * num4) - num5));
            
            System.out.printf(" %d = %dx -%d: \n", (num1 * num2), (num1 - num3),((num3 * num4) - num5));
            
            System.out.printf(" %dx = -%d -%d: \n", (num3 - num1), (num1 * num2), ((num3 * num4) - num5));
            
            System.out.printf(" x = -%d: \n", ((num1 * num2) - (num5 - (num3 * num4))));
            
    }
}