import java.util.Scanner;

public class Ex_4{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int num5 = 0;
            int num6 = 0;
           
            System.out.printf("Digite o primeiro número da equção %d(x + %d) = %d(%d + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num1 = sc.nextInt();
           
            System.out.printf("Digite o segundo número da equção %d(x + %d) = %d(%d + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num2 = sc.nextInt();
           
            System.out.printf("Digite o terceiro número da equção %d(x + %d) = %d(%d + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num3 = sc.nextInt();
           
            System.out.printf("Digite o quarto número da equção %d(x + %d) = %d(%d + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num4 = sc.nextInt();
           
            System.out.printf("Digite o quinto número da equção %d(x + %d) = %d(%d + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num5 = sc.nextInt();
           
            System.out.printf("Digite o sexto número da equção %d(x + %d) = %d(%d + %d) + %d: ", num1, num2, num3, num4, num5, num6);
            num6 = sc.nextInt();

            System.out.println("Equação: ");
            
            System.out.printf("%d(x + %d) = %d(%d + %d) + %d: \n", num1, num2, num3, num4, -num5, num6);
            
            System.out.printf("%dx + %d = %dx + %d + %d: \n", num1, (num1 * num2),(num3 * num4),(num3 *(-num5)), num6);
            
            System.out.printf("%dx - %d = %dx + %d: \n", num1, (num1 * num2),(num3 * num4),((num3 *(-num5)) + num6));
            
            System.out.printf("%dx = %d: \n", (num1 - (num3 * num4)), ((-(num1 * num2)) + ((num3 *(-num5)) + num6)));
            
            System.out.printf("x = %d: \n",((-(num1 * num2)) + ((num3 *(-num5)) + num6)));

        }catch(Exception e){
            System.out.println("ERRO");
        }

    }
}