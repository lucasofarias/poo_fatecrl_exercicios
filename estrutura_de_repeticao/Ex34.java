package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex34 {

    /* 34. Exibir a tabuada do número cinco no intervalo de um a dez. */

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int valor = 5;

        System.out.printf("Tabuada do número %d \n", valor);
        System.out.printf("------------------- \n\n");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", valor, i, valor * i);
        }

        read.close();
    }
}
