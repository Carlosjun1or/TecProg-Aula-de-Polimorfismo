package br.edu.fatecpg.tecprog.polimorfismo.atividade1.view;

import br.edu.fatecpg.tecprog.polimorfismo.atividade1.model.*;

public class Main {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Carro();
		Veiculo v3 = new Bicicleta();

		v1.mover();
		v2.mover();
		v3.mover();
	}
}