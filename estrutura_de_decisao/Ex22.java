package estrutura_de_decisao;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        /*
         * 22. Exibir o seguinte seletor de opções e em função de uma escolha, solicitar
         * os dados necessários para o cálculo da respectiva área. Enviar mensagem de
         * erro se o usuário escolher uma opção inexistente.
         * 
         * Encerrar o programa somente quando selecionada a opção de finalização. (Fazer
         * esse exercício utilizando If..Else e/ou Case)
         * 
         * 1 – Triângulo
         * 2 – Quadrado
         * 3 – Retângulo
         * 4 – Círculo
         * 5 – Fim de processo
         */

        Scanner read = new Scanner(System.in);

        int menuOpcao;
        double area;

        do {

            System.out.println("Menu de Opções");
            System.out.println("--------------");
            System.out.println();

            System.out.println("1) Triângulo");
            System.out.println("2) Quadrado");
            System.out.println("3) Retângulo");
            System.out.println("4) Círculo");
            System.out.println("5) Fim de processo");
            System.out.println();

            System.out.printf("Opção --> ");
            menuOpcao = read.nextInt();

            System.out.println();

            switch (menuOpcao) {
                case 1:
                    System.out.println("Área do triângulo");
                    System.out.println("-----------------");
                    System.out.println();

                    System.out.printf("Entre com o valor da base (cm): ");
                    double base = read.nextDouble();

                    System.out.printf("Entre com o valor da altura (cm): ");
                    double altura = read.nextDouble();

                    area = (base * altura) / 2;

                    System.out.printf("A área do triângulo é igual a %.2f cm². \n", area);
                    break;

                case 2:
                    System.out.println("Área do Quadrado");
                    System.out.println("----------------");
                    System.out.println();

                    System.out.printf("Entre com o valor da aresta (cm): ");
                    double aresta = read.nextDouble();

                    area = Math.pow(aresta, 2);

                    System.out.printf("A área do quadrado é igual a %.2f cm². \n", area);
                    break;

                case 3:
                    System.out.println("Área do Retângulo");
                    System.out.println("-----------------");
                    System.out.println();

                    System.out.printf("Entre com o valor da base (cm): ");
                    base = read.nextDouble();

                    System.out.printf("Entre com o valor da altura (cm): ");
                    altura = read.nextDouble();

                    area = base * altura;

                    System.out.printf("A área do retângulo é igual a %.2f cm². \n", area);
                    break;

                case 4:
                    System.out.println("Área do Círculo");
                    System.out.println("---------------");
                    System.out.println();

                    System.out.printf("Entre com o valor do raio (cm): ");
                    double raio = read.nextDouble();

                    double pi = 3.141592;

                    area = pi * Math.pow(raio, 2);

                    System.out.printf("A área do círculo é igual a %.2f cm². \n", area);
                    break;

                case 5:
                    break;

                default:
                    System.out.printf("Por favor, digite uma opção válida. \n");
                    break;
            }

            System.out.println();

        } while (menuOpcao != 5);

        read.close();
    }
}
