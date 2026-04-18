import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
}
