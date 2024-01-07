package Model.Entity;

public class Produtoe {
	private int codigo;
	private String nome;
	private String fichaTecnica;
	
	public Produtoe(String nome, String fichaTecnica, int codigo) {
		this.nome = nome;
		this.fichaTecnica = fichaTecnica;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFichaTecnica() {
		return fichaTecnica;
	}
	
	public void setFichaTecnica(String fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
