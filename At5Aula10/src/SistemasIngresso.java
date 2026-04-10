import java.util.Scanner;

public class SistemasIngresso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá bem vindo ao CineFatesg");
        System.err.println("-----------------------------");

        System.out.print("Para começar digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Agora digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Se você tem direito a meia-entrada digite (sim) se não digite não: ");
        String meiaEntrada = sc.next();

        if (meiaEntrada.equals("sim")){
            System.out.println("Que bom que você tem direito a meia-entrada!");
            System.out.print("Digite a sua instituição de ensino: ");
            String instituicao = sc.next();

                if (idade < 12){ 
                    float valorcri = 10;
                    System.out.printf("%s seu ingresso irá custar: R$ %.2f", nome, (valorcri / 2 ));

                }else if (idade >= 13 && idade <= 17){
                    float valorado = 15;
                    System.out.printf("%s seu ingresso irá custar: R$ %.2f", nome, (valorado / 2 ));

                }else if (idade >=18 && idade <= 59){
                    float valoradul = 20;
                    System.out.printf("%s seu ingresso irá custar: R$ %.2f", nome, (valoradul / 2 ));

                }else if (idade >=60){
                    float valorido = 12;
                    System.out.printf("%s seu ingresso irá custar: R$ %.2f", nome, (valorido / 2 ));

                }

        }else if (meiaEntrada.equalsIgnoreCase("não") || meiaEntrada.equalsIgnoreCase("nao")){
            System.out.println("Que pena que você não tem direito a meia entrada!");
            
                if (idade < 12){ 
                    float valorcri = 10;
                    System.out.printf("%s seu ingresso irá custar: R$ %.2f", nome, valorcri);

                }else if (idade >= 13 && idade <= 17){
                    float valorado = 15;
                    System.out.printf("%s seu ingresso irá custar: R$ %.2f", nome, valorado);

                }else if (idade >=18 && idade <= 59){
                    float valoradul = 20;
                    System.out.printf("%s seu ingresso irá custar: R$ %.2f", nome, valoradul);

                }else if (idade >=60){
                    float valorido = 12;
                    System.out.printf("%s seu ingresso irá custar: R$ %.2f", nome, valorido );

                }

        }

    }
}
