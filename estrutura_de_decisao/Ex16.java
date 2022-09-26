package estrutura_de_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		/*
		 * 16. Verificar se três valores quaisquer (A, B, C) que serão digitados formam
		 * ou não um
		 * triângulo retângulo. Lembre-se que o quadrado da hipotenusa é igual a soma
		 * dos
		 * quadrados dos catetos.
		 */

		Scanner read = new Scanner(System.in);

		System.out.println("Triângulo retângulo");
		System.out.println("-------------------");
		System.out.println();

		System.out.print("Cateto A: ");
		double a = read.nextInt();

		System.out.print("Cateto B: ");
		double b = read.nextInt();

		System.out.print("Hipotenusa: ");
		double c = read.nextInt();

		double somaCatetosAoQuadrado = Math.pow(a, 2) + Math.pow(b, 2);

		System.out.println();
		System.out.printf("Valor da soma dos quadrados dos catetos = %.2f \n", somaCatetosAoQuadrado);
		System.out.printf("Valor do quadrado da hipotenusa = %.2f \n", Math.pow(c, 2));

		System.out.println();

		if (Math.pow(c, 2) == somaCatetosAoQuadrado) {
			System.out.printf("Os valores %.1f, %.1f e %.1f formam um triângulo. \n", a, b, c);
		}

		else {
			System.out.printf("Os valores %.1f, %.1f e %.1f não formam um triângulo. \n", a, b, c);
		}

		read.close();
	}
}
