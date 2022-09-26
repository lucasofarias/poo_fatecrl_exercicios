package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {

        /*
         * 31. Criar uma rotina de entrada que aceite somente um valor positivo.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Digite um valor positivo: ");
        int num = read.nextInt();

        while (num < 0) {
            System.out.printf("\nDigite apenas um valor positivo. \n");
            System.out.printf("Digite um valor positivo: ");
            num = read.nextInt();
        }

        read.close();
    }
}
