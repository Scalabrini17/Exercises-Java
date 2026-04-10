import java.util.Scanner;

public class Ex_9{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            int num5 = 0;
            int num6 = 0;
            int num7 = 0;
           
            System.out.printf("Digite o primeiro número da equção %d(%dy  %d) %d(%d %dy) = %d: ", num1, num2, num3, num4, num5, num6, num7);
            num1 = sc.nextInt();
           
            System.out.printf("Digite o segundo número da equção %d(%dy  %d) %d(%d %dy) = %d: ", num1, num2, num3, num4, num5, num6, num7);
            num2 = sc.nextInt();
           
            System.out.printf("Digite o terceiro número da equção %d(%dy  %d) %d(%d %dy) = %d: ", num1, num2, num3, num4, num5, num6, num7);
            num3 = sc.nextInt();
           
            System.out.printf("Digite o quarto número da equção %d(%dy  %d) %d(%d %dy) = %d: ", num1, num2, num3, num4, num5, num6, num7);
            num4 = sc.nextInt();
           
            System.out.printf("Digite o quinto número da equção %d(%dy  %d) %d(%d %dy) = %d: ", num1, num2, num3, num4, num5, num6, num7);
            num5 = sc.nextInt();
           
            System.out.printf("Digite o sexto número da equção %d(%dy  %d) %d(%d %dy) = %d: ", num1, num2, num3, num4, num5, num6, num7);
            num6 = sc.nextInt();
            
            System.out.printf("Digite o sexto número da equção %d(%dy  %d) %d(%d %dy) = %d: ", num1, num2, num3, num4, num5, num6, num7);
            num7 = sc.nextInt();

            System.out.println("Equação: ");
            
            System.out.printf("%d(%dy  %d) %d(%d %dy) = %d: \n", num1, num2, (-num3), (-num4), num5, (-num6), num7);
            
            System.out.printf("%dy  %d %d + %dy = %d: \n", (num1 * num2),(num1 * (-num3)),((-num4) * num5),((-num4) * (-num6)), num7);
            
            System.out.printf("%dy + %dy = %d + %d + %d: \n", (num1 * num2),((-num4) * (-num6)), num7 ,(num1 * num3), (num4 * num5));
            
            System.out.printf("%dy = %d: \n", ((num1 * num2) + ((-num4) * (-num6))), ((num7 + (num1 * num3)) + (num4 * num5)));
            
            System.out.printf("y = %d / %d: \n", ((num7 + (num1 * num3)) + (num4 * num5)), ((num1 * num2) + ((-num4) * (-num6))));
            

        }catch(Exception e){
            System.out.println("ERRO");
        }

    }
}