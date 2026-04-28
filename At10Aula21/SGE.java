package At10Aula21;

import java.util.Scanner;

public class SGE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //parametros
        //login
        String ususario = "admin";
        int senha = 1234;
        int erro = 0;

        System.out.println();
        System.out.println("Bem-Vindo ao SGE Sistema de Gerenciamento Escolar!");
        
        //Sistema de login
        System.out.println(" Página de login ");

        for(int i = 1; i <= 3; i++){
            
            System.out.print(" Digite seu usuario: ");
            String verificaUsuario = sc.next().toLowerCase();
            System.out.print(" Digite sua senha: ");
            int verificaSenha = sc.nextInt();

            if (!verificaUsuario.equalsIgnoreCase(ususario) || verificaSenha != senha){
                System.out.println("O usuário ou a senha que você digitou estão erradas, tente novamente");
                erro ++;
                if(erro == 3){
                    System.out.println("Você errou 3 vezes. ACESSO NEGADO!");
                    System.out.println("Encerrando programa...");
                    return;
                }
            
            }else if (verificaUsuario.equalsIgnoreCase(ususario) || verificaSenha == senha){
                System.out.println("As credenciais informadas por você estão corretas. ACESSO LIBERADO");
                break;
            }

        }

        // Menu de funcionalidades

        while(true){
            System.out.print("Menu de funcionalidades: \n"+
                "1. Controle de atividades realizadas em sala \n"+
                "2. Análise de números informados pelo usuário \n"+ 
                "3. Encerrar sistema \n"+
                "Escolha qual você deseja (digite o número): ");
                int escolha = sc.nextInt();
                
            switch(escolha){
                // Controle de atividades realizadas em sala 
                case 1 -> { 

                    // Mensagem de boas-vindas do sistema
                    System.out.println(" Sistema Controle de Atividades Realizadas! ");
                    // recebendo dados
                    System.out.print("Digite a quantidade de dias observados: ");
                    int diasObs = sc.nextInt();
                    // Variaveis que recebem valores de dentro do for
                    int somaAtividades = 0;
                    int mediaAtividades = somaAtividades /diasObs;
                    int maisdezAtividades = 0;
                    // Laço for para colocar as atividades de acordo com os dias 
                    for(int i = 1; i <= diasObs; i++){
                        System.out.printf("Informe a quantidade de atividades realizadas pela turma no %d° dia: ", i);
                        int atividades = sc.nextInt();
                        somaAtividades += atividades;
                        
                        if (atividades >= 10){
                            maisdezAtividades++;
                        }
                    }
                    // Resultados da incerção de dados
                    System.out.printf("O total de atividades realizadas no periodo de %d dias foram %d atividades \n", diasObs, somaAtividades);
                    System.out.printf("A média diaria de atividades realizadas foi de %d \n", mediaAtividades);
                    System.out.printf("O total de dias em que as atividades foram mais que 10 em um dia só é de: %d \n", maisdezAtividades);

                 }

                 // Análise de Números Informados
                 case 2 -> {

                    // Boas vindas do sistema De análise
                    System.out.println("Sistema de Análise de Números Informados");

                    // Condição de inicio
                    System.out.print("Para iniciar o sistema e contabilizar os números digite (S): ");
                    String start = sc.next().toUpperCase();

                    // Aviso para a condição de quebra do (do while)
                    System.out.println("AVISO! Se em algum momento quiser sair do programa digite um número negativo Ex: -1");

                    // Variaveis de recebimento de dados 
                    double somaNumPar = 0;
                    double contNumImpar = 0;

                    // Loop para recebimento de dados 
                    do{

                        // Recebendo dados do usuario 
                        System.out.print("Digite um número: ");
                        double num = sc.nextDouble();

                        // Condições para preenchimento das variaveis
                        if(num < 0){
                            System.out.println("Encerrando o programa...");
                            break;

                        }else if(num % 2 != 0){
                            contNumImpar++;

                        }else if(num % 2 == 0){
                            somaNumPar += num;
                        }

                    }while(start.equalsIgnoreCase("S"));

                    // Respostas mostradas ao usuario apos sair do loop
                    System.out.printf("A soma dos números pares foram de: %.2f \n", somaNumPar);
                    System.out.printf("Foram contados %.2f números impares \n", contNumImpar);
                 }

                 case 3 -> {
                    System.out.println("Encerrando o programa...");
                        return;
                 }
                
            }

        }

    }
}
