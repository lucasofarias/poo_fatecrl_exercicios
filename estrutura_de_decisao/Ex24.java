package estrutura_de_decisao;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {

        /*
         * 24. Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa.
         * Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada
         * (anos).
         */

        Scanner read = new Scanner(System.in);

        System.out.printf("Entre com o nome completo: ");
        String nome = read.nextLine();

        System.out.printf("Entre com o sexo: ");
        char sexo = read.next().charAt(0);

        System.out.printf("Entre com o estado civil: ");
        String estadoCivil = read.next();

        if (sexo == 'F' || sexo == 'f' && estadoCivil.toUpperCase() == "CASADA") {
            System.out.printf("Entre com o tempo que a pessoa está casada (anos): ");
            int tempoCasamento = read.nextInt();
        }

        read.close();
    }
}
