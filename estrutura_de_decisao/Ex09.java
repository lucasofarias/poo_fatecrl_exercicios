package estrutura_de_decisao;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		// 9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Menor valor");
		System.out.println("----------- \n");
		
		System.out.print("Entre com o primeiro valor: ");
		double valor1 = read.nextDouble();
		
		System.out.print("Entre com o segundo valor: ");
		double valor2 = read.nextDouble();
		
		System.out.println();
		
		if(valor1 < valor2) {
			System.out.printf("Menor valor: %.2f", valor1);
		}
		
		if(valor2 < valor1) {
			System.out.printf("Menor valor: %.2f", valor2);
		}
	}

}
