package br.com.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.model.Cliente;
import br.com.model.Produto;
import br.com.model.Relatorio;
import br.com.model.Venda;
import br.com.util.Console;

public class Main {
	static Relatorio venda = new Relatorio();
	static ArrayList<Relatorio> relatorio = new ArrayList();
	static ArrayList<Produto> produto = new ArrayList();
	static ArrayList<Cliente> cliente = new ArrayList();
	public static void main(String[] args) {
		Produto prodTest = new Produto(23132, 55.65, null);
		Produto prodTest2 = new Produto(32113, 575.65, null);
		Produto prodTest3 = new Produto(23223132, 54.65, null);
		Produto prodTest4 = new Produto(23131232, 5.65, null);
		produto.add(prodTest);
		produto.add(prodTest2);
		produto.add(prodTest3);
		produto.add(prodTest4);
		
		Cliente cliTest = new Cliente(23151, 14011990, "Danton");
		Cliente cliTest2 = new Cliente(234234, 24031990, "Guilherme");
		Cliente cliTest3 = new Cliente(54323151, 14051985, "Ricardo");
		Cliente cliTest4 = new Cliente(3453453, 27081990, "Fernanda");
		cliente.add(cliTest);
		cliente.add(cliTest2);
		cliente.add(cliTest3);
		cliente.add(cliTest4);
		
		mainProgram();
	}

	private static void mainProgram() {
		Scanner a = new Scanner(System.in);
		System.out.println();
		System.out.println("1 - Retirar relatorio de vendas");
		System.out.println("2 - Realizar vendas");
		System.out.println("3 - Cadastrar Produto");
		System.out.println("4 - Cadastrar Cliente");
		System.out.println("5 - Mostrar produtos");
		System.out.println("6 - Mostrar clientes");
		int opcao = a.nextInt();
		if(opcao > 6 || opcao < 0) {
			System.out.println("Valor incorreto;");
			mainProgram();
		}
		switch(opcao) {
		case 1:
			for(int i=0;i<venda.retornaTamanho();i++) {
				System.out.println(venda.toString(i));
			}
			mainProgram();
			break;
		case 2:
			realizarVenda();
			mainProgram();
			break;
		case 3:
			cadastrarProduto();
			mainProgram();
			break;
		case 4:
			cadastrarCliente();
			mainProgram();
			break;
		case 5:
			for(int i=0;i<produto.size();i++) {
				System.out.println(produto.get(i).toString());
			}
			mainProgram();
			break;
		case 6:
			for(int i=0;i<cliente.size();i++) {
				System.out.println(cliente.get(i).toString());
			}
			mainProgram();
			break;
		}
	}

	private static void realizarVenda() {
		Scanner e = new Scanner(System.in);
		Console console = new Console();
		long cpfCliente;
		int codBarra;
		Cliente client = null;
		Produto prodt = null;
		System.out.println("Digite CPF do Cliente: ");
		cpfCliente = console.scanInt(e);
		
		for(int i=0;i<produto.size();i++) {
			System.out.println(produto.get(i).toString());
		}
		System.out.println();
		System.out.println("Digite Codigo do Produto: ");
		codBarra = console.scanInt(e);
		System.out.println("CPF CLIENTE "+cpfCliente);
		System.out.println("CPF PRODUTO "+codBarra);
		if(verificaSeClienteEstaCadastrado(cpfCliente)) {
			if(verificaSeProdutoEstaCadastrado(codBarra)) {
				client = retornaCliente(cpfCliente);
				prodt = retornaProduto(codBarra);
				if(client != null && prodt != null){
					venda.addVenda(client, prodt);
					System.out.println("Venda realizada e inserido no relatorio");
				}else {
					System.out.println("Nao foi localizado");
				}
			}else {
				System.out.println("Produto nao esta cadastrado.");
			}
		}else {
			System.out.println("Cliente nao esta cadastrado.");
		}
		
	}

	private static boolean verificaSeProdutoEstaCadastrado(int codBarra) {
		for(int i=0;i<produto.size();i++) {
			if(produto.get(i).getCodBarra() == codBarra) { 
				return true;
			}
		}
		return false;
	}

	private static boolean verificaSeClienteEstaCadastrado(long cpfCliente) {
		for(int i=0;i<cliente.size();i++) {
			if(cliente.get(i).getCpf() == cpfCliente) { 
				return true;
			}
		}
		return false;
	}
	private static Cliente retornaCliente(long cpf) {
		for(int i=0;i<cliente.size();i++) {
			if(cliente.get(i).getCpf() == cpf) { 
				return cliente.get(i);
			}
		}
		return null;	
	}
	private static Produto retornaProduto(int cod) {
		for(int i=0;i<produto.size();i++) {
			if(produto.get(i).getCodBarra() == cod) { 
				return produto.get(i);
			}
		}
		return null;
	}
	private static void cadastrarProduto() {
		Scanner e = new Scanner(System.in);
		Console console = new Console();
		Produto prod = new Produto(0, 0, null);
		System.out.println("Cod de Barra: ");
		prod.setCodBarra(console.scanInt(e));
		System.out.println("Preco: (use virgula)");
		prod.setPreco(console.scanDouble(e));
		System.out.println("Descrição:  ");
		prod.setDescricao(console.scanString(e));
		if(prod.getCodBarra() != 0) {
			if(verificaSeProdutoEstaCadastrado(prod.getCodBarra())) { 
				System.out.println("Cod de Barra ja Cadastrado;");
				return;
			}else {
				produto.add(prod);
				System.out.println("Cadastrado com sucesso");
			}
		}else {
			System.out.println("ERRO");
			return;
		}
		
	}

	private static void cadastrarCliente() {
		Scanner e = new Scanner(System.in);
		Console console = new Console();
		Cliente cli = new Cliente(0, 0, null);
		System.out.println("CPF: ");
		cli.setCpf(console.scanInt(e));
		System.out.println("Data Nascimento (somente numeros): ");
		cli.setDataNasc(console.scanInt(e));
		System.out.println("Nome:  ");
		cli.setNome(console.scanString(e));
		if(cli.getCpf() != 0) {
				if(verificaSeClienteEstaCadastrado(cli.getCpf())) { 
					System.out.println("Cod de Barra ja Cadastrado;");
					return;
				}else {
					cliente.add(cli);
					System.out.println("Cadastrado com sucesso");
					return;
				}
		}else {
			System.out.println("ERRO");
			return;
			
		}
		
		
	}

}
