package estrutura_de_decisao;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {

        /*
         * 27. Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8
         * caso seja ímpar, imprimir o resultado desta operação.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com um número: ");
        int numero = read.nextInt();

        if (numero % 2 == 0) {
            numero += 5;
            System.out.printf("O número é PAR, e foi somado com 5. \n");
        }

        else {
            numero += 8;
            System.out.printf("O número é ÍMPAR, e foi somado com 8. \n");
        }

        System.out.printf("Número atualizado: %d \n", numero);

        read.close();
    }
}
