import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sistema de visualização de números! \n");

        int numMaior = 0;
        int numMenor = 0;
        int numBig = 0;

        for (int i = 1; i <= 20; i++){
            System.out.printf("Digite o %dº número: \n", i);
            int num = sc.nextInt();

            if (num <= 100){
                numMenor++;
            }else if (num >= 101 & num <= 200) {
                numMaior++;
            }else if (num >= 201){
                numBig++;
            }
        }

        System.out.printf("A quantidade de números a cima de 201 é de: %d e de 101 a 200 são: %d números e tem %d números a baixo de 100 \n", numBig, numMaior, numMenor);

    }
}