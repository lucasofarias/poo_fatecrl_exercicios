package estrutura_de_decisao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		// 8. Entrar via teclado, com dois valores distintos. Exibir o maior deles.

		Scanner read = new Scanner(System.in);
		
		System.out.println("Maior valor");
		System.out.println("----------- \n");
		
		System.out.print("Entre com o primeiro valor: ");
		double valor1 = read.nextDouble();
		
		System.out.print("Entre com o segundo valor: ");
		double valor2 = read.nextDouble();
		
		System.out.println();
		
		if(valor1 > valor2) {
			System.out.printf("Maior valor: %.2f", valor1);
		}
		
		if(valor2 > valor1) {
			System.out.printf("Maior valor: %.2f", valor2);
		}
	}
}
