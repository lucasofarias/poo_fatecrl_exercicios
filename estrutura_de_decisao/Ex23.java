package estrutura_de_decisao;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {

        /*
         * 23. Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma
         * de A + B é menor que C.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com o valor A: ");
        double valorA = read.nextDouble();

        System.out.printf("Entre com o valor B: ");
        double valorB = read.nextDouble();

        System.out.printf("Entre com o valor C: ");
        double valorC = read.nextDouble();

        if (valorA + valorB < valorC) {
            System.out.printf("A soma de %.2f (A) + %.2f (B) é menor que %.2f (C). \n", valorA, valorB, valorC);
        }

        else {
            System.out.printf("A soma de %.2f (A) + %.2f (B) é maior que %.2f (C). \n", valorA, valorB, valorC);
        }

        read.close();
    }
}
