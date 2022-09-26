package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {

        /*
         * 48. Crie um programa em que o usuário entre com um número inteiro qualquer, e
         * o programa imprima os 20 números subsequentes ao que foi digitado pelo
         * usuário
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com um número inteiro: ");
        int numero = read.nextInt();

        System.out.printf("Números subsequentes: \n");

        for (int i = numero + 1; i <= numero + 20; i++) {
            System.out.printf("%d ", i);
        }

        read.close();
    }
}
