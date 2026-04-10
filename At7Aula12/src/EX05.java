//5. Menu de Restaurante

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        }

    }
}
