package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {

        /*
         * 46. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa
         * a quantidade de números) será digitado, deverá ser positivo, mas menor que
         * vinte. Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e
         * solicitar o valor novamente. Após a digitação dos “N” valores, exibir:
         * a) O maior valor;
         * b) O menor valor;
         * c) A soma dos valores;
         * d) A média aritmética dos valores;
         * e) A porcentagem de valores que são positivos;
         * f) A porcentagem de valores negativos;
         * 
         * Após exibir os dados, perguntar ao usuário se deseja ou não uma nova execução
         * do programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e
         * encerrar o programa em função dessa resposta.
         */

        Scanner read = new Scanner(System.in);

        char resposta;

        do {
            int maiorValor = 0;
            int menorValor = 0;
            int valorPositivo = 0;
            int valorNegativo = 0;
            int soma = 0;

            System.out.printf("Entre com uma quantidade N: ");
            int n = read.nextInt();

            while (n <= 0 || n >= 20) {
                System.out.printf("\nPor favor, digite um valor positivo e menor que vinte.\n");
                System.out.printf("Entre com uma quantidade N: ");
                n = read.nextInt();

                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < n; i++) {
                System.out.printf("[%d] Entre com um valor: ", i + 1);
                int valor = read.nextInt();

                if (valor > maiorValor) {
                    maiorValor = valor;
                }

                if (i == 0) {
                    menorValor = valor;
                }

                else {
                    if (valor < menorValor) {
                        menorValor = valor;
                    }
                }

                if (valor >= 0) {
                    valorPositivo++;
                }

                else {
                    valorNegativo++;
                }

                soma += valor;
            }

            double media = (double) soma / n;
            double porcentagemValoresPositivos = (double) valorPositivo / n * 100;
            double porcentagemValoresNegativos = (double) valorNegativo / n * 100;

            System.out.println();

            System.out.printf("--> Maior valor: %d\n", maiorValor);
            System.out.printf("--> Menor valor: %d\n", menorValor);
            System.out.printf("--> Soma dos valores: %d\n", soma);
            System.out.printf("--> Média aritmética dos valores: %.2f\n", media);
            System.out.printf("--> Porcentagem de valores positivos: %.1f%% \n", porcentagemValoresPositivos);
            System.out.printf("--> Porcentagem de valores negativos: %.1f%% \n\n", porcentagemValoresNegativos);

            System.out.printf("Deseja executar o programa novamente? (S/N): ");
            resposta = read.next().charAt(0);

            while (resposta != 'S' && resposta != 's' && resposta != 'N' && resposta != 'n') {
                System.out.printf("\nDigite apenas 'S' ou 'N'. \n");
                System.out.printf("Deseja executar o programa novamente? (S/N): ");
                resposta = read.next().charAt(0);
            }

            System.out.println();

            if (resposta == 'N' || resposta == 'n') {
                System.out.printf("Fim... \n\n");
            }

        } while (resposta == 'S' || resposta == 's');

        read.close();
    }
}
