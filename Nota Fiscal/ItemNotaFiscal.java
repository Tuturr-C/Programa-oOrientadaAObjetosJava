import java.util.Scanner;
public class ItemNotaFiscal{

        private String qtdProduto;
        private String codigo;
        private double valorProduto;
        private String nomeProduto;
        private String un_medida;
        private String numeroProduto;
        private double precoTotal;

        public ItemNotaFiscal(String nomeProduto, String quantidadeProduto, String codigo, String un_medida, String PrecoProduto){
                this.nomeProduto = nomeProduto;
                this.qtdProduto = qtdProduto;
                this.codigo = codigo;
                this.un_medida = un_medida;
                this.valorProduto = valorProduto;
        }
        


        public  void nomeProduto (String name){ // Set Nome Produto
                nomeProduto = name;
        }

        public void codigo (String codigoProd){ // Set Codigo Produto
                codigo = codigoProd;
        }

        public void un_medida (String unidadeMedida){ // Set un Medida
                un_medida = unidadeMedida;
        }

        public void qtdProduto (String produto){ // Set qtd Produto
                qtdProduto = produto;
        }
        public void valorProduto (double valordoProduto){ //
                valorProduto = valordoProduto;
        }
        public void numeroProduto (String contagemProduto){
                numeroProduto = contagemProduto;
        }
        
        public void ValorTotalProduto(double valorTotalProduto) { 
                this.precoTotal = valorTotalProduto;       
        }
        
        public String nomePorduto(){ // Get Nome Produto
                return nomeProduto;
        }

        public String qtdProduto(){ // Get Qtd Produto
                return qtdProduto;
        }

        public String codigo(){ // Get Código
                return codigo;
        }

        public String un_medida(){ // Get Un Medida
                return un_medida;
        }

        public Double valorProduto(){ // Get valor do Produto = 
                return valorProduto;
        }
        public String numeroProduto(){
                return numeroProduto;
        }

        public Double precoTotal(){
                return precoTotal();
        }
              
        

        
        


    
    
}