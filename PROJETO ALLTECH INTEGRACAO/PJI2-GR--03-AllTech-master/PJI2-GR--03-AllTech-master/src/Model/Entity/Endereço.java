package Model.Entity;

public class Endereço {
	private int codigo;
	private String rua;
	private String cidade;
	private String estado;
	private String numeroCasa;
	private String cep;
	private String complemento;
	
	public Endereço(int codigo, String rua, String cidade, String estado, String numeroCasa, String cep,
			String complemento) {
		this.codigo = codigo;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.numeroCasa = numeroCasa;
		this.cep = cep;
		this.complemento = complemento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
