package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {

        /*
         * 36. Entrar via teclado com um valor (X) qualquer. Travar a digitação, no
         * sentido de aceitar somente valores positivos. Solicitar o intervalo que o
         * programa que deverá calcular a tabuada do valor digitado, sendo que o segundo
         * valor (B), deverá ser maior que o primeiro (A), caso contrário, digitar
         * novamente somente o segundo. Após a validação dos dados, exibir a tabuada do
         * valor digitado, no intervalo decrescente, ou seja, a tabuada de X no
         * intervalo de B para A.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com um valor X: ");
        int x = read.nextInt();

        while (x <= 0) {
            System.out.printf("\nEntre somente com valores positivos! \n");
            System.out.printf("Entre com um valor positivo: ");
            x = read.nextInt();
        }

        System.out.printf("Entre com um valor A: ");
        int a = read.nextInt();

        System.out.printf("Entre com um valor B: ");
        int b = read.nextInt();

        while (b <= a) {
            System.out.printf("\nValor B deve ser maior que A. \n");
            System.out.printf("Entre com um valor B: ");
            b = read.nextInt();
        }

        for (int i = b; i >= a; i--) {
            System.out.printf("%d x %d = %d \n", x, i, x * i);
        }

        read.close();
    }
}
