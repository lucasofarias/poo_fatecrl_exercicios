package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Área do retângulo");
		System.out.println("----------------- \n");
		
		System.out.print("Entre com a base do retângulo (m): ");
		double base = read.nextDouble();
		
		System.out.print("Entre com a altura do retângulo (m): ");
		double altura = read.nextDouble();
		
		double area = base * altura;
		
		System.out.println();
		System.out.printf("A área do retângulo %.2f x %.2f é igual a %.2fm². \n", base, altura, area);
	}
}