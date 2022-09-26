package classe_e_atributo;

import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {

		/*
		 * 49. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que
		 * utilize
		 * essa classe para cadastrar 10 produtos em uma lista de produtos. Ao final
		 * exibir apenas os
		 * produtos cujo valor é menor do que 100 reais.
		 */

		Scanner read = new Scanner(System.in);

		Produto[] produto = new Produto[10];

		System.out.println("Cadastro de 10 produtos");
		System.out.println("-----------------------");
		System.out.println();

		for (int i = 0; i < 10; i++) {
			Produto p = new Produto();

			System.out.print("ID: ");
			p.id = read.nextInt();

			System.out.print("Descrição: ");
			p.descricao = read.next();

			System.out.print("Valor: ");
			p.valor = read.nextDouble();

			System.out.print("Quantidade: ");
			p.quantidade = read.nextDouble();

			produto[i] = p;
			System.out.println();
		}

		System.out.println("Lista de produtos com valores menores do que R$100:");

		for (int i = 0; i < 10; i++) {
			if (produto[i].valor < 100.0) {
				System.out.printf("ID: %d \n", produto[i].id);
				System.out.printf("Descrição: %s \n", produto[i].descricao);
				System.out.printf("Valor: %.2f \n", produto[i].valor);
				System.out.printf("Quantidade: %.1f \n", produto[i].quantidade);
			}

			System.out.println();
		}

		read.close();
	}
}
