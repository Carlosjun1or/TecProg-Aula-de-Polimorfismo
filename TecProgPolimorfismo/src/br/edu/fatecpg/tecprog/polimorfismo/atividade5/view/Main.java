package br.edu.fatecpg.tecprog.polimorfismo.atividade5.view;

import java.util.Scanner;
import br.edu.fatecpg.tecprog.polimorfismo.atividade5.model.Conversor;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conversor conv = new Conversor();

		System.out.println("=== CONVERSOR ===");
		System.out.println("1 - Celsius para Fahrenheit");
		System.out.println("2 - Km para Milhas");
		System.out.println("3 - Texto para Maiúsculo");

		System.out.print("Escolha uma opção: ");
		int op = sc.nextInt();
		sc.nextLine();

		switch (op) {

		case 1:
			System.out.print("\nDigite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			System.out.println("Resultado: " + conv.converter(celsius));
			break;

		case 2:
			System.out.print("\nDigite a distância em Km: ");
			int km = sc.nextInt();
			System.out.println("Resultado: " + conv.converter(km));
			break;

		case 3:
			System.out.print("\nDigite um texto: ");
			String texto = sc.nextLine();
			System.out.println("Resultado: " + conv.converter(texto));
			break;

		default:
			System.out.println("\nOpção inválida.");
		}

		sc.close();
	}
}