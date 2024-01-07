package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;

import Model.Entity.Loja;
import Model.Entity.Produtoe;
import Model.util.Conexao;

public class ProdutoDAO {
	public Produtoe save(Produtoe produto) {

		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection = null;  
	
	PreparedStatement stmt = connection.prepareStatement("SELECT produto.nome, Anuncio.redirecionamento, loja.nome as nome_loja, slug(produto.nome) as nome_slug\n"
			+ "FROM anuncio\n"
			+ "INNER JOIN produto \n"
			+ "ON anuncio.codigo_produto = produto.codigo\n"
			+ "INNER JOIN loja \n"
			+ "ON anuncio.codigo_loja = loja.codigo\n"
			+ "WHERE anuncio.codigo_produto = 8;");  

	connection.close();  

		} 	catch(Exception e){
System.out.println(e);
		}  

return produto;
	}
	
   public double pesquisaProduto(String nomeProdutoPesquisa) {
	    double [] codProd1 = {1500, 1000, 500};
	    double [] codProd2 = {1501, 1001, 501};
	    double [] codProd3 = {1520, 1020, 520};
	    double [] codProd4 = {1300, 1300, 300};
	    double menor = 0;
	    
		if (nomeProdutoPesquisa.equals ("p1") ) 
		{
			Arrays.sort(codProd1);
			menor=codProd1[0];
		} 
		else if (nomeProdutoPesquisa.equals("p2") ) 
		{
				Arrays.sort(codProd2);
					menor=codProd2[0];
		} 
		else if (nomeProdutoPesquisa.equals("p3") ) 
		{
					Arrays.sort(codProd3);
						menor=codProd3[0];
		} 
		else 	if (nomeProdutoPesquisa.equals("p4") ) 
		{
						Arrays.sort(codProd4);
							menor=codProd4[0];
		}
		return menor;
   }
}