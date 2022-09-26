package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {

        /*
         * 42. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O
         * valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta. Caso o
         * valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor
         * novamente.
         * 
         * A sequência: 1/2, 2/3, 3/4, 4/5, ...
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com uma quantidade N: ");
        int n = read.nextInt();

        while (n <= 0 || n >= 50) {
            System.out.printf("\nPor favor, digite um valor positivo e menor que cinquenta.\n");
            System.out.printf("Entre com uma quantidade N: ");
            n = read.nextInt();
        }

        int valor = 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("%d/", valor);

            valor++;

            if (i + 1 == n) {
                System.out.printf("%d", valor);
            }

            else {
                System.out.printf("%d, ", valor);
            }
        }

        read.close();
    }
}
