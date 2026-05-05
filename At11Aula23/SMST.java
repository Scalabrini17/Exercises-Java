// Sistema de Monitoramento de Suporte de TI

import java.util.Scanner;

public class SMST{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Credenciais de login
        String user = "admin";
        int pass = 1234;

        // login
        System.out.println("Informe suas credenciais!");

        // Varificação das credenciais 
        for(int i = 1; i <= 3; i++){

            // Login 
            System.out.print("Digite o usuário: ");
            String verifUser = sc.next().toLowerCase();
            System.out.print("Digite a senha: ");
            int verifPass = sc.nextInt();

            // Caso a tentativa atingir 3 encerra
            if( i == 3 ){
                System.out.println("Você errou 3 vezes suas credenciais! Finalizando o programa...");
                return;
            }

            if( !verifUser.equalsIgnoreCase(user) | verifPass != pass ){
                System.out.println();
                System.out.println("Você digitou suas credenciais errado, digite novamente!");
                System.out.println();

            }else if ( verifUser.equalsIgnoreCase(user) | verifPass == 3 ){
                System.out.println();
                System.out.println("Credenciais validas. Acesso liberado!");
                System.out.println();
                break;
            }
            
        }

        // Boas vindas
        System.out.println(" Seja Bem-Vindo ao Sistema de Monitoramento de Suporte de TI! ");
        System.out.println();
        System.out.print(" Para iniciar digite (S):");
        String enter = sc.next().toUpperCase();
        System.out.println();

        // Menu de funcionalidades
        while( enter.equalsIgnoreCase("S")){
            
            System.out.print("Menu de funcionalidades: \n"+
            "1. Controle de Chamados Resolvidos \n"+
            "2. Análise de Tempo de Atendimento \n"+
            "3. Encerrar Sistema \n"+
            "Digite o número da funcionalidade que você deseja: "
            );
            int escolha = sc.nextInt();
            System.out.println();

            switch(escolha){
                case 1 -> {

                    //Controle de chamados resolvidos
                    System.out.println("Controle de Chamados Resolvidos");
                    System.out.println();

                    // entrada de dados dados
                    System.out.print(" Digite a quantidade de dias observados: ");
                    int diasObs = sc.nextInt();

                    //parametros
                    int totalChamados = 0;
                    int diasProdutivos = 0;

                    for(int i = 1; i <= diasObs; i++){
                        System.out.printf("Digite a quantidade de chamados resolvidos no %dº dia: ", i);
                        int chamadosResolvidos = sc.nextInt();
                        totalChamados += chamadosResolvidos;

                        if ( chamadosResolvidos >= 15 ){
                            diasProdutivos++;
                        }
                    }
                    
                    double mediaChamados = totalChamados / diasObs;

                    // saída 
                    System.out.printf("O total de chamados respondidos foi de %d chamados, dentro do periodo de %d dias \n", totalChamados, diasObs);
                    System.out.println();
                    System.out.printf("A média diaria de chamados resolvidos é de: %.2f chamados respondidos \n", mediaChamados);
                    System.out.println();
                    System.out.printf("E a quantidade de dias em que a média de chamados responodidos foi alta foram de: %d dias", diasProdutivos);
                    System.out.println();

                }

                case 2 -> {

                    // Análise de tempo de atendimento
                    System.out.print("Para iniciar o Programa de Análise de tempo de atendimento \n"+
                        "Digite (A): ");
                    String comeco = sc.next().toUpperCase();

                    // condição de entrada
                    System.out.println("AVISO! Se quiser sair do programa, digite um número negativo!!");

                    // Parametros
                    double tempGasComplex = 0;
                    int chamRapidos = 0;

                    // recebimento de dados
                    while(comeco.equalsIgnoreCase("A")){
                        System.out.println(" Digite o tempo (em minutos) em que a equipe precisou para responder o chamado: ");
                        double tempo = sc.nextDouble();
                        
                        // condição de saida do recebimento de dados
                        if(tempo < 0){
                            System.out.println();
                            System.out.println("Finalizando o programa...");
                            System.out.println();
                            break;

                        }else if (tempo > 60){
                            tempGasComplex += tempo;

                        }else if (tempo > 0 && tempo <= 60){
                            chamRapidos++;
                        }
                    }

                    System.out.printf("Foram gastos pela equipe de TI %.2f minutos em tarefas complexas \n", tempGasComplex);
                    System.out.println();
                    System.out.printf("E a equipe de TI respondeu %d chamados rápidos (menos de 60min) \n", chamRapidos);
                    System.out.println();

                }

                case 3 -> {

                    // saída do while
                    System.out.println("Você escolheu encerrar o programa");
                    System.out.println("Finalizando programa...");
                    return;
                }
            }
        }

    }
}