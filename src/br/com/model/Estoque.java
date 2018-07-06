package br.com.model;

public class Estoque {
	int quantidade, idProd;
	Produto produto;
	public Estoque(int quantidade, int idProd, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.idProd = idProd;
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getIdProd() {
		return idProd;
	}
	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
