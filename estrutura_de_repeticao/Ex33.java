package estrutura_de_repeticao;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {

        /*
         * 33. Entrar via teclado com o sexo de determinado usuário, aceitar somente “F”
         * ou “M” como respostas válidas.
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com o seu gênero (F ou M): ");
        char sexo = read.next().charAt(0);

        while (sexo != 'F' && sexo != 'M') {
            System.out.printf("\nDigite apenas F ou M. \n");
            System.out.printf("Entre com o seu gênero (F ou M): ");
            sexo = read.next().charAt(0);
        }

        read.close();
    }
}
