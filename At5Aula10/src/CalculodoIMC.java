import java.util.Scanner;

public class CalculodoIMC {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);  

        System.out.println("    Esse programa irá calcular o seu IMC!");
        System.out.println("------------------------------------------------");

        System.err.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu peso (em quilogramas): ");
        float peso = sc.nextFloat();

        System.out.print("Digite seu altura (em metros): ");
        float altura = sc.nextFloat();

        float IMC = peso / (altura * altura);

        if (IMC < 18.5){     
            System.out.print("Olá "+ nome +" seu IMC é de "+ IMC +" e ele aponta MAGRESA!");

            System.out.print("Sabemos que pode ser um pouco preocupante "+ nome +", mas pedimos que você procure uma ajuda médica! Sabemos que você vai conseguir!");

        }else if (IMC >= 18.5 && IMC <= 24.9){
            System.out.print("Olá "+ nome +" seu IMC é de "+ IMC +" e ele aponta NORMALIDADE!");

            System.out.print("Isso aí você cuida da sua saúde "+ nome +", continue com o bom trabalho e inspire noutras pessoas");

        }else if (IMC >= 25 && IMC <= 29.9){
            System.out.print("Olá "+ nome +" seu IMC é de "+ IMC +" e ele aponta SOBREPESO!");

            System.out.print("Sabemos que pode ser um pouco preocupante "+ nome +", mas pedimos que você procure uma ajuda médica! Sabemos que você vai conseguir!");

        }else if (IMC >= 30 && IMC <= 39.9){
            System.out.print("Olá "+ nome +" seu IMC é de "+ IMC +" e ele aponta OBESIDADE!");

            System.out.print("Sabemos que pode ser preocupante "+ nome +", mas pedimos que você procure uma ajuda médica! Sabemos que você vai conseguir!");

        }else if (IMC >= 40){
            System.out.print("Olá "+ nome +" seu IMC é de "+ IMC +" e ele aponta OBESIDADE GRAVE!");

            System.out.print("Sabemos que pode ser um muito preocupante "+ nome +", mas pedimos que você procure uma ajuda médica! Sabemos que você vai conseguir!");
        }



    }
}
