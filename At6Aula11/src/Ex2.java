
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Esse programa irá ler suas informações para saber se está de acordo com os criterios para o Certificado ESG");

        System.out.print("Sua empresa tem lucro positivo? Escreva {true} para (sim) e {false} para (não)");
        boolean lucroPositivo = sc.nextBoolean();
        
        System.out.print("Sua empresa tem programa de saúde ocupacionalativo? Escreva {true} para (sim) e {false} para (não)");
        boolean saudeOcupacional = sc.nextBoolean();
        
        System.out.print("Sua empresa verificar o percentual de redução de emissões de CO2 nos últimos 3 anos? Digite somente o número: ");
        double reducaoCO2 = sc.nextDouble();
        
        System.out.print("Sua empresa possui relatório GRI publicado? Escreva {true} para (sim) e {false} para (não)");
        boolean relatorioGRI = sc.nextBoolean();

        String certificado = "";

        if (lucroPositivo == false && saudeOcupacional == true || saudeOcupacional == false && reducaoCO2 > 0 && relatorioGRI == false){
            certificado = "Certificado Não elegível!";

        }else if (lucroPositivo == true && saudeOcupacional == false && reducaoCO2 > 0 && relatorioGRI == false || relatorioGRI == true){
            certificado = "Certificado Não elegível!";
            
        }else if (lucroPositivo == true && saudeOcupacional == true && reducaoCO2 >= 30 && relatorioGRI == true){
            certificado = "Certificado Verde Ouro!";
            
        }else if (lucroPositivo == true && saudeOcupacional == true && reducaoCO2 >= 30 && relatorioGRI == false){
            certificado = "Certificado Verde Prata!";
            
        }else if (lucroPositivo == true && saudeOcupacional == true && reducaoCO2 >= 10 && reducaoCO2 <= 29 && relatorioGRI == true){
            certificado = "Certificado Verde Prata!";
            
        }else if (lucroPositivo == true && saudeOcupacional == true && reducaoCO2 >= 10 && reducaoCO2 <= 29 && relatorioGRI == false){
            certificado = "Certificado Verde Bronze!";
            
        }else if (lucroPositivo == true && saudeOcupacional == true && reducaoCO2 < 10 && relatorioGRI == false){
            certificado = "Certificado Não elegível!";
            
        }

        System.out.println("De acordo com as infromações fornecidas por você sa dua empresa você tem o "+certificado);

    }
}
