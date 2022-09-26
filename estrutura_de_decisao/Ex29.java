package estrutura_de_decisao;

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        /*
         * 29. Escreva um algoritmo que leia três valores inteiros e diferentes e
         * mostre-os em ordem decrescente.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com o valor de A: ");
        int a = read.nextInt();

        System.out.printf("Entre com o valor de B: ");
        int b = read.nextInt();

        while (b == a) {
            System.out.printf("\nO valor de B deve ser diferente de A.\n");
            System.out.printf("Entre com o valor de B: ");
            b = read.nextInt();
        }

        System.out.printf("Entre com o valor de C: ");
        int c = read.nextInt();

        while (c == a || c == b) {
            System.out.printf("\nO valor de C deve ser diferente de A e B.\n");
            System.out.printf("Entre com o valor de C: ");
            c = read.nextInt();
        }

        if (a > b && a > c) {
            if (b > c) {
                System.out.printf("Ordem decrescente: %d, %d, %d", a, b, c);
            }

            else {
                System.out.printf("Ordem decrescente: %d, %d, %d", a, c, b);
            }
        }

        else if (b > a && b > c) {
            if (a > c) {
                System.out.printf("Ordem decrescente: %d, %d, %d", b, a, c);
            }

            else {
                System.out.printf("Ordem decrescente: %d, %d, %d", b, c, a);
            }
        }

        else {
            if (a > b) {
                System.out.printf("Ordem decrescente: %d, %d, %d", c, a, b);
            }

            else {
                System.out.printf("Ordem decrescente: %d, %d, %d", c, b, a);
            }
        }
    }

}
