package br.com.model;

public class Cliente {
	
	long cpf,dataNasc;
	String nome;
	
	public Cliente(long cpf, long dataNasc, String nome) {
		super();
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.nome = nome;
	}
	
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(long dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", dataNasc=" + dataNasc + ", nome=" + nome + "]";
	}
	
}
