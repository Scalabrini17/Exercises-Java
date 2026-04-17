import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
}
