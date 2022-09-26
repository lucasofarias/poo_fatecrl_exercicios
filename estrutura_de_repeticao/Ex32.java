package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {

        /*
         * 32. Entrar com dois valores via teclado, onde o segundo deverá ser maior que
         * o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com o primeiro valor: ");
        int a = read.nextInt();

        System.out.printf("Entre com o segundo valor: ");
        int b = read.nextInt();

        while (b <= a) {
            System.out.printf("\nO segundo valor deve ser maior que o primeiro valor. \n");
            System.out.printf("Entre com o segundo valor: ");
            b = read.nextInt();
        }

        read.close();
    }
}
