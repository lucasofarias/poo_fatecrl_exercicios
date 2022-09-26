package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {

        /*
         * 47. Calcular o fatorial de um valor que será digitado. Este valor não poderá
         * ser negativo. Enviar mensagem de erro e solicitar o valor novamente, se
         * necessário. Perguntar se o usuário deseja ou não fazer um novo cálculo,
         * consistir a resposta em “S” ou “N”.
         * N! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1))
         * Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120
         */

        Scanner read = new Scanner(System.in);
        char resposta;

        do {

            System.out.println("Calcular o fatorial");
            System.out.println("-------------------");
            System.out.println();

            System.out.printf("Entre com um valor: ");
            int valor = read.nextInt();

            while (valor < 0) {
                System.out.printf("\nPor favor, entre com um valor positivo.\n");
                System.out.printf("Entre com um valor: ");
                valor = read.nextInt();
            }

            int fatorial = 1;

            for (int i = valor; i >= 1; i--) {
                fatorial = fatorial * i;
            }

            System.out.printf("\n%d! = %d\n", valor, fatorial);

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
