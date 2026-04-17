import java.util.Scanner;

public class ex02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada dele: ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++){
            int tabuada = num * i;
            System.out.printf("%d x %d = %d \n", num, i, tabuada);
            
            
        }

    }
}
