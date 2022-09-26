package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {

        /*
         * 35. Entrar via teclado com um valor qualquer. Travar a digitação, no sentido
         * de aceitar somente valores positivos. Após a digitação, exibir a tabuada do
         * valor solicitado, no intervalo de um a dez.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com um valor: ");
        int valor = read.nextInt();

        while (valor <= 0) {
            System.out.printf("\nEntre somente com valores positivos! \n");
            System.out.printf("Entre com um valor positivo: ");
            valor = read.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", valor, i, valor * i);
        }

        read.close();
    }
}
