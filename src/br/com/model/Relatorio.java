package br.com.model;

import java.util.ArrayList;

public class Relatorio {
	private ArrayList<Cliente> cliente = new ArrayList();
	private ArrayList<Produto> produto = new ArrayList();
	public Relatorio() {
		
	}
	public ArrayList<Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Produto> getProduto() {
		return produto;
	}
	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}
	public int retornaTamanho() {
		return cliente.size();
	}
	public void addVenda(Cliente cli,Produto prod) {
		if(prod != null && cli != null) {
			this.produto.add(prod);
			this.cliente.add(cli);
		}else {
			System.out.println("Dados invalidos - Produto ou Vendedor");
		}
	}
	public String toString(int i) {
		return "Relatorio [cliente=" + cliente.get(i) + ", produto=" + produto.get(i) + "]";
	}
	
	
	
}
