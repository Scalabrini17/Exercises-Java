import java.util.Scanner;

public class Unidade_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qunatos inimigos você derrotou? ");
        int derrotas = sc.nextInt();

        // pontos!
        //Cada inimigo derrotado são 2 pontos
        int pontoderrota = 2;
        
        int pontosFinais = derrotas * pontoderrota;

        // Resposta final
        System.out.printf("Você fez %d pontos na partida derrotando %d inimigos", pontosFinais , derrotas);

    }
}
