package classe_e_atributo;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {

        /*
         * 53. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que
         * utilize essa classe para cadastrar 5 alunos em uma lista de alunos. Durante o
         * cadastro do aluno, solicitar para o aluno cadastrar a sigla/iniciais das 6
         * matérias que ela está cursando no momento. Ao final exibir apenas os alunos
         * do período “noite”.
         */

        Scanner read = new Scanner(System.in);

        Aluno[] listaAlunos = new Aluno[5];

        for (int i = 0; i < 5; i++) {
            Aluno aluno = new Aluno();

            System.out.printf("RA do aluno: ");
            aluno.ra = read.next();

            System.out.printf("Nome do aluno: ");
            aluno.nome = read.next();

            System.out.printf("Matérias (siglas) que o aluno está cursando:\n\n");

            for (int j = 0; j < 6; j++) {
                System.out.printf("Matéria #%d\n", j + 1);
                aluno.materias[j] = read.next();
            }

            System.out.printf("Período (manhã, tarde ou noite): ");
            aluno.periodo = read.next();

            listaAlunos[i] = aluno;
            System.out.println();
            System.out.println("----------------");
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            if (listaAlunos[i].periodo.equals("noite")) {
                System.out.printf("Aluno: %s\n", listaAlunos[i].nome);
                System.out.printf("RA: %s\n", listaAlunos[i].ra);

                System.out.printf("Matérias:");

                for (int j = 0; j < 6; j++) {
                    System.out.printf("%s ", listaAlunos[i].materias[j]);
                }

                System.out.printf("\nPeríodo: %s\n", listaAlunos[i].periodo);
                System.out.println();
            }
        }

        read.close();
    }
}
