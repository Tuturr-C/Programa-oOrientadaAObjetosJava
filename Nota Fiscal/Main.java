import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int quantidadeItens;
        Double valorTotalNotaFiscal = 0.0;

        System.out.printf("Digite a Quantidade de itens:\n" );

        int quantidadeItensInt = scanner.nextInt();
        
        scanner.nextLine();

        for(int i = 1; i <= quantidadeItensInt; i++){

            String numeroProduto, codigo, NomeProduto, qtdProduto, un_medida, PrecoProduto, precoTotal;

           // System.out.printf(" Numero do produto : \n");

            String numeroProdutoString = scanner.nextLine();

           // System.out.printf("O codigo do Produto: \n");

            String codigoString = scanner.nextLine();

            //System.out.printf(" Nome do Produto : \n");

            String nomeProdutoString = scanner.nextLine();

            //System.out.printf("A quantidade de produto: \n");

            String quantidadeProdutoInt = scanner.nextLine();

           // System.out.printf("Unidade de Medida : \n");

            String un_medidaString = scanner.nextLine();

            //System.out.printf("Preço Produto : \n");

            String PrecoProdutoString = scanner.nextLine();

           // System.out.printf("Preço Total : \n");

            String precoTotalString= scanner.nextLine();

            valorTotalNotaFiscal += Double.parseDouble(precoTotalString);

            

            System.out.println("\n--- Resumo do Cadastro ---");
            System.out.printf("Numero Produto: %s \nCódigo: %s \nNome: %s \nQuantidade: %s  \nUnidade: %s \nPreço Produto: %s \nPreço Total: %s \n \n \n", 
                numeroProdutoString, codigoString, nomeProdutoString, quantidadeProdutoInt, un_medidaString, PrecoProdutoString, precoTotalString);
        }

            System.out.printf("VALOR TOTAL DA NOTA FISCAL: R$ %.2f \n", valorTotalNotaFiscal);
           

        scanner.close();


    }

}
