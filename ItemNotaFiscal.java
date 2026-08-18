import java.util.Scanner;
public class ItemNotaFiscal{

        private String qtdProduto;
        private String codigo;
        private double valorProduto;
        private String nomeProduto;
        private String un_medida;
        private double ValorTotalProduto;

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
        
        public void ValorTotalProduto(double valorTotalProduto) { 
                ValorTotalProduto = valorTotalProduto;       
        }
        
        public String nomePorduto(){ // Get Nome Produto
                return nomeProduto;
        }

        public String qtdProduto(){
                return qtdProduto;
        }

        public String codigo(){
                return codigo;
        }

        public String un_medida(){
                return un_medida;
        }

        public Double valorProduto(){
                return valorProduto;
        }

        public Double valorTotalProduto(){
                return valorTotalProduto();
        }
              
        

        
        


    
    
}