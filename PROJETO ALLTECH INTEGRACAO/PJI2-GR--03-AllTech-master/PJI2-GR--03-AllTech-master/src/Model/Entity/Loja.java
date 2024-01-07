package Model.Entity;

public class Loja {
private int codigo;
private String nome;
private boolean selo_qualidade;

public Loja(String nome) {
	this.nome = nome;
	selo_qualidade = false;
	}

public boolean getSelo_qualidade() {
	return selo_qualidade;
}

public void setSelo_qualidade(boolean selo_qualidade) {
	this.selo_qualidade = selo_qualidade;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
}
