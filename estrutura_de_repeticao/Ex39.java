package estrutura_de_repeticao;

public class Ex39 {
    public static void main(String[] args) {

        /*
         * 39. Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1,
         * 2, 3, 5, 8, ...
         */

        int a = 0, b = 1, aux;

        for (int i = 1; i <= 30; i++) {

            if (a <= 1) {
                System.out.printf("%d, ", a);
            }

            else if (i == 30) {
                aux = a + b;
                System.out.printf("%d", aux);
            }

            else {
                aux = a + b;
                System.out.printf("%d, ", aux);
            }

            a = a + b;
            b = a - b;
        }
    }
}
