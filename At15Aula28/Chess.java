package At15Aula28;

import java.util.Scanner;

public class Chess {

    public static String[][] tab = new String[8][8];

    public static void main(String[] args){
        gerarps();
        gerartab();
        mov();
    }

    public static void gerarps() {
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                if(i == 0) {
                    tab[0][0] = "T";
                    tab[0][1] = "C";
                    tab[0][2] = "B";
                    tab[0][3] = "Q";
                    tab[0][4] = "R";
                    tab[0][5] = "B";
                    tab[0][6] = "C";
                    tab[0][7] = "T";
                }else if(i == 1){
                    tab[i][j] = "P";
                }else if(i == 7){
                    tab[7][0] = "t";
                    tab[7][1] = "c";
                    tab[7][2] = "b";
                    tab[7][3] = "q";
                    tab[7][4] = "r";
                    tab[7][5] = "b";
                    tab[7][6] = "c";
                    tab[7][7] = "t";
                }else if(i == 6){
                    tab[i][j] = "p";
                }else{
                    tab[i][j] = ".";
                }
            }
        }
    }

    public static void gerartab(){
        // pulando uma linha
        System.out.println();
        System.out.println("   0 1 2 3 4 5 6 7");
        for(int i = 0; i < tab.length; i++){
            System.out.print(" " + i);
            for(int j = 0; j < tab[i].length; j++){

                System.out.print(" " + tab[i][j]);
            }

            System.out.println();
        }
    }

    public static void mov(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos começar a jogar?");
        System.out.print("Para iniciar digite (S): ");
        String start = sc.next().toUpperCase();

        while(start.equalsIgnoreCase("S")){
            //gerando tabuleiro
            gerartab();
            //Captando resposta do usuário
            //Escolha da peça
            System.out.println("Qual posição inicial da peça");
            System.out.print("Coluna: ");
            int colunainit = sc.nextInt();
            System.out.print("linha: ");
            int linhainit = sc.nextInt();
            // Escolha da jogada
            System.out.println("Informe sua jogada!");
            System.out.print("Coluna: ");
            int colunaend = sc.nextInt();
            System.out.print("Linha: ");
            int linhaend = sc.nextInt();

            // Saida do jogo
            System.out.print("Deseja continuar, se sim (S) se não (N): ");
            String saida = sc.next().toUpperCase();
            if(saida.equalsIgnoreCase("N")){
                // Mensagem de despedida (Revisão do jogo)
                System.out.print("Antes de sair aqui uma revisão da sua partida!");
                gerartab();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.printf("Erro: %s", e);
                }
                //mensagem e encerramento
                System.out.print("Fechando o jogo...");
                System.out.print("Até a proxima ;)");
                break;
            }

        }

    }

}
//Se precisar do try catch
//try {
//    //Código
//} catch (InterruptedException e) {
//    System.out.printf("Erro: %s", e);
//}

