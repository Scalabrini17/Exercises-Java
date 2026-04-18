//Atividade Final

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá Professor, Escolha qual exercício o senhor quer corrigir\n"+
        "1. Exercicio 01 \n"+
        "2. Exercicio 02 \n"+
        "3. Exercicio 03 \n"+
        "4. Exercicio 04 \n"+
        "5. Exercicio 05 \n"+
        "6. Exercicio 06 \n"+
        "7. Exercicio 07 \n"+
        "8. Exercicio 08 \n"+
        "9. Exercicio 09 \n"+
        "10. Exercicio 10 \n"+
        "11. Exercicio 11 \n"+
        "Digite o número da atividade que o senhor deseja corrigir: ");
        int atividade = sc.nextInt();

        switch (atividade) {

            case 1 -> {
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

            case 2 -> {
                System.out.print("Digite um número para ver a tabuada dele: ");
                int num = sc.nextInt();

                for (int i = 0; i <= 10; i++){
                    int tabuada = num * i;
                    System.out.printf("%d x %d = %d \n", num, i, tabuada);
                    
                    
                }
            }

            case 3 -> {
                float soma = 0;

                for (int i = 1; i <= 7; i++){
                    System.out.printf("Digite a %dº venda: ", i);
                    float num = sc.nextFloat(); 
                    soma += num;
                    
                }

                float media = soma / 7;

                System.out.printf("A soma entre as sete vendas da semana é: R$%.2f\n", soma);

                System.out.printf("A média entre as sete vendas da semana é: R$%.2f\n", media);
            }

            case 4 -> {
                float saldInit = 500000.00f;
                float saldFin = 0;
                // Condição do Caixa Eletronoco
                while (true){
                    System.out.printf("Seu saldo é de R$ %.2f \n", saldInit);
                    System.out.print("Digite o valor que você deseja sacar (se quiser sair digite 0): ");
                    float valsac = sc.nextFloat();

                    //Condições para o break
                    if (valsac <= 0){
                        break;
                    }else if (saldInit <= 0){
                        System.out.println("O valor do seu saldo é insulficiente");
                        break;
                    }

                    if (valsac <= saldInit){
                        saldInit -= valsac;
                        saldFin += valsac;
                    }
                    
                }

                

                System.out.printf("Valor disponivel para sac: R$%.2f \n", saldInit);
                System.out.printf("O valor sacado até agora foi de: R$%.2f \n", saldFin);
            }

            case 5 -> {
                System.out.print("Digite um número de 1 a 100 para adivinhar qual eu escolhi!: ");
                double numesc = sc.nextDouble();

                //Gerador de número aleatório de 1 a 100
                double numale = Math.random();
                //Trasformando o número em inteiro
                int numalecom = (int) (numale * 10);

                System.out.printf("num ale com %d \n", numalecom);
                // Condição para a repetição até acerto!
                while (numesc != numale){
                    System.out.println("Você errou!");
                    System.out.print("Tente novamente, digite outro número: ");
                    double novatent = sc.nextDouble();

                    numesc = novatent;

                    //Condições para instrução se o número é maior, menor ou acerto e break
                    if (numesc > numalecom){
                        System.out.print("O número que vocÊ digitou é maior que o número aleatório");

                    }else if (numesc < numalecom){
                        System.out.print("O número que vocÊ digitou é menor que o número aleatório");

                    }else if (numesc == numalecom){
                        System.out.printf("Parabéns!! Você acertou o Número Secreto que é: %d. \n", numalecom);
                        break;
                    }
                    
                }
            }

            case 6 -> {
                int und = 100;

                //Inicio do programa
                System.out.println("Olá bem vindo ao seu estoque!");
                System.out.printf("Seu estoque atual é de: %d \n", und);
                System.out.print("Você quer dar entrada ou saída no estoque? (digite E para entrada ou S para saída): ");
                String escolha = sc.next().toUpperCase();

                while(true){
                    if (escolha.equalsIgnoreCase("E")) {
                        System.out.printf("Você escolheu adicionar,\n"+
                        " Seu estoque atual é: %d \n"+ 
                        "digite a quantidade que você deseja adicionar: ", und);
                        int addent = sc.nextInt();

                        und += addent;
                    
                    }else if (escolha.equalsIgnoreCase(escolha)){
                        System.out.printf("Você escolheu dar saída,\n"+
                        " Seu estoque atual é: %d \n"+ 
                        "digite a quantidade que você deseja adicionar: ", und);
                        int extsad = sc.nextInt();

                        und -= extsad;

                    }else if(und == 0 ){
                        System.out.println("Seu estoque está zerado, você não poder dar saída e não pode deixar ele Zerado!");
                        System.out.print("Adicione uma quantidade: ");
                        int zerado = sc.nextInt();

                        und += zerado;
                    }


                    System.out.print("Se desejár continuar digite (C) se deseja sair (FIM): ");
                    String sair = sc.next().toUpperCase();

                    if(sair.equalsIgnoreCase("FIM")){
                        System.out.printf("Fim do programa! Seu estoque atual é de: %d \n", und);
                        break;
                    }
                
                }
            }

            case 7 -> {
                double valTaxa = 5.25;
                int contagem = 0;
                double valorTotal = 0;
                String sair = "";

                System.out.println("Seja bem vindo ao sistema de conversão de moeda!");
                System.out.print("Você quer comerçar o programa digite (S):  ");
                String start = sc.next().toUpperCase();

                while(!(start.equalsIgnoreCase("N") || sair.equalsIgnoreCase("N"))){

                    if(start.equalsIgnoreCase("S")){
                        contagem ++;

                        System.out.print("Digite um valor em dolar para converter para real: ");
                        double valor = sc.nextDouble();

                        double valconv = valTaxa * valor;

                        valorTotal += valconv;
                    }

                    System.out.println("Você deseja continuar? Digite S para sim e N para não: ");
                    sair = sc.next().toUpperCase();
                    
                }

                System.out.printf("O valor total de todas as conversões é: R$%.2f \n", valorTotal);
                System.out.printf("O valor total de converções que foram feitas é: %d conversões \n", contagem);
            }

            case 8 -> {
                int itenpedido = 0;

                int totalpedido = 0;

                String sair = "";

                System.out.println("Sejá bem vindo ao FatesgBurguer!");
                System.out.println("Digite S para começar a fazer seu pedido");
                String start = sc.next().toUpperCase();

                do{
                    System.out.print("Cardápio \n"+
                    "1-Hamburguer (R$25) \n"+
                    "2-Pizza (R$35) \n"+
                    "3-Salada (R$18) \n"+
                    "4-Sair \n"+
                    "Digite o número da opção que você deseja: ");
                    int opcao = sc.nextInt();

                    switch (opcao){

                        case 1 -> {
                            System.out.println("O Hanburguer foi savo com sucesso");
                            totalpedido += 25;
                            itenpedido ++;
                        }

                        case 2 -> {
                            System.out.println("A Pizza foi sava com sucesso");
                            totalpedido += 35;
                            itenpedido ++;
                        }

                        case 3 -> {
                            System.out.println("A Salada foi sava com sucesso");
                            totalpedido += 18;
                            itenpedido ++;
                        }

                        case 4 -> {
                            System.out.println("Finalizando o pedido...");
                        }

                    }
                    System.out.print("Se deseja adicionar mais alguma item ao pedido digite S se não digite N: ");
                    sair = sc.next().toUpperCase();

                } while (!(start.equalsIgnoreCase("N") | sair.equalsIgnoreCase("N")));

                System.out.printf("A quantidade de itens que você pediu foi: %d \n", itenpedido);
                System.out.printf("O valor total do seu pedido foi: R$%d \n", totalpedido);
            }

            case 9 -> {
                String senha = "";
                String confsenha = "";

                System.out.print("Crie uma senha de no mínimo 8 dígitos: ");
                senha = sc.next().toUpperCase();

                do {

                    System.out.println("Agora digite a sua senha para confirmar: ");
                    confsenha = sc.next().toUpperCase();
                    if (!(senha.equalsIgnoreCase(confsenha)))
                    System.out.println("Sua senha está errada, tente novamente!");

                }while (senha.length() < 8 & confsenha.equalsIgnoreCase(senha));

                System.out.println("Sua senha foi confirmada! \n");
            }

            case 10 -> {
                // int opcaoVoto = 0;
                int votocand1 = 0;
                int votocand2 = 0;
                int votocand3 = 0;
                int votonull = 0;
                int votoTotal = 0;
                String sair = "";

                System.out.println("Para iniciar sua votação digite S: ");
                String start = sc.next().toUpperCase();

                do {

                    System.out.println("Seja bem vindo a urna de eleição!");
                    System.out.print(" Lista de Candidatos: \n"+
                        "1 - Cantidato 1 \n"+
                        "2 - Cantidato 2 \n"+
                        "3 - Cantidato 3 \n"+
                        "4 - Voto Nulo \n"+
                        "9 - Sair \n"+
                        "Digite o número da sua escolha: ");
                        int escolha = sc.nextInt();

                        switch (escolha){
                            case 1 -> { System.out.println("Sua escolha foi salva");
                                votocand1 ++;
                                votoTotal ++;
                            }
                            case 2 -> { System.out.println("Sua escolha foi salva");
                                votocand2 ++;
                                votoTotal ++;
                            }
                            case 3 -> { System.out.println("Sua escolha foi salva");
                                votocand3 ++;
                                votoTotal ++;
                            }
                            case 4 -> { System.out.println("Sua escolha foi salva");
                                votonull ++;
                                votoTotal ++;
                            }
                            case 9 -> {
                                System.out.println("Finalizando a votação...");
                                break;
                            }
                        }
                    // System.out.print("Terminou sua votação? Digite S para sim e N para não");
                    // sair = sc.next().toUpperCase();

                } while (start.equalsIgnoreCase("S") | sair.equalsIgnoreCase("N"));

                Math.max(votocand1, Math.max(votocand2 , votocand3));

                System.out.printf("O total de votos foi %d \n"+
                "O candidato 1 conseguiu %d votos\n"+
                "O candidato 2 conseguiu %d votos\n"+
                "O candidato 3 conseguiu %d votos\n"+
                "O Total de votos nulos foi de %d votos\n", votoTotal, votocand1, votocand2, votocand3, votonull);
                System.out.printf("E o candidato vencedor foi o: %d \n", (Math.max(votocand1, Math.max(votocand2 , votocand3))));
            }

            case 11 -> {
               
            }

        }

    }
}
