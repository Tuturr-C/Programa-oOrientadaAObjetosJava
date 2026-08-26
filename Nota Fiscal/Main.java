import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int quantidadeItens;

        System.out.printf("Digite a Quantidade de itens:\n" );

        int quantidadeItensInt = scanner.nextInt();

        scanner.nextLine();

        for(int i = 1; i <= quantidadeItensInt; i++){

            String NomeProduto, qtdProduto, codigo, un_medida, PrecoProduto;
      
            System.out.printf(" Nome do Produto : \n");

            String nomeProdutoString = scanner.nextLine();

            System.out.printf("A quantidade de produto: \n");

            String quantidadeProdutoInt = scanner.nextLine();

            System.out.printf("O codigo do Produto: \n");

            String codigoString = scanner.nextLine();

            System.out.printf("Unidade de Medida : \n");

            String un_medidaString = scanner.nextLine();

            System.out.printf("Preço Produto : \n");

            String PrecoProdutoString = scanner.nextLine();

        

            System.out.println("\n--- Resumo do Cadastro ---");
            System.out.printf("Quantidade: %s \nNome: %s \nCódigo: %s \nUnidade: %s \nValor Total: '%s'\n", 
                quantidadeProdutoInt, nomeProdutoString, codigoString, un_medidaString, PrecoProdutoString);
        }
        scanner.close();


    }

}
