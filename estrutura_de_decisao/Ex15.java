package estrutura_de_decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		/*
		 * 15. A partir de três valores que serão digitados, verificar se formam ou não
		 * um triângulo. Em
		 * caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”.
		 * Um triângulo
		 * escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o
		 * eqüilátero,
		 * todos os lados iguais. Para existir triângulo é necessário que a soma de dois
		 * lados
		 * quaisquer seja maior que o outro, isto, para os três lados.
		 */

		Scanner read = new Scanner(System.in);

		System.out.println("Classificação do triângulo");
		System.out.println("--------------------------");
		System.out.println();

		System.out.print("Lado A: ");
		int a = read.nextInt();

		System.out.print("Lado B: ");
		int b = read.nextInt();

		System.out.print("Lado C: ");
		int c = read.nextInt();

		System.out.println();

		if (a + b > c && b + c > a && c + a > b) {
			if (a != b && b != c && c != a) {
				System.out.print("O triângulo é escaleno!");
			}

			else if ((a == b && a != c) || b == c && b != a || c == a && c != b) {
				System.out.print("O triângulo é isósceles!");
			}

			else {
				System.out.print("O triângulo é equilátero!");
			}
		}

		else {

			System.out.println("O triângulo não existe.");
			System.out.println();

			if (a + b <= c) {
				System.out.printf("A soma dos lados A e B não é maior que o lado C. \n");
			}

			else if (b + c <= a) {
				System.out.printf("A soma dos lados B e C não é maior que o lado A. \n");
			}

			else {
				System.out.printf("A soma dos lados A e C não é maior que o lado B. \n");
			}
		}
	}
}
