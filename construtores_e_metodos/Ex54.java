package construtores_e_metodos;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Cliente[] listaClientes = new Cliente[5];

        int id;
        String nome;
        int idade;
        String email;
        String agencia;
        String numero;
        double saldo;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Cliente #%d\n", i + 1);

            Cliente cliente;

            System.out.printf("ID: ");
            id = read.nextInt();

            System.out.printf("Nome: ");
            nome = read.next();

            System.out.printf("Idade: ");
            idade = read.nextInt();

            System.out.printf("E-mail: ");
            email = read.next();

            System.out.printf("O cliente tem conta bancária? (S/N): ");
            char resposta = read.next().charAt(0);

            while (resposta != 'S' && resposta != 's' && resposta != 'N' && resposta != 'n') {
                System.out.printf("\nPor favor, digite apenas 'S' ou 'N'.\n");
                System.out.printf("O cliente tem conta bancária? (S/N): ");
                resposta = read.next().charAt(0);
            }

            if (resposta == 'S' || resposta == 's') {

                System.out.printf("\nConta \n");
                System.out.printf("Agência: ");
                agencia = read.next();

                System.out.printf("Número: ");
                numero = read.next();

                System.out.printf("Saldo: R$");
                saldo = read.nextDouble();

                ContaBancaria contaBancaria = new ContaBancaria(agencia, numero, saldo);
                cliente = new Cliente(id, nome, idade, email, contaBancaria);

                System.out.println();
                System.out.println("--------------------");
                System.out.println();
            }

            else {
                cliente = new Cliente(id, nome, idade, email, null);

                System.out.println();
                System.out.println("--------------------");
                System.out.println();
            }

            listaClientes[i] = cliente;
        }

        for (int i = 0; i < 5; i++) {

            System.out.printf("ID: %d\n", listaClientes[i].id);
            System.out.printf("Nome: %s\n", listaClientes[i].nome);
            System.out.printf("Idade: %d\n", listaClientes[i].idade);
            System.out.printf("E-mail: %s\n\n", listaClientes[i].email);

            if (listaClientes[i].conta != null) {
                System.out.printf(listaClientes[i].exibirDadosConta());
                System.out.println();
            }

            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println();
        }
    }
}
