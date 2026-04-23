import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sistema de visualização de números impares e pares \n");

        int numpar = 0;
        int numimpar = 0;

        for (int i = 1; i <= 20; i++){
            System.out.printf("Digite o %dº número: \n", i);
            int num = sc.nextInt();

            if (num % 2 == 0){
                numpar++;
            }else{
                numimpar++;
            }
        }

        System.out.printf("A quantidade de números pares são: %d números e tem %d números ímpares \n", numpar, numimpar);

    }
}
