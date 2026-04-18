import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "";
        String confsenha = "";

        System.out.print("Crie uma senha de no mínimo 8 dígitos: ");
        senha = sc.next().toUpperCase();

        do {

            System.out.println("Agora digite a sua senha para confirmar: ");
            confsenha = sc.next().toUpperCase();
            if (!(senha.equalsIgnoreCase(confsenha)))
            System.out.println("Sua senha está errada, tente novamente!");

        }while (senha.length() < 8 & confsenha.equalsIgnoreCase(senha));

        System.out.println("Sua senha foi confirmada! \n");

    }
}
