package estrutura_de_decisao;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

        /*
         * 18. Criar um programa para analisar a velocidade de um automóvel. Solicitar
         * via teclado os valores da aceleração (a em m/s2), velocidade inicial (v0 em
         * m/s) e o tempo de percurso (t em s). Calcular e exibir a velocidade final do
         * automóvel em km/h. E exibir mensagem de acordo com a tabela abaixo:
         */

        Scanner read = new Scanner(System.in);

        System.out.println("Velocidade de um automóvel");
        System.out.println("--------------------------");
        System.out.println();

        System.out.printf("Entre com o valor da aceleração (m/s²): ");
        double aceleracao = read.nextDouble();

        System.out.printf("Entre com a velocidade inicial (m/s): ");
        double velocidadeInicial = read.nextDouble();

        System.out.printf("Entre com o tempo do percurso (s): ");
        double tempoPercurso = read.nextDouble();

        double velocidadeFinal = velocidadeInicial + aceleracao * tempoPercurso;

        System.out.println();

        System.out.printf("Velocidade final: %.2f m/s <---> %.2f km/h \n\n", velocidadeFinal, velocidadeFinal * 3.6);

        if (velocidadeFinal * 3.6 <= 40.0) {
            System.out.println("Veículo muito lento.");
        }

        else if (velocidadeFinal * 3.6 > 40.0 && velocidadeFinal * 3.6 <= 60.0) {
            System.out.println("Velocidade permitida.");
        }

        else if (velocidadeFinal * 3.6 > 60.0 && velocidadeFinal * 3.6 <= 80.0) {
            System.out.println("Velocidade de cruzeiro.");
        }

        else if (velocidadeFinal * 3.6 > 80.0 && velocidadeFinal * 3.6 <= 120.0) {
            System.out.println("Veículo rápido.");
        }

        else {
            System.out.println("Veículo muito rápido.");
        }

        read.close();
    }
}
