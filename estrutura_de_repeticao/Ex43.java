package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {

        /*
         * 43. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O
         * valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta. Caso o
         * valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor
         * novamente.
         * 
         * A sequência: 2, 5/8, 10/27, 17/64, ...
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com uma quantidade N: ");
        int n = read.nextInt();

        while (n <= 0 || n >= 50) {
            System.out.printf("\nPor favor, digite um valor positivo e menor que cinquenta.\n");
            System.out.printf("Entre com uma quantidade N: ");
            n = read.nextInt();
        }

        int numerador = 2;
        int denominador = 8;
        int somaNumerador = 3;
        int somaDenominador = 19;

        System.out.printf("%d, ", numerador);

        for (int i = 0; i < n; i++) {
            numerador += somaNumerador;
            somaNumerador += 2;

            if (i + 1 == n) {
                System.out.printf("%d/%d\n", numerador, denominador);
            }

            else {
                System.out.printf("%d/%d, ", numerador, denominador);
            }

            if (denominador >= 27) {
                denominador += somaDenominador + somaDenominador + 1;
                somaDenominador--;
            }

            else {
                denominador += somaDenominador;
                somaDenominador--;
            }
        }

        read.close();
    }
}
