package At15Aula28;

import java.util.Scanner;

public class Chess {

    public static String[][] tab = new String[8][8];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        gerarps();
        gerartab();
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
                    tab[i][j] = "p";
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
        System.out.println("    0 1 2 3 4 5 6 7");
        for(int i = 0; i < tab.length; i++){
            System.out.print(" " + i);
            for(int j = 0; j < tab[i].length; j++){

                System.out.print(" " + tab[i][j]);
            }

            System.out.println();
        }
    }

}
