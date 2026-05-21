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
        System.out.println("Letras maiúsculas → peças pretas \n"+
                "Letras minúsculas → peças brancas");
        System.out.print("Para iniciar digite (S): ");
        String start = sc.next().toUpperCase();
        System.out.println("As peças brancas começa!");

        while(start.equalsIgnoreCase("S")){
            //gerando tabuleiro
            gerartab();

            //Captando resposta do usuário

            //Escolha da peça
            System.out.println("Qual posição inicial da peça");
            System.out.print("Linha: ");
            int linhainit = sc.nextInt();
            System.out.print("Coluna: ");
            int colunainit = sc.nextInt();

            //Regra: Verificar se a posição nao está vazia
            while(linhainit < 0 || linhainit > 7 || colunainit < 0 || colunainit > 7 || tab[linhainit][colunainit].equalsIgnoreCase(".")){
                System.out.println("Nessa posição não existe peça. Tente novamente!");
                System.out.println("Qual posição inicial da peça");
                System.out.print("Linha: ");
                linhainit = sc.nextInt();
                System.out.print("Coluna: ");
                colunainit = sc.nextInt();
            }

            // "Pegar peça"
            String peca = "";

            //Regra: Verificar se a uma peça no lugar
            if(!tab[linhainit][colunainit].equalsIgnoreCase(".")){
                // "Pegar peça"
                peca = tab[linhainit][colunainit];
            }

            // Escolha da jogada

            int linhaend = 0;
            int colunaend = 0;

            System.out.println("Informe sua jogada!");
            System.out.print("Linha: ");
            linhaend = sc.nextInt();
            System.out.print("Coluna: ");
            colunaend = sc.nextInt();

            //Regra: Não pode fazer jogadas fora do tab

            //Verificação se a regra a cima está funcionando

            while(linhaend < 0 || linhaend > 7 || colunaend < 0 || colunaend > 7) {
                System.out.println("Você digitou uma jogada invalida. Tente novamente!");
                System.out.println("Informe sua jogada!");
                System.out.print("Linha: ");
                linhaend = sc.nextInt();
                System.out.print("Coluna: ");
                colunaend = sc.nextInt();
                }

            // Jogada
            tab[linhaend][colunaend] = peca;

            //esvaziando a casa
            tab[linhainit][colunainit] = ".";

            //Tabuleiro com a jogada
            gerartab();

            // Saida do jogo
            System.out.print("Deseja continuar, se sim (S) se não (N): ");
            String saida = sc.next().toUpperCase();
            if(saida.equalsIgnoreCase("N")){

                // Mensagem de despedida (Revisão do jogo)
                System.out.print("Antes de sair aqui uma revisão da sua partida!");

                //gerando tabuleiro
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

// validação de linhas
//while (!sc.hasNextInt()) {
//        System.out.println("Digite apenas números.");
//      sc.next();
//      System.out.print("Linha: ");
//  }


