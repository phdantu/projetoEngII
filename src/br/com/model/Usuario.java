package br.com.model;

public abstract class Usuario {
	String nome, endereco,email,cidade,uf;
	long rg,telefone,dataNasc;
	int id,senha,cep;
	
	public Usuario(String nome, String endereco, String email, String cidade, String uf, long rg, long telefone,
			long dataNasc, int id, int senha, int cep) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.cidade = cidade;
		this.uf = uf;
		this.rg = rg;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.id = id;
		this.senha = senha;
		this.cep = cep;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public long getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(long dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
}
