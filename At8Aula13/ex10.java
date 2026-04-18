import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
}

