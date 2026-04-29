package br.edu.fatecpg.tecprog.polimorfismo.atividade2.view;

import br.edu.fatecpg.tecprog.polimorfismo.atividade2.model.Calculadora;

public class Main {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();

		System.out.println("Soma de 2 inteiros: " + calc.somar(5, 10));
		System.out.println("Soma de 3 inteiros: " + calc.somar(2, 3, 4));
		System.out.println("Soma de 2 doubles: " + calc.somar(2.5, 3.7));
	}
}