
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println(" Infração de Álcool ao volante ");

                    System.out.printf(" Digite o mg/l que deu o teste do motorista : ");
                    double testeBaf = sc.nextDouble();
                    System.out.print("O motorista se recusou a fazer o teste? Digite (1) se SIM e (2) se não ");
                    int recusa = sc.nextInt();

                    String situacao = "";
                    int sitRecusa = 0;
                    int crime = 0;

                    if (testeBaf <= 0.04){
                        situacao = "Situação Regular";
                        

                    }else if (testeBaf >= 0.05 && testeBaf <= 0.33){
                        situacao = " Infração Gravíssima";
                         

                    }else if (testeBaf > 0.34){
                        situacao = "Crime de Trânsito";
                        
                        crime++;
                    
                    }else if (recusa == 1 ){
                        situacao = "Infração Gravíssima";
                        sitRecusa++;
                       
                    }
                    System.out.printf("O motorista %s foi multado no seu veiculo de placa %s por Excesso de velocidade:\n" +
                    "Tipo de infração: %s \n" +
                    "levou pontos 7 na carteira \n" +
                    "Suspensão do direito de dirigir \n" +
                    "valor da multa é de R$ 2.934,70 \n%s",
                    situacao, 
                    (crime >= 1 ? "Crime: Encaminhamento legal\n" : ""),
                    (sitRecusa >= 1 ? "O condutor se resusou a fazer o teste!":""));
    }
}