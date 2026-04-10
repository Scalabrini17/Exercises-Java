import java.util.Scanner;

public class Ex_6{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int num5 = 0;
            int num6 = 0;
           
            System.out.printf("Digite o primeiro número da equção %d(%d - x) = %d(%d - x) %d: ", num1, num2, num3, num4, num5, num6);
            num1 = sc.nextInt();
           
            System.out.printf("Digite o segundo número da equção %d(%d - x) = %d(%d - x) %d: ", num1, num2, num3, num4, num5, num6);
            num2 = sc.nextInt();
           
            System.out.printf("Digite o terceiro número da equção %d(%d - x) = %d(%d - x) %d: ", num1, num2, num3, num4, num5, num6);
            num3 = sc.nextInt();
           
            System.out.printf("Digite o quarto número da equção %d(%d - x) = %d(%d - x) %d: ", num1, num2, num3, num4, num5, num6);
            num4 = sc.nextInt();
           
            System.out.printf("Digite o quinto número da equção %d(%d - x) = %d(%d - x) %d: ", num1, num2, num3, num4, num5, num6);
            num5 = sc.nextInt();

            System.out.println("Equação: ");
            
            System.out.printf("%d(%d - x) = %d(%d - x) %d: \n", num1, num2, num3, num4, (-num5));
            
            System.out.printf("%d  %dx = %d %dx %d: \n", (num1 * num2),(-num1) , (num3 * num4), (-num3), (-num5));
            
            System.out.printf("%d  %d  + %d = %dx %dx: \n", (num1 * num2), (-(num3 * num4)), (num5),(num1) , (-num3));
            
            System.out.printf("%d = %dx: \n", (((num1 * num2) + (-(num3 * num4))) + (num5)),((num1) + (-num3)));
            
            System.out.printf("x = %d / %d: \n", (-(((num1 * num2) + (-(num3 * num4))) + (num5))),(-((num1) + (-num3))));
           
            System.out.printf("x = %d: \n", ((-(((num1 * num2) + (-(num3 * num4))) + (num5))) / (-((num1) + (-num3)))));

        }catch(Exception e){
            System.out.println("ERRO");
        }

    }
}