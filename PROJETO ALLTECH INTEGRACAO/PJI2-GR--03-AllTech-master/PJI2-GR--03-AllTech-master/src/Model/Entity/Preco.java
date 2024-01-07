package Model.Entity;

public class Preco {
	private int codigo;
	private int quatidadeParcelas;
	private float precoParcela;
	
	public Preco(int codigo, int quatidadeParcelas, float precoParcela) {
		this.codigo = codigo;
		this.quatidadeParcelas = quatidadeParcelas;
		this.precoParcela = precoParcela;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuatidadeParcelas() {
		return quatidadeParcelas;
	}

	public void setQuatidadeParcelas(int quatidadeParcelas) {
		this.quatidadeParcelas = quatidadeParcelas;
	}

	public float getPrecoParcela() {
		return precoParcela;
	}

	public void setPrecoParcela(float precoParcela) {
		this.precoParcela = precoParcela;
	}
}
