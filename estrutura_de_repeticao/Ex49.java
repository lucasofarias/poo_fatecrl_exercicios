package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {

        /*
         * 49. Crie um programa que solicite que o usuário entre com dois números
         * (inicial e final). Ao final o programa deverá apresentar o valor total da
         * soma de todos os números do intervalo digitado pelo usuário
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com um valor inicial: ");
        int valorInicial = read.nextInt();

        System.out.printf("Agora entre com um valor final: ");
        int valorFinal = read.nextInt();

        int valorTotal = 0;

        for (int i = valorInicial; i <= valorFinal; i++) {
            valorTotal += i;
        }

        System.out.printf("\nValor total da soma do intervalo [%d, %d]: %d\n", valorInicial, valorFinal, valorTotal);

        read.close();
    }
}
