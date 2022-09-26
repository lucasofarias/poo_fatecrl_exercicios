package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		/* Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares.
		   Calcular e exibir o valor correspondente em Reais (R$). */

		Scanner read = new Scanner(System.in);
		
		System.out.println("Cotação do dólar");
		System.out.println("---------------- \n");
		
		System.out.print("Entre com o valor da cotação do dólar: R$");
		double cotacaoDolar = read.nextDouble();
		
		System.out.print("Entre com uma quantidade de dólares: $");
		double dolares = read.nextDouble();
		
		double reais = cotacaoDolar * dolares;
		
		System.out.println();
		System.out.printf("Cotação do dólar: R$%.2f \n", cotacaoDolar);
		System.out.printf("Quantia de dólares: $%.2f \n", dolares);
		System.out.printf("Valor em reais: R$%.2f \n", reais);
	}
}
