package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// 3. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Área do triângulo");
		System.out.println("----------------- \n");
		
		System.out.print("Entre com o valor da base (m): ");
		double base = read.nextDouble();
		
		System.out.print("Entre com o valor da altura (m): ");
		double altura = read.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println();
		System.out.printf("A área do triângulo é igual a %.2fm². \n", area);
	}
}
