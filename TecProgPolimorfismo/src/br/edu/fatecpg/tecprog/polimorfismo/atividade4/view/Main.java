package br.edu.fatecpg.tecprog.polimorfismo.atividade4.view;

import br.edu.fatecpg.tecprog.polimorfismo.atividade4.model.*;

public class Main {

	public static void main(String[] args) {

		Pagamento p1 = new Pagamento();
		Pagamento p2 = new PagamentoCartao();
		Pagamento p3 = new PagamentoBoleto();

		p1.processarPagamento();
		p2.processarPagamento();
		p3.processarPagamento();
	}

}
