package Controller;


import java.sql.PreparedStatement;

import Model.Produto.Produto;
import Model.DAO.*;
import Model.Entity.Loja;
import Model.util.Conexao;
import view.TrataTela;
import view.CadastraLoja;

public class ComparaApp {
	private static String nomeLoja;

	public static void main(String[] args) {
			TrataTela tela = new TrataTela();
			tela.entraSistema();
			
			String produtoInformado = tela.obtemProduto();
			
			Produto prodNegocio = new Produto();
			
			String mensagem =prodNegocio.verificaPreco(produtoInformado);
			
			tela.informaPreco(mensagem); 
			
			Conexao conn = new Conexao();
			
			conn.getConexao();
			
			CadastraLoja cadLoja = new CadastraLoja();
			
			cadLoja.obtemNomeLoja();
			
			Loja loja = new Loja(nomeLoja);
			
			LojaDAO lojaDAO = new LojaDAO();
			
			lojaDAO.save(loja);
			
	}

	  }	 



