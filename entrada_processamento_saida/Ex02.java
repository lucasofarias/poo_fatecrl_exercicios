package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Área do quadrado");
		System.out.println("----------------- \n");
		
		System.out.print("Entre com o valor da aresta (m): ");
		double aresta = read.nextDouble();
		
		double area = Math.pow(aresta, 2);
		
		System.out.println();
		System.out.printf("A área do quadrado de aresta %.2f é igual a %.2fm². \n", aresta, area);
	}
}
