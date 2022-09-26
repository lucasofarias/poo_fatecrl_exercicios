package classe_e_atributo;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {

		/*
		 * 48. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que
		 * utilize
		 * essa classe para cadastrar 5 clientes em uma lista de clientes. Ao final
		 * exibir apenas os
		 * clientes que tem mais de 18 anos.
		 */

		Scanner read = new Scanner(System.in);

		Cliente[] cliente = new Cliente[5];

		System.out.println("Cadastro de 5 clientes");
		System.out.println("----------------------");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			Cliente c = new Cliente();

			System.out.printf("Cliente #%d \n\n", i + 1);

			System.out.print("ID: ");
			c.id = read.nextInt();

			System.out.print("Nome: ");
			c.nome = read.next();

			System.out.print("Idade: ");
			c.idade = read.nextInt();

			System.out.print("E-mail: ");
			c.email = read.next();

			cliente[i] = c;
			System.out.println();
		}

		System.out.println("Clientes maiores de 18 anos:");

		for (int i = 0; i < 5; i++) {
			if (cliente[i].idade > 18) {
				System.out.printf("ID: %s \n", cliente[i].id);
				System.out.printf("Nome: %s \n", cliente[i].nome);
				System.out.printf("Idade: %d \n", cliente[i].idade);
				System.out.printf("E-mail: %s \n", cliente[i].email);
			}

			System.out.println();
		}

		read.close();
	}
}
