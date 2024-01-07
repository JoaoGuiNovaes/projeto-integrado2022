package view;

import javax.swing.JOptionPane;

public class TrataTela {
  public void  entraSistema() {
	  JOptionPane.showMessageDialog(null,
				"\nBem-Vindo à All Tech!");
  }
  public String  obtemProduto() {
	  String codProd = JOptionPane.showInputDialog("Digite o nome do produto que deseja saber o menor preço: ");
	  return codProd;
  }
  public void informaPreco(String mensagem) {
	  JOptionPane.showMessageDialog(null,mensagem);
  }
}
