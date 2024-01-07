package Model.Entity;

public class Anuncio extends Produtoe {
	private int codigo1;
	private boolean destaque;
	private String redirecionamento;

	public Anuncio(String nome, String fichaTecnica, int codigo, int codigo1, boolean destaque,
			String redirecionamento) {
		super(nome, fichaTecnica, codigo);
		this.codigo1 = codigo1;
		this.destaque = destaque;
		this.redirecionamento = redirecionamento;
	}

	public boolean getDestaque() {
		return destaque;
	}

	public void setDestaque(boolean destaque) {
		this.destaque = destaque;
	}

	public String getRedirecionamento() {
		return redirecionamento;
	}

	public void setRedirecionamento(String redirecionamento) {
		this.redirecionamento = redirecionamento;
	}

	public int getCodigo1() {
		return codigo1;
	}

	public void setCodigo1(int codigo1) {
		this.codigo1 = codigo1;
	}
	
}
