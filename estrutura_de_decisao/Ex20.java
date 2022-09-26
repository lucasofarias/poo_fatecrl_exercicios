package estrutura_de_decisao;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        /*
         * 20. Uma escola com cursos em regime semestral realiza duas avaliações durante
         * o semestre e calcula a média do aluno, da seguinte maneira:
         * 
         * MEDIA = (P1 + 2.P2) / 3
         * 
         * Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e
         * o programa deverá calcular e exibir quanto o aluno precisa tirar na segunda
         * nota minimamente (P2) para ser aprovado, sabendo que a média de aprovação é
         * igual a cinco.
         */

        Scanner read = new Scanner(System.in);

        System.out.println("Cálculo da média do aluno");
        System.out.println("-------------------------");
        System.out.println();

        System.out.printf("Entre com a nota da P1: ");
        double p1 = read.nextDouble();

        double notaMinimaP2 = (5.0 * 3.0 - p1) / 2;

        System.out.printf("A nota mínima que o aluno precisa para poder passar é igual a %.2f. \n", notaMinimaP2);

        read.close();
    }
}
