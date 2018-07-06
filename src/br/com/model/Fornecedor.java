package br.com.model;

public class Fornecedor {
	long cnpj, telefone;
	int cep;
	String razaoSocial,email,cidade,uf;

	public Fornecedor(long cnpj, long telefone, int cep, String razaoSocial, String email, String cidade, String uf) {
		super();
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.cep = cep;
		this.razaoSocial = razaoSocial;
		this.email = email;
		this.cidade = cidade;
		this.uf = uf;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
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
}
