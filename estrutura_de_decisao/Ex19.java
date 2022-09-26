package estrutura_de_decisao;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        /*
         * 19. Uma escola com cursos em regime semestral, realiza duas avaliações
         * durante o semestre e calcula a média do aluno, da seguinte maneira:
         * 
         * MEDIA = (P1 + 2.P2) / 3
         * 
         * Fazer um programa para entrar via teclado com os valores das notas (P1 e P2)
         * e calcular a média. Exibir a situação final do aluno (“Aprovado ou
         * Reprovado”), sabendo que a média de aprovação é igual a cinco.
         * 
         */

        Scanner read = new Scanner(System.in);

        System.out.println("Média do aluno");
        System.out.println("--------------");
        System.out.println();

        System.out.printf("Entre com a nota da P1: ");
        double p1 = read.nextDouble();

        System.out.printf("Entre com a nota da P2: ");
        double p2 = read.nextDouble();

        double media = (p1 + 2 * p2) / 3;

        if (media >= 5.0) {
            System.out.printf("Aprovado! \n");
        }

        else {
            System.out.printf("Reprovado... \n");
        }

        read.close();
    }
}
