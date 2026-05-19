
import java.util.Scanner;

public class SGAB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dados dos livros
        int[] id = new int[100];
        String[] titulo = new String[100];
        String[] autor = new String[100];
        String[] genero = new String[100];
        double[] preco = new double[100];
        int[] quantidade = new int[100];
        String[] raridade = new String[100];

        // Dados dos usuarios
        int[] idUser = new int[60];
        String[] nomeUser = new String[60];
        String[] emailUser = new String[60];
        boolean[] ativoUser = new boolean[60];
        int[] emprestimosUser = new int[60];

        // Váriaveis de controle
        int totalLivros = 0;
        int totalUser = 0;

        // entrada do sistema
        System.out.print("Para iniciar o sistema digite (S): ");
        String entrar = sc.next().toUpperCase();

        while(entrar.equalsIgnoreCase("S")){
            // Menu de Funcionalidades
            System.out.print("Menu de funcionalidades: \n"+
                "1. Cadastro de Livros \n"+
                "2. Cadastrar Usuário \n"+
                "3. Listar todos os livros \n"+
                "4. Pesquisar por Gênero \n"+
                "5. Relatorio de acervo baixo"+
                "6. Listar Usuários Ativos \n"+
                "7. Valor total do acervo \n"+
                "8. Sair \n"+
                "Escolha a opção que desejá e digite o número correspondente: "); 
                int menu = sc.nextInt();

                switch(menu){
                    //Cadastro de Produtos
                    case 1 -> {
                        // Entrada de dados: Quantos cadastros quer fazer nessa entrada
                        System.out.print("Informe quantos livros você deseja cadastrar: ");
                        int quantCadastroLivro = sc.nextInt();
                        //Condição para entrar no cadastro
                        if(totalLivros + quantCadastroLivro > id.length){
                            System.out.println("A quantidade de livros que você quer cadastrar exede o total do Banco de Dados! \n"+
                                "Quantidade de registros de livros ATUAL é de: \n"+ totalLivros );
                            System.out.printf("E a quantidade máxima de cadastros é de %d \n", id.length);
                                break;
                        }

                        //Cadastro de Livros e condição de entrada do for (cadastro)
                        int limiteLivro = totalLivros + quantCadastroLivro;
                        try{

                            for(int i = totalLivros; i < limiteLivro; i++){
                                //Mensagem Boas vindas
                                System.out.println("Cadastros de Livros");

                                System.out.print("Digite o id do produto: ");
                                id[i] = sc.nextInt();

                                System.out.print("Digite o título do livro: ");
                                titulo[i] = sc.next().toUpperCase();

                                System.out.print("Digite o autor do livro: ");
                                autor[i] = sc.next().toUpperCase();

                                System.out.print("Digite o genero do livro: ");
                                genero[i] = sc.next().toUpperCase();

                                System.out.print("Digite o preço do produto (Padrão 0,00): ");
                                preco[i] = sc.nextDouble();

                                System.out.println("Digite a quantidade de cópias disponiveis desse livro: ");
                                quantidade[i] = sc.nextInt();

                                System.out.print("Esse livro é edição especial (raro)? Se sim digite (S) se não (N): ");
                                String raro = sc.next().toUpperCase();

                                if (raro.equalsIgnoreCase("S")){
                                    raridade[i] = "SIM";
                                }else if (raro.equalsIgnoreCase("N")){
                                    raridade[i] = "Não";
                                }

                            } 

                            totalLivros += quantCadastroLivro;

                        }catch(Exception e){
                            System.out.println("O dado que você colocou no campo é invalido. Preencha novamente!");
                            sc.nextLine();
                        }   

                    }
                    // Cadastro de Usuarios
                    case 2 -> {
                        //Entrada de dados: Quantidade de cadastros nessa entrada
                        System.out.print("Informe quantos cadastros de usuario você deseja fazer: ");
                        int quantCadastroUser = sc.nextInt();
                        
                        //Condição deentrada do cadastro 
                        if(totalUser + quantCadastroUser < idUser.length){
                            System.out.println("A quantidade de Usuarios que você quer cadastrar exede o total do Banco de Dados! \n"+
                                "Quantidade de registros de usuarios ATUAL é de: \n"+ totalUser );
                            System.out.printf("E a quantidade máxima de cadastros é de %d \n", idUser.length);
                                break;
                        }

                        int limiteUser = totalUser + quantCadastroUser;
                        try {
                            
                            for(int i = totalUser; i < limiteUser; i++){

                                //Mensagem Boas Vindas
                                System.out.println("Cadastro de Usuarios");

                                System.out.print("Digite o id do usuario: ");
                                idUser[i] = sc.nextInt();

                                System.out.print("Digite o nome do Usuario: ");
                                nomeUser[i] = sc.next().toUpperCase();

                                System.out.print("Digite o E-mail do Usuario: ");
                                emailUser[i] = sc.next().toLowerCase();

                                System.out.print("Esse usuario é ativo? Se sim digite (S) se não (N): ");
                                String ativo = sc.next().toUpperCase();

                                if (ativo.equalsIgnoreCase("S")){
                                    ativoUser[i] = true;
                                }else if (ativo.equalsIgnoreCase("N")){
                                    ativoUser[i] = false;
                                }

                                System.out.println("Digite quantos livros esse usuario pegou emprestado: ");
                                emprestimosUser[i] = sc.nextInt();

                            }

                            totalUser += quantCadastroUser;

                        } catch(Exception e){
                            System.out.println("O dado que você colocou no campo é invalido. Preencha novamente!");
                            sc.nextLine();
                        }

                    }
                    // Listar todos os livros
                    case 3 -> {

                        if(totalLivros == 0){
                            System.out.println("Nenhum livro foi registrado ainda! \n"+
                                "Registre um agora mesmo no menu!"
                            );
                            break;
                        }

                        for(int i = 0; i < totalLivros; i++){
                            System.out.println();
                            System.out.printf("%d  |  %s  |  %s  |  %s  |  %.2f  |  %d  |  %s   \n", id[i], titulo[i], autor[i], genero[i], preco[i], quantidade[i], raridade[i] );
                            System.out.println();
                        }
                    
                    }
                    //Pesquisar por Gênero
                    case 4 -> {

                        System.out.print("Digite a categoria que você deseja procurar: ");
                        String procuraGenero = sc.next().toUpperCase();

                        boolean encontrou = false;

                        for (int i = 0; i < totalLivros; i++){
                            if(procuraGenero.equalsIgnoreCase(genero[i])){
                                System.out.println();
                                System.err.printf("O gênero %s, foi encontrada \n", procuraGenero);
                                System.out.printf("Id produto: %d \n", id[i]);
                                System.out.printf("Nome produto: %s \n", titulo[i]);
                                System.out.println();
                                encontrou = true;
                            }
                        }

                        if(encontrou != true){
                            System.out.printf("Não foi encontrado o gênero: %s", procuraGenero);
                            break;
                        }

                    }
                    //Relatorio de acervo baixo
                    case 5 -> {

                        System.out.println("Esses livros listados a baixo estão com a quantidade de cópias em 3 unidades ou menos");

                        int totalLivrosBaixos = 0;

                        for(int i = 0; i < totalLivros; i++){
                            if(quantidade[i] <= 3){
                                System.out.println();
                                System.out.printf("Livro: %s \n", titulo[i]);
                                System.out.printf("CAutor: %s \n", autor[i]);
                                System.out.printf("Quantidade de cópias disponíveis: %d \n", quantidade[i]);
                                System.out.println();

                                totalLivrosBaixos++;

                            }else{
                                System.out.println("Não há nenhum Livro a baixo de 3 unidades de cópias na estante!");
                            }
                        }

                    }
                    //Listar Usuários Ativos
                    case 6 -> {

                        System.out.println("Esses Usuarios listados a baixo estão Ativos!");

                        int totalUserAtivo = 0;

                        for(int i = 0; i < totalLivros; i++){
                            if(ativoUser[i] == true){
                                System.out.println();
                                System.out.printf("Usuario: %s \n", nomeUser[i]);
                                System.out.printf("E-mail: %s \n", emailUser[i]);
                                System.out.printf("Quantidade de livros pegos emprestado: %d \n", emprestimosUser[i]);
                                System.out.println();

                                totalUserAtivo++;

                            }else{
                                System.out.println("Não há nenhum Livro a baixo de 3 unidades de cópias na estante!");
                            }
                        }

                    }
                    //Valor total do acervo
                    case 7 -> {

                        System.out.println("Balanço Patrimonial");

                        double totalInvestido = 0;
                    
                        for(int i = 0; i < totalLivros; i++){
                            totalInvestido = preco[i] * quantidade[i];
                        }

                        if(totalInvestido > 0){
                                System.out.printf("Total investido em produtos é: %.2f \n", totalInvestido);

                        }else{
                                System.out.println("Não há nenhum produto no estoque!");
                        }

                    }

                    // Saída do sistema (agradecimento)
                    case 0 -> {

                        System.out.println("Você escolheu sair do sistema!");
                        System.out.println("Muito obrigado pela preferencia :)");
                        return;
                    }

                }

        }

    }
}