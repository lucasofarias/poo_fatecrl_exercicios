package estrutura_de_decisao;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {

        /*
         * 30. Elabore um algoritmo que calcule o que deve ser pago por um produto,
         * considerando o preço normal de etiqueta e a escolha da condição de pagamento.
         * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
         * escolhida e efetuar o cálculo adequado e exibir o valor a ser pago no final.
         * 
         * Código Condição de pagamento
         * 1 À vista em dinheiro ou cheque, recebe 10% de desconto
         * 2 À vista no cartão de crédito, recebe 15% de desconto
         * 3 Em duas vezes, preço normal de etiqueta sem juros
         * 4 Em quatro vezes, preço normal de etiqueta mais juros de 10%
         */

        Scanner read = new Scanner(System.in);

        double precoFinal = 0;
        double parcela = 0;

        System.out.printf("Preço do produto: R$");
        double preco = read.nextDouble();

        System.out.println();

        System.out.println("Forma de pagamento");
        System.out.println("------------------");
        System.out.println("1) À vista em dinheiro ou cheque (10% de desconto)");
        System.out.println("2) À vista no cartão de crédito (15% de desconto)");
        System.out.println("3) Em duas vezes (sem juros)");
        System.out.println("4) Em quatro vezes (juros de 10%)");
        System.out.println();

        System.out.printf("Opção --> ");

        int formaDePagamento = read.nextInt();

        switch (formaDePagamento) {
            case 1:
                precoFinal = preco - preco * 0.10;
                break;

            case 2:
                precoFinal = preco - preco * 0.15;
                break;

            case 3:
                precoFinal = preco;
                parcela = precoFinal / 2.0;
                break;

            case 4:
                precoFinal = preco + preco * 0.10;
                parcela = precoFinal / 4.0;
                break;
        }

        System.out.println();
        System.out.printf("Preço total = R$%.2f \n", precoFinal);

        if (formaDePagamento == 3) {
            System.out.printf("Parcelado em 2x de R$%.2f \n", parcela);
        }

        else if (formaDePagamento == 4) {
            System.out.printf("Parcelado em 4x de R$%.2f \n", parcela);
        }

        read.close();
    }
}
