package estrutura_de_decisao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		/* 11. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão
		digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”. */
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Área do retângulo");
		System.out.println("----------------- \n");
		
		System.out.print("Entre com a base do retângulo (m): ");
		double base = read.nextDouble();
		
		System.out.print("Entre com a altura do retângulo (m): ");
		double altura = read.nextDouble();
		
		double area = base * altura;
		
		System.out.println();
		System.out.printf("A área do retângulo é igual a %.2fm². \n", area);
		
		if(area > 100.0) {
			System.out.println("Terreno grande.");
		}
	}
}
