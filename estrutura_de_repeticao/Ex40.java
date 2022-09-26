package estrutura_de_repeticao;

public class Ex40 {
    public static void main(String[] args) {

        /*
         * 40. Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1, 1,
         * 1, 3, 5, 9, 17, ...
         */

        int a = 1, b = 1, c = 1;
        int soma;
        int sequencia;

        for (int i = 0; i < 20; i++) {
            soma = a + b + c;

            sequencia = a;

            System.out.printf("%d ", sequencia);

            a = b;
            b = c;
            c = soma;
        }
    }
}
