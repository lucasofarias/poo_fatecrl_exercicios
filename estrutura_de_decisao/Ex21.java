package estrutura_de_decisao;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        /*
         * 21. Entrar via teclado com dois valores quaisquer. Após a digitação, exibir
         * um seletor de opções (“menu”) com as seguintes opções: (Fazer esse exercício
         * utilizando If..Else e/ou Case)
         * 
         * 1 – Multiplicação
         * 2 – Adição
         * 3 – Divisão
         * 4 – Subtração
         * 5 – Fim de processo (sair do programa)
         * 
         * Solicitar uma opção por parte do usuário, verificar se é ou não uma opção
         * válida (letras ou números) e processar a respectiva operação. Enviar mensagem
         * de erro se a opção escolhida não existir no seletor.
         * 
         * Encerrar o programa somente quando o usuário escolher a opção de finalização.
         * Repare que a opção de número três é de divisão e o programa deverá enviar
         * mensagem de erro, (somente nesta opção) se o denominador for zero.
         * 
         */

        Scanner read = new Scanner(System.in);

        System.out.print("Entre com o primeiro valor: ");
        double primeiroValor = read.nextDouble();

        System.out.print("Entre com o segundo valor: ");
        double segundoValor = read.nextDouble();

        int menuOpcao;

        System.out.println();

        do {

            System.out.println("Menu de Opções");
            System.out.println("--------------");
            System.out.println();

            System.out.println("1) Multiplicação");
            System.out.println("2) Adição");
            System.out.println("3) Divisão");
            System.out.println("4) Subtração");
            System.out.println("5) Fim de processo");
            System.out.println();

            System.out.printf("Opção --> ");
            menuOpcao = read.nextInt();

            System.out.println();

            switch (menuOpcao) {
                case 1:
                    System.out.printf("A multiplicação entre %.2f e %.2f é igual a %.2f \n", primeiroValor,
                            segundoValor,
                            primeiroValor * segundoValor);
                    break;

                case 2:
                    System.out.printf("A adição entre %.2f e %.2f é igual a %.2f \n", primeiroValor, segundoValor,
                            primeiroValor + segundoValor);
                    break;

                case 3:
                    if (segundoValor == 0) {
                        System.out.printf("Erro: O denominador não pode ser igual a zero. \n");
                        break;
                    }

                    System.out.printf("A divisão entre %.2f e %.2f é igual a %.2f \n", primeiroValor, segundoValor,
                            primeiroValor / segundoValor);
                    break;

                case 4:
                    System.out.printf("A subtração entre %.2f e %.2f é igual a %.2f \n", primeiroValor, segundoValor,
                            primeiroValor - segundoValor);
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
