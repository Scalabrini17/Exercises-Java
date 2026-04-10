//Atividade Final

import java.util.Scanner;

public class EX10J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá Professor, Escolha qual exercício o senhor quer corrigir\n"+
        "1. Verificador de login simples\n"+
        "2. Plano de internet\n"+
        "3. Turno escolar\n"+
        "4. Escolha de Personagem em Jogo\n"+
        "5. Menu de Restaurante\n"+
        "6. Dia da Semana\n"+
        "7. Escolha de Bebida\n"+
        "8. Operação Matemática Simples\n"+
        "9. Sistema de Transporte\n"+
        "Digite o número da atividade que o senhor deseja corrigir: ");
        int atividade = sc.nextInt();

        switch (atividade) {

            case 1 -> {//1. Verificador de login simples

        // INICIANDO A ATIVIDADE 
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando a atividade 1...");
        
        try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, este bloco é executado
            System.out.println("O cronômetro foi interrompido!");
            
        }
        // Cadastro
        String cadsUser1 = "admin";
        String cadsPass1 = "1234";

        // Recebendo dados
        System.out.print("Digite seu Usuário:");
        String user1 = sc.next();

        System.out.print("Digite sua senha:");
        String pass1 = sc.next();

        // Verificação
        boolean verUser1 = false;
        boolean verPass1 = false;

        if (user1.equalsIgnoreCase(cadsUser1)){
            verUser1 = true;
        }
        if (pass1.equalsIgnoreCase(cadsPass1)){
            verPass1 = true;
        }

        // Uso do switch
        switch (verUser1) {
            case true -> System.out.println("O usuário está correto!");
            default -> System.out.println("O Usuário está incorreto!");
        }
        switch (verPass1){
            case true -> System.out.println("A senha está correta!");
            default -> System.out.println("A senha está incorreta!");
        }}

        case 2 -> {//2. Plano de internet

        // INICIANDO A ATIVIDADE 
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando a atividade 2...");
        
        try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, este bloco é executado
            System.out.println("O cronômetro foi interrompido!");
            
        }

        //Recebedo dados
        System.out.println("Olá seja bem vindo a Compania de Internet (WIFI)");
        System.out.println("Para começar vou te apresentar nossos planos");

        System.out.println("Temos o plano BÁSICO que custa R$50");
        System.out.println("Temos o plano PREMIUM que custa R$100");
        System.out.println("Temos o plano ULTRA que custa R$150");

        System.out.print("Digite qual o nome do plano você deseja (BASICO, PREMIUM OU ULTRA): ");
        String plano = sc.nextLine().toUpperCase();

        switch (plano) {
            case "BASICO" -> System.out.print("O plano que você escolheu é o BÁSICO você agora pagará uma assinatura de R$ 50 por mês");

            case "PREMIUM" -> System.out.print("O plano que você escolheu é o BÁSICO você agora pagará uma assinatura de R$ 100 por mês");

            case "ULTRA" -> System.out.print("O plano que você escolheu é o BÁSICO você agora pagará uma assinatura de R$ 150 por mês");
            
            default -> System.out.print("O plano que você digitou é invalido, digite novamente por favor!");

        }}

        case 3 -> {//3. Turno escolar

        // INICIANDO A ATIVIDADE 
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando a atividade 3...");
        
        try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, este bloco é executado
            System.out.println("O cronômetro foi interrompido!");
            
        }

         // Recebendo dados
        System.out.print("Digite o código (M, V ou N): ");
        String turno = sc.nextLine().toUpperCase();

        switch (turno) {
            case "M" -> System.out.println("Turno MATUTINO");
            
            case "V" -> System.out.println("Turno VESPERTINO");
            
            case "N" -> System.out.println("Turno NOTURNO");

        }}

        case 4 -> {//4. Escolha de Personagem em Jogo

        // INICIANDO A ATIVIDADE 
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando a atividade 4...");
        
        try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, este bloco é executado
            System.out.println("O cronômetro foi interrompido!");
            
        }

        System.err.println("Escolha a classe do seu personagem! ");
       System.err.println("guerreiro: especialista em combate corpo a corpo, com alta resistência");
       System.err.println("mago: utiliza poderes mágicos para atacar à distância;");
       System.err.println("arqueiro: possui alta precisão em ataques com arco e flecha.");

       // Recebendo dados 
       System.out.print("Agora Digite a classe que você deseja: ");
       String classe = sc.nextLine();

        //Verificação
        if (classe.equalsIgnoreCase("MAGO")){
            System.err.println("Parabéns! Você escolheu a classe Mago, divirta-se jogando");
        }
        if (classe.equalsIgnoreCase("GUERREIRO")){
            System.err.println("Parabéns! Você escolheu a classe Guerreiro, divirta-se jogando");
        }
        if (classe.equalsIgnoreCase("ARQUEIRO")){
            System.err.println("Parabéns! Você escolheu a classe Arqueiro, divirta-se jogando");
        }}

        case 5 -> {//5. Menu de Restaurante

        // INICIANDO A ATIVIDADE 
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando a atividade 5...");
        
        try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, este bloco é executado
            System.out.println("O cronômetro foi interrompido!");
            
        }

        System.out.println("Seja Bem-vindo so nosso Restaurante!");
        System.out.print("Para começar Digite seu nome: ");
        String nome = sc.nextLine().toUpperCase();

        System.out.print("Escolha seu prato "+nome+" \n"+
        "1: Hambúrguer \n"+
        "2: Pizza \n"+
        "3: Salada \n"+
        "Digite o número do prato:");
        int pedido = sc.nextInt();
        
        switch (pedido){

        case 1 -> System.out.print("*Comanda "+nome+"*\n"+
        "Pedido: Hambúrguer");
        
        case 2 -> System.out.print("*Comanda "+nome+"*\n"+
        "Pedido: Pizza");
        
        case 3 -> System.out.print("*Comanda "+nome+"*\n"+
        "Pedido: Salada");

        default -> System.out.println("O número que você digitou é invalido!");

        }}

        case 6 -> {//6. Dia da Semana

        // INICIANDO A ATIVIDADE 
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando a atividade 6...");
        
        try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, este bloco é executado
            System.out.println("O cronômetro foi interrompido!");
            
        }

        System.out.print("Dias da semana \n"+
        "1: Segunda \n"+
        "2: Terça \n"+
        "3: Quarta \n"+
        "4: Quinta \n"+
        "5: Sexta \n"+
        "6: Sábado \n"+
        "7: Domingo \n"+
        "Digite o número referente ao dia que você deseja: ");
        int diaSemana = sc.nextInt();

        switch (diaSemana){

            case 1 -> System.out.println("Hoje é Segunda");
            
            case 2 -> System.out.println("Hoje é Terça");
            
            case 3 -> System.out.println("Hoje é Quarta");
            
            case 4 -> System.out.println("Hoje é Quinta");
            
            case 5 -> System.out.println("Hoje é Sexta");
            
            case 6 -> System.out.println("Hoje é Sábado");
            
            case 7 -> System.out.println("Hoje é Domingo");

        }}

        case 7 -> {//7. Escolha de Bebida

            // INICIANDO A ATIVIDADE 
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando a atividade 7...");
        
        try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, este bloco é executado
            System.out.println("O cronômetro foi interrompido!");
            
        }

        System.out.print("Escolha a sua Bebida \n"+
        "Agua \n"+
        "Suco \n"+
        "Refrigerante \n"+
        "Digite qual bebida você deseja: ");
        String bebida = sc.nextLine().toUpperCase();

        switch (bebida){
            
            case "AGUA" -> System.out.print("Você escolheu a água. Seu pedido foi confirmado!");
            
            case "SUCO" -> System.out.print("Você escolheu a suco. Seu pedido foi confirmado!");
            
            case "REFRIGERANTE" -> System.out.print("Você escolheu a refrigerate. Seu pedido foi confirmado!");

        }}

        case 8 -> {//8. Operação Matemática Simples

            // INICIANDO A ATIVIDADE 
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando a atividade 8...");
        
        try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, este bloco é executado
            System.out.println("O cronômetro foi interrompido!");
            
        }

        System.out.print("Digite o primeiro número: ");
        float num1 = sc.nextFloat();
        
        System.out.print("Digite o segundo número: ");
        float num2 = sc.nextFloat();

        System.out.println("Escolha a operação matemática \n"+
        "+ Adição \n"+
        "- Subtração \n"+
        "* Multiplicação \n"+
        "/ Divisão \n"+
        "Digite a operação desejada: ");
        String opera = sc.nextLine().toUpperCase();

        switch (opera) {

            case "+" -> System.out.printf("O resultado é: %f", (num1 + num2));
            
            case "-" -> System.out.printf("O resultado é: %f", (num1 - num2));
            
            case "*" -> System.out.printf("O resultado é: %f", (num1 * num2));
            
            case "/" -> System.out.printf("O resultado é: %f", (num1 / num2));

        }}

        case 9 -> {//9. Sistema de Transporte

            // INICIANDO A ATIVIDADE 
        System.out.println("--------------------------------------------------");
        System.out.println("Iniciando a atividade 9...");
        
        try {
            // Pausa a execução por 3000 milissegundos (3 segundos)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, este bloco é executado
            System.out.println("O cronômetro foi interrompido!");
            
        }

        System.out.print("Escolha uma das opções de Transporte\n"+
        "Onibus\n"+
        "Metro\n"+
        "Uber\n"+
        "Digite a sua escolha (digite sem assento por gentileza): ");
        String transporte = sc.nextLine().toUpperCase();

        switch (transporte) {

            case "ONIBUS" ->  System.out.println("O trasporte que você escolheu é o Ônibus e ele tem o tempo médio de 40 minutos");
           
            case "METRO" ->  System.out.println("O trasporte que você escolheu é o Metro e ele tem o tempo médio de 25 minutos");
           
            case "UBER" ->  System.out.println("O trasporte que você escolheu é o Uber e ele tem o tempo médio de 30 minutos");

        }}
        
        }

    }
}
