package br.com.model;

public class Categoria {
	int cod;
	String descricao;
	boolean status = true;
	
	public Categoria(int cod, String descricao, boolean status) {
		super();
		this.cod = cod;
		this.descricao = descricao;
		this.status = status;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
