package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		/* 5. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua
		      temperatura equivalente em Fahrenheit. */
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Conversor de temperatura (°C para °F)");
		System.out.println("------------------------------------- \n");
		
		System.out.print("Entre com o valor da temperatura em °C: ");
		int celsius = read.nextInt();
		
		int fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println();
		System.out.printf("A temperatura %d°C equivale a temperatura %d°F \n", celsius, fahrenheit);
	}
}
