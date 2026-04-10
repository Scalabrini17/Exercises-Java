//1. Verificador de login simples

import java.util.Scanner;

public class EX01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        }
    }
}   