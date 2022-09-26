package estrutura_de_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		/* 10. Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar
		mensagem avisando que os números são idênticos. */
		
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
		
		else if(valor2 > valor1) {
			System.out.printf("Maior valor: %.2f", valor2);
		}
		
		else {
			System.out.println("Os valores são idênticos.");
		}
	}
}
