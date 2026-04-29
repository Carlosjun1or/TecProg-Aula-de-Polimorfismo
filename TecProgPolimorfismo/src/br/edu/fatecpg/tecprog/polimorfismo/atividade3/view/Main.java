package br.edu.fatecpg.tecprog.polimorfismo.atividade3.view;

import br.edu.fatecpg.tecprog.polimorfismo.atividade3.model.Produto;

public class Main {

	public static void main(String[] args) {

		Produto p1 = new Produto("Mouse");
		Produto p2 = new Produto("Teclado", 150.0);
		Produto p3 = new Produto("Monitor", 900.0, 10);

		p1.exibir();
		p2.exibir();
		p3.exibir();
	}
}
