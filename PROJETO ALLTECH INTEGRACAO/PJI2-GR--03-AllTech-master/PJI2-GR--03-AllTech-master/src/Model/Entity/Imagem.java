package Model.Entity;

public class Imagem {
	private int codigo;
	private String caminho;
	private char tamanho;
	
	public Imagem(int codigo, String caminho, char tamanho) {
		this.codigo = codigo;
		this.caminho = caminho;
		this.tamanho = tamanho;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	
}
