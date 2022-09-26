package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {

        /*
         * 50. Elabore um programa que apresente os números pares maiores que 10 no
         * intervalo fechado [A, B]. Sendo que A e B serão números inteiros escolhidos
         * pelo usuário.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com o valor inicial do intervalo: ");
        int valorInicial = read.nextInt();

        System.out.printf("Agora entre com o valor final do intervalo: ");
        int valorFinal = read.nextInt();

        System.out.printf("Números pares maiores que 10 no intervalo [%d, %d]:\n", valorInicial, valorFinal);

        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i % 2 == 0 && i > 10) {
                System.out.printf("%d ", i);
            }
        }

        read.close();
    }
}
