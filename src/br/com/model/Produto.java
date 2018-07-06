package br.com.model;

public class Produto {
	int codBarra;
	double preco;
	String descricao;
	Fornecedor fornecedor;
	//Categoria categoria;
	
	public Produto(int codBarra, double preco, String descricao /*,Fornecedor fornecedor, Categoria categoria*/) {
		super();
		this.codBarra = codBarra;
		this.preco = preco;
		this.descricao = descricao;
		//this.fornecedor = fornecedor;
		//this.categoria = categoria;
	}
	public int getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(int codBarra) {
		this.codBarra = codBarra;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double d) {
		this.preco = d;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/*public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}*/
	@Override
	public String toString() {
		return "Produto [codBarra=" + codBarra + ", preco=" + preco + ", descricao=" + descricao + ", fornecedor="
				+ fornecedor + "]";
	}
}
