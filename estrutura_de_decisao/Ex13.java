package estrutura_de_decisao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		// 13. Entrar via teclado com três valores distintos. Exibir o maior deles.

		Scanner read = new Scanner(System.in);
		
		System.out.println("Maior valor");
		System.out.println("----------- \n");
		
		System.out.print("Entre com o primeiro valor: ");
		double valor1 = read.nextDouble();
		
		System.out.print("Entre com o segundo valor: ");
		double valor2 = read.nextDouble();
		
		System.out.print("Entre com o terceiro valor: ");
		double valor3 = read.nextDouble();
		
		System.out.println();
		
		if(valor1 > valor2 && valor1 > valor3) {
			System.out.printf("Maior valor = %.2f \n", valor1);
		}
		
		else if(valor2 > valor1 && valor2 > valor3) {
			System.out.printf("Maior valor = %.2f \n", valor2);
		}
		
		else {
			System.out.printf("Maior valor = %.2f \n", valor3);
		}
	}
}
