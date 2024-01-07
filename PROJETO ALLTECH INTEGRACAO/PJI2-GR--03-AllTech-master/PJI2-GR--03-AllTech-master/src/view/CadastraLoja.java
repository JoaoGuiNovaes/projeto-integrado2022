package view;
import javax.swing.JOptionPane;

public class CadastraLoja {

	  public static String  obtemNomeLoja() {
		  String nomeLoja = JOptionPane.showInputDialog("Digite o nome da loja que deseja cadastrar: ");
		  return nomeLoja;
	  }
}
