
//Pressão Arterial
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String situacao = "";
        // float maior = 0;        

        System.out.print("Indique o PAS (pressão arterial sistólica) do paciente: ");
        float PAS = sc.nextFloat();

        System.out.print("Indique o PAD (pressão arterial diastólica) do paciente: ");
        float PAD = sc.nextFloat();

        // if (PAS > PAD){
        //     maior = PAS;
        // }else if (PAD > PAS){
        //     maior = PAD;
        // }
        
        
        if (PAS < 120 || PAD < 80){
            situacao = "ÓTIMA";

        }else if (PAS >= 120 || PAD >= 80  ){
            situacao = "NORMAL";

        }else if (PAS >= 130 || PAD >= 85 ){
            situacao = "LIMÍTROFE";

        }else if (PAS >= 140 || PAD >= 90 ){
            situacao = "HIPERTENSÃO GRAU 1";

        }else if (PAS >= 160 || PAD >= 100  ){
            situacao = "HIPERTENSÃO GRAU 2";

        }else if (PAS >= 180 || PAD >= 110 ){
            situacao = "HIPERTENSÃO GRAU 3";

        }

        System.out.printf("A pressão arterial do paciente está %s", situacao);

    }
}
