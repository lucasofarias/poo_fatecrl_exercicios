package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		// 4. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Média aritmética");
		System.out.println("---------------- \n");
		
		System.out.print("Primeiro valor: ");
		int valor1 = read.nextInt();
		
		System.out.print("Segundo valor: ");
		int valor2 = read.nextInt();
		
		System.out.print("Terceiro valor: ");
		int valor3 = read.nextInt();
		
		System.out.print("Quarto valor: ");
		int valor4 = read.nextInt();
		
		double media = (valor1 + valor2 + valor3 + valor4) / 4.0;
		
		System.out.println();
		System.out.printf("A média aritmética dos valores %d, %d, %d e %d resulta em %.2f. \n", valor1, valor2, valor3, valor4, media);
	}
}
