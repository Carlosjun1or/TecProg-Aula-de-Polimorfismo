package br.edu.fatecpg.tecprog.polimorfismo.atividade4.model;

public class PagamentoBoleto extends Pagamento {

	@Override
	public void processarPagamento() {
		System.out.println("\nProcessando pagamento via Boleto Bancário");
	}
}
