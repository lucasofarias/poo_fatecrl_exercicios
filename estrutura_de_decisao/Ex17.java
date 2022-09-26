package estrutura_de_decisao;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        /*
         * 17. Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a
         * digitação,
         * exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².
         */

        Scanner read = new Scanner(System.in);

        System.out.println("Cálculo do IMC");
        System.out.println("--------------");
        System.out.println();

        System.out.printf("Entre com o peso: ");
        double peso = read.nextDouble();

        System.out.printf("Entre com a altura: ");
        double altura = read.nextDouble();

        System.out.printf("Entre com o sexo (M ou F): ");
        char sexo = read.next().charAt(0);

        double imc = peso / Math.pow(altura, 2);

        System.out.println();

        if (sexo == 'M' || sexo == 'm') {
            if (imc < 20.0) {
                System.out.printf("Abaixo do peso. \n");
            }

            else if (imc >= 20.0 && imc < 25.0) {
                System.out.printf("Peso ideal. \n");
            }

            else {
                System.out.printf("Acima do peso. \n");
            }
        }

        else if (sexo == 'F' || sexo == 'f') {
            if (imc < 19.0) {
                System.out.printf("Abaixo do peso. \n");
            }

            else if (imc >= 19.0 && imc < 24.0) {
                System.out.printf("Peso ideal. \n");
            }

            else {
                System.out.printf("Acima do peso. \n");
            }
        }

        else {
            System.out.printf("Digite a letra M ou F. \n");
        }

        read.close();
    }
}
