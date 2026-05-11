
import java.util.Scanner;

public class SCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Boas vindas ao Sistema Gerenciador de Estoque!");

        // "Banco de dados" Parametrização
        int[] idProd = new int[50];
        String[] nomeProd = new String[50];
        String[] categoriaProd = new String[50];
        double[] precoProd = new double[50];
        int[] quantidadeProd = new int[50];
        String[] perecivelProd = new String[50];

        // total de registros nos vetores
        int totalCadastros = 0;

        // Entrada do sistema
        System.out.print("Para iniciar o menu digite (S): ");
        String escolha = sc.next().toUpperCase();

        while(escolha.equalsIgnoreCase("S")){
            // Menu de funcionalidades
            System.out.print(" Menu de funcionalidades: \n"+
                "1. Cadastrar Produtos \n"+
                "2. Listar todos os produtos \n"+
                "3. Pesquisar por categoria \n"+
                "4. Relatório de estoque baixo \n"+
                "5. Balanço Patrimonial \n"+
                "0. Sair \n"+
                "Escolha sua funcionalidade digitando o número correspondente: ");
                int menu = sc.nextInt();
            
            switch(menu){
                //Cadastro de Produtos 
                case 1 -> {
                    // Condição de entrada do for
                    System.out.println("Informe quantos produtos você deseja cadastrar: ");
                    int quantCadastro = sc.nextInt();

                    if(totalCadastros + quantCadastro > idProd.length){
                        System.out.println("A quantidade de produtos que você quer cadastrar exede o total do Banco de Dados! \n"+
                            "Quantidade de registros ATUAIS é de: \n"+ totalCadastros );
                        System.out.println("E a quantidade máxima de cadastros é de 50");
                            break;
                    }

                    // cadastro de produtos MUDAR0
                    int limite = totalCadastros + quantCadastro;
                    try{
                        for(int i = totalCadastros; i < limite; i++){

                            System.out.println(" Cadastro de Produtos ");

                            System.out.print("digite é o id do produto (número de identificação único): ");
                            idProd[i] = sc.nextInt();

                            System.out.print("Informe o nome do produto (Troque o espaço por -): ");
                            nomeProd[i] = sc.next().toUpperCase();

                            System.out.print("Informe a categoria desse produto: ");
                            categoriaProd[i] = sc.next().toUpperCase();

                            System.out.print("Digite o preço do produto (digite no padrão 0,00 com virgula): ");
                            precoProd[i] = sc.nextDouble();

                            System.out.print("Informe a quantidade em estoque desse produto: ");
                            quantidadeProd[i] = sc.nextInt();

                            System.out.print("Esse produto é perecivel digite (S) ou (N): ");
                            String restPerecivel = sc.next().toUpperCase();

                            if (restPerecivel.equalsIgnoreCase("S")){
                                perecivelProd[i] = "SIM";
                            }else if (restPerecivel.equalsIgnoreCase("N")){
                                perecivelProd[i] = "Não";
                            }

                        }

                        totalCadastros += quantCadastro;
                   }catch(Exception e){
                    System.out.println("O dado que você colocou no campo é invalido. Preencha novamente!");
                    sc.nextLine();
                   }

                }
                // Listagem de todos os produtos 
                case 2 -> {
                    if(totalCadastros == 0){
                        System.out.println("Nenhum produto foi cadastrado!");
                        break;
                    }
                    System.out.println("id  |  Nome  |  Categoria  |  Preço  |  Quantidade  |  Precivel");
                    System.out.println();
                    for(int i = 0; i < totalCadastros; i++){
                        System.out.printf("%d  |  %s  |  %s  |  %.2f  |  %d  |  %s \n", idProd[i], nomeProd[i], categoriaProd[i], precoProd[i], quantidadeProd[i], perecivelProd[i]);
                        System.out.println();
                    }
                }
                // Listagem por categoria
                case 3 -> {
                    
                    System.out.print("Digite a categoria que você deseja procurar: ");
                    String procuraCatego = sc.next().toUpperCase();

                    boolean encontrou = false;

                    for (int i = 0; i < totalCadastros; i++){
                        if(procuraCatego.equalsIgnoreCase(categoriaProd[i])){
                            System.out.println();
                            System.err.printf("A categoria %s, foi encontrada \n", procuraCatego);
                            System.out.printf("Id produto: %d \n", idProd[i]);
                            System.out.printf("Nome produto: %s \n", nomeProd[i]);
                            System.out.println();
                            encontrou = true;
                        }
                    }

                    if(encontrou != true){
                        System.out.printf("Não foi encontrada a categoria: %s", procuraCatego);
                        break;
                    }
                } 
                // Lista de produtos com estoque baixo 
                case 4 -> {
                    System.out.println("Esses produtos listados a baixo estão com o estoque com 5 unidades ou menos");

                    int totalProdutosBaixos = 0;

                    for(int i = 0; i < totalCadastros; i++){
                        if(quantidadeProd[i] <= 5){
                            System.out.println();
                            System.out.printf("Produto: %s \n", nomeProd[i]);
                            System.out.printf("Categoria: %s \n", categoriaProd[i]);
                            System.out.printf("Quantidade em estoque: %d \n", quantidadeProd[i]);
                            System.out.println();

                            totalProdutosBaixos++;
                        }else{
                            System.out.println("Não há nenhum produto a baixo de 5 unidades no estoque!");
                        }
                    }
                }
                // Balanço patrimonial (Total investido)
                case 5 -> {
                    System.out.println("Balanço Patrimonial");

                    double totalInvestido = 0;
                
                    for(int i = 0; i < totalCadastros; i++){
                        totalInvestido = precoProd[i] * quantidadeProd[i];
                    }

                    if(totalInvestido > 0){
                            System.out.printf("Total investido em produtos é: %.2f \n", totalInvestido);

                    }else{
                            System.out.println("Não há nenhum produto no estoque!");
                    }

                }
                // Saída do sistema (agradecimento)
                case 6 -> {

                    System.out.println("Você escolheu sair do sistema!");
                    System.out.println("Muito obrigado pela preferencia :)");
                    return;

                }

            }

        }
    
    }
}