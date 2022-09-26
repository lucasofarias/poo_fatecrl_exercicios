package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {

        /*
         * 41. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O
         * valor “N” será digitado, deverá ser positivo, mas menor que cem. Caso o valor
         * não satisfaça a restrição, enviar mensagem de erro e solicitar o valor
         * novamente.
         * A seqüência: 2, 5, 10, 17, 26, ....
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com uma quantidade N: ");
        int n = read.nextInt();

        while (n <= 0) {
            System.out.printf("\nEntre com um valor positivo. \n");
            System.out.printf("Entre com uma quantidade N: ");
            n = read.nextInt();
        }

        int sequencia = 2;
        int soma = 3;

        for (int i = 0; i < n; i++) {
            if (i + 1 == n) {
                System.out.printf("%d\n", sequencia);
            }

            else {
                System.out.printf("%d, ", sequencia);
            }

            sequencia += soma;
            soma += 2;
        }

        read.close();
    }
}
