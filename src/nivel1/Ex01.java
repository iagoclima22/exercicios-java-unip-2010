/*
 * Exercício 1
 * Faça um programa para calcular o estoque médio de uma peça, sendo que:
 * ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 */

package nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade mínima: ");
        int quantidadeMinima = sc.nextInt();
        System.out.print("Digite a quantidade máxima: ");
        int quantidadeMaxima = sc.nextInt();

        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2.00;
        System.out.printf("Estoque médio: %.2f", estoqueMedio);

        sc.close();
    }
}
