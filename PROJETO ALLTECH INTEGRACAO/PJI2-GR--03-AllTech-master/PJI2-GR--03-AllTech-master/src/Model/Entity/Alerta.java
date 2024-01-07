package Model.Entity;

public class Alerta {
	private int codigo;
	private float precoDesejado;
	
	public Alerta(int codigo, float precoDesejado) {
		this.codigo = codigo;
		this.precoDesejado = precoDesejado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPrecoDesejado() {
		return precoDesejado;
	}

	public void setPrecoDesejado(float precoDesejado) {
		this.precoDesejado = precoDesejado;
	}
}
