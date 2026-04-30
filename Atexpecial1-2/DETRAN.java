import java.util.Scanner;

public class DETRAN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" Bem-vindo ao Sistema de Infrações do DETRAN ");

        // Cadastro do Motorista
        System.out.println(" Cadastro do Motorista ");
        System.out.print("Por favor, digite o nome do motorista: ");
        String nomeMotorista = sc.next();
        System.out.print(" Digite o número da CNH do motorista: ");
        int numCnh = sc.nextInt();
        System.out.print(" Digite a quanto tempo o motorista tem sua CNH (tempo em anos!): ");
        int anosCnh = sc.nextInt();

        // Cadastro do Veículo
        System.out.println(" Cadastro do veículo ");
        System.out.print(" Digite a placa do veículo:  ");
        String placaVei = sc.next(); // Case sensitive
        System.out.print(" Digite o modelo do veículo: ");
        String modeloVei = sc.next().toUpperCase(); // case insensitive
        System.out.print(" Digite o ano de fabricação do veículo: ");
        int anoFabVei = sc.nextInt();

        // Menu de infrações

        boolean stop = false;

        int infraTotal = 0;

        do{

            System.out.print("Menu de infrações: \n"+
                "1 - Excesso de velocidade \n"+
                "2 - Estacionamento (Área Azul) \n"+
                "3 - Álcool ao volante \n"+
                "Escolha a opção que deseja (digite um número): ");
            int escolhaInfra = sc.nextInt();

            switch(escolhaInfra){

                case 1 -> {
                    // Excesso de velocidade

                    System.out.println(" Infração de Excesso de velocidade ");
                    
                    System.out.printf(" Digite a velocidade que o motorista %s passou no radar: ", nomeMotorista);
                    int velUltr = sc.nextInt();

                    int velLimit = 100;
                    int velocidadedif = velUltr - velLimit;
                    double descontar = 0;

                    String tipoInfra = "";
                    int pontoInfra = 0;
                    double valMulta = 0;

                    if (velUltr <= 100){
                        descontar = 7;

                    }else if (velUltr > 101){
                        descontar = (7/100);
                    }

                    double diferenca = velocidadedif - descontar;

                    if (diferenca > (20/100)){
                        tipoInfra = "Infração Média";
                        pontoInfra = 4;
                        valMulta = 130.16;
                        

                    }else if (diferenca > (21/100) && diferenca < (50/100)){
                        tipoInfra = "Infração Grave";
                        pontoInfra = 5;
                        valMulta = 195.23;
                        

                    }else if (diferenca > (50/100)){
                        tipoInfra = "Infração Gravíssima";
                        pontoInfra = 7;
                        valMulta = 880.41;
                        
                        
                    }
                    System.out.printf("O motorista %s foi multado no seu veiculo de placa %s por Excesso de velocidade:\n" +
                    "Tipo de infração: %s\n" +
                    "Levou %d pontos na carteira\n" +
                    "Valor da multa: R$ %.2f\n",
                    nomeMotorista,
                    placaVei,
                    tipoInfra,
                    pontoInfra,
                    valMulta
                );

                    infraTotal++;

                }

                case 2 -> {
                    // Estacionamento área azul

                    System.out.println(" Infração de Estacionamento (Área Azul) ");
                   
                    System.out.print(" Digite quantos minutos o motorista ficou estacionado: ");
                    int minEst = sc.nextInt();
                    System.out.print("O motorista fez a ativação da Área Azul 1-SIM 2-NÃO");
                    int ativacao = sc.nextInt();


                    int minMax = 120;
                    int minExce = minEst - minMax;

                    String tipoInfra = "";
                    double valinfra = 0;

                    if (minExce >= 61 || ativacao == 1){
                        tipoInfra = "Infração Grave";
                        valinfra = 195.23;
                    

                    }else if (minExce >= 31 && minExce <= 60){
                        tipoInfra = "Infração Média";
                        valinfra = 130.16;
                        

                    }else if (minExce >= 1 && minExce <= 30){
                        tipoInfra = "Infração Leve";
                        valinfra = 88.38;
                        
                    }
                    System.out.printf("O motorista %s foi multado no seu veiculo de placa %s por Excesso de velocidade:\n "+
                    "Tipo de infração: %s \n"+
                    "e o valor da multa é de R$ %.2f \n", 
                    nomeMotorista,
                    placaVei,
                    tipoInfra,
                    valinfra );

                    infraTotal++;

                }

                case 3 -> {
                    // Álcool ao volante

                    System.out.println(" Infração de Álcool ao volante ");

                    System.out.printf(" Digite o mg/l que deu o teste do motorista %s: ", nomeMotorista);
                    double testeBaf = sc.nextDouble();
                    System.out.print("O motorista se recusou a fazer o teste? Digite (S) se SIM e (N) se não ");
                    String recusa = sc.next().toUpperCase();

                    String situacao = "";
                    int sitRecusa = 0;
                    int crime = 0;

                    if (testeBaf <= 0.04){
                        situacao = "Situação Regular";
                        

                    }else if (testeBaf >= 0.05 && testeBaf <= 0.33){
                        situacao = " Infração Gravíssima";
                        infraTotal++; 

                    }else if (testeBaf > 0.34){
                        situacao = "Crime de Trânsito";
                        infraTotal++;
                        crime++;
                    
                    }else if (recusa.equalsIgnoreCase("S")){
                        situacao = "Infração Gravíssima";
                        sitRecusa++;
                        infraTotal++;
                    }
                    System.out.printf("O motorista %s foi multado no seu veiculo de placa %s por Excesso de velocidade:\n" +
                    "Tipo de infração: %s \n" +
                    "levou pontos 7 na carteira \n" +
                    "Suspensão do direito de dirigir \n" +
                    "valor da multa é de R$ 2.934,70 \n%s", 
                    nomeMotorista, 
                    placaVei, 
                    situacao, 
                    (crime >= 1 ? "Crime: Encaminhamento legal\n" : ""),
                    (sitRecusa >= 1 ? "O condutor se resusou a fazer o teste! \n":""));

                }

            }
            
            // Finalização do loop
            System.out.println("Deseja aplicar mais alguma infração? 1-SIM 2-NÃO");
            int escolhaStop = sc.nextInt();

            if (escolhaStop == 2){
                System.out.println(" Finalizando o programa... ");
                break;

            }else if (escolhaStop == 1) {
                stop = true;
            }

        }while(stop != false);

        for (int i = 1; i <= infraTotal; i++){
            System.out.printf("A infração de núemro %dº foi registrada! \n", i);
        }

        System.out.printf("Foram registradas %d infrações \n",infraTotal);
        System.out.printf("Ao motorista %s de CNH nº %d e com o total de %d anos com a CNH \n", nomeMotorista, numCnh, anosCnh);
        System.out.printf("E com o véiculo de placa %s, de modelo %s e com seu ano de fabricação %d \n", placaVei, modeloVei, anoFabVei);
    }
}