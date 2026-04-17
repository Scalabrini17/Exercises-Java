import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número para acontagem regreciva:");
        int num = sc.nextInt();

        System.out.println("Embarque iniciado!");

        for(int i = num; i >= 1; i--){
            System.out.println(i);

            try{
                TimeUnit.SECONDS.sleep(2);
            }
            catch (Exception e){
                System.out.printf("Ouve um erro no seu código: %s", e);
            }
            
            
        }
        if (num == 0){
            System.out.println("O número que você digitou é invalido!");
        }
    }
}