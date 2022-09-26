package estrutura_de_repeticao;

public class Ex38 {
    public static void main(String[] args) {

        /* 38. Exibir a soma dos números inteiros positivos do intervalo de um a cem. */

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.printf("Soma do intervalo de 1 a 100 \n");
        System.out.printf("---------------------------- \n\n");

        System.out.printf("Total da soma: %d \n", soma);
    }
}
