package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {

        /*
         * 44. Entrar via teclado com dez valores positivos. Consistir a digitação e
         * enviar mensagem de erro, se necessário. Após a digitação, exibir:
         * a) O maior valor;
         * b) A soma dos valores;
         * c) A média aritmética dos valores;
         */

        Scanner read = new Scanner(System.in);

        int maiorValor = 0;
        int soma = 0;
        double media;

        for (int i = 0; i < 10; i++) {
            System.out.printf("[%d] Entre com um valor: ", i + 1);
            int n = read.nextInt();

            while (n <= 0) {
                System.out.printf("\nPor favor, digite um valor positivo.\n");
                System.out.printf("Entre com uma quantidade N: ");
                n = read.nextInt();

                System.out.println();
            }

            if (n > maiorValor) {
                maiorValor = n;
            }

            soma += n;
        }

        media = soma / 10.0;

        System.out.println();

        System.out.printf("--> Maior valor: %d\n", maiorValor);
        System.out.printf("--> Soma dos valores: %d\n", soma);
        System.out.printf("--> Média dos valores: %.2f\n", media);

        read.close();
    }
}
