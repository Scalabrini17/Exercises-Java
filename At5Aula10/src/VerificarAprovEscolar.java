import java.util.Scanner;

public class VerificarAprovEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.next();

        System.out.print("Informa a primeira nota do aluno: ");
        float nota1 = sc.nextFloat();

        System.out.print("Informe a segunda nota do aluno: ");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.print("O aluno " + nome +" está aprovado!");
        }else if (media < 5 && media < 7){
            System.out.println("O aluno "+ nome +" está de recuperação!");
        }else{
            System.err.println("O aluno "+ nome +" está reprovado!");
        }

    }
}
