package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		/* 7. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor
		referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá
		ser devolvido. */
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Valor do produto 1: ");
		double produto1 = read.nextDouble();
		
		System.out.print("Valor do produto 2: ");
		double produto2 = read.nextDouble();
		
		System.out.print("Valor do produto 3: ");
		double produto3 = read.nextDouble();
		
		System.out.print("Valor do produto 4: ");
		double produto4 = read.nextDouble();
		
		System.out.print("Valor do produto 5: ");
		double produto5 = read.nextDouble();
		
		double valorTotal = produto1 + produto2 + produto3 + produto4 + produto5;
		
		System.out.println();
		System.out.printf("Valor a pagar: R$%.2f \n", valorTotal);
		System.out.print("Entre com o valor do pagamento: R$");
		double pagamento = read.nextDouble();
		
		System.out.println();
		
		if(pagamento == valorTotal) {
			System.out.println("O produto foi pago!");
		}
		
		else if (pagamento > valorTotal) {
			double troco = pagamento - valorTotal;
			System.out.println("Produto pago!");
			System.out.printf("Troco: R$%.2f", troco);
		}
		
		else {
			double divida = valorTotal - pagamento;
			System.out.printf("Faltou pagar R$%.2f!", divida);
		}
	}
}
