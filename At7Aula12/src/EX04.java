//4. Escolha de Personagem em Jogo

import java.util.Scanner;


public class EX04 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

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
        }
    }
}
