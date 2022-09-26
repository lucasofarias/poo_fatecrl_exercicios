package estrutura_de_decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		/* 14. Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se
		       esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura². */

		Scanner read = new Scanner(System.in);
		
		System.out.println("Cálculo do IMC");
		System.out.println("--------------");
		System.out.println();
		
		System.out.print("Entre com o peso: ");
		double peso = read.nextDouble();
		
		System.out.print("Entre com a altura: ");
		double altura = read.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println();
		
		if(imc < 20) {
			System.out.println("Você está abaixo do peso.");
		}
		
		else if(imc >= 20 && imc < 25) {
			System.out.println("Você está com o peso ideal.");
		}
		
		else {
			System.out.println("Você está acima do peso.");
		}
	}

}
