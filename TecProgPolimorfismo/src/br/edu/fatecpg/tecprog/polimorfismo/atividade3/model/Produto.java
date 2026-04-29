package br.edu.fatecpg.tecprog.polimorfismo.atividade3.model;

public class Produto {

	String nome;
	double preco;
	int quantidade;

	public Produto(String nome) {
		this.nome = nome;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public void exibir() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidade + "\n");
	}
}
