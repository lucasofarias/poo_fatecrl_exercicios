package estrutura_de_decisao;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {

        /*
         * 26. Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso
         * seja negativo, imprimindo o resultado.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        double numero = read.nextDouble();

        if (numero >= 0) {
            System.out.printf("O dobro de %.2f é igual a %.2f.", numero, numero * 2);
        }

        else {
            System.out.printf("O triplo de %.2f é igual a %.2f.", numero, numero * 3);
        }

        read.close();
    }
}
