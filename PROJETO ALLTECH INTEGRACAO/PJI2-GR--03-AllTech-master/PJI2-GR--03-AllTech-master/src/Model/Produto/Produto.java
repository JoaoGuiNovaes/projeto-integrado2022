package Model.Produto;

import Model.DAO.ProdutoDAO;

public class Produto {
   public String verificaPreco(String codP) {
	   
	   ProdutoDAO  prod = new ProdutoDAO();
	   	  
	   double valor = prod.pesquisaProduto(codP);
	   
	   String mensagemFormatada = "O melhor preco :"+valor;
	   
	   return  (mensagemFormatada); 
	   
   }
}
