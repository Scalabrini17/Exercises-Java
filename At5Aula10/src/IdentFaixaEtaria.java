import java.util.Scanner;

public class IdentFaixaEtaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0 | idade >= 101){
            System.out.println("Idade invalida, preencha o formulario novamente");
        }else if (idade >= 0 && idade <= 12){
            System.out.println("Olá, "+ nome +" você tem "+ idade +" anos e ainda é uma CRIANÇA!");
        }else if (idade >= 13 && idade <= 17){
            System.out.println("Olá, "+ nome +" você tem "+ idade +" anos e ainda é um ADOLECENTE!");
        }else if (idade >= 18 && idade <= 59){
            System.out.println("Olá, "+ nome +" você tem "+ idade +" anos e já é um ADULTO!");
        }else if (idade >= 60 && idade <= 100){
            System.out.println("Olá, "+ nome +" você tem "+ idade +" anos e já é um IDOSO!");
        }
    }
}
