package estrutura_de_repeticao;

import java.util.Scanner;
import java.io.IOException;

public class Ex37 {
    public static void main(String[] args) {

        /*
         * 37. Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez.
         * Entre as tabuadas, solicitar que o usuário pressione uma tecla.
         */

        Scanner read = new Scanner(System.in);

        int valor = 1;

        while (valor <= 20) {
            System.out.printf("Tabuada do %d \n", valor);
            System.out.printf("------------- \n\n");

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d \n", valor, i, valor * i);
            }

            System.out.printf("\nPressione uma tecla e dê Enter: \n");
            char tecla = read.next().charAt(0);

            System.out.println();
            valor++;
        }

        read.close();
    }
}
