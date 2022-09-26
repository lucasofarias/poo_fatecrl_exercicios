package estrutura_de_decisao;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {

        /*
         * 25. Faça um algoritmo para receber um número qualquer e informar na tela se é
         * par ou ímpar. Utilize o operador %
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com um número qualquer: ");
        int numero = read.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é PAR.");
        }

        else {
            System.out.println("O número é ÍMPAR.");
        }

        read.close();
    }
}
