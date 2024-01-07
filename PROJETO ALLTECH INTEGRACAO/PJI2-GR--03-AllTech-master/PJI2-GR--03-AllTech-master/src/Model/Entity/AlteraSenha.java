package Model.Entity;

public class AlteraSenha {
	private int codigo;
	private String codigoVerificacao;
	private String geradaEm;
	private boolean utilizada;
	
	public AlteraSenha(String codigoVerificacao, String geradaEm, boolean utilizada, int codigo) {
		this.codigoVerificacao = codigoVerificacao;
		this.geradaEm = geradaEm;
		this.utilizada = utilizada;
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getCodigoVerificacao() {
		return codigoVerificacao;
	}

	public void setCodigoVerificacao(String codigoVerificacao) {
		this.codigoVerificacao = codigoVerificacao;
	}

	public String getGeradaEm() {
		return geradaEm;
	}

	public void setGeradaEm(String geradaEm) {
		this.geradaEm = geradaEm;
	}

	public boolean isUtilizada() {
		return utilizada;
	}

	public void setUtilizada(boolean utilizada) {
		this.utilizada = utilizada;
	}
}
