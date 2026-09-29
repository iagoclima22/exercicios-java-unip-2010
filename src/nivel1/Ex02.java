/*
* Faça um programa que:
* - Leia a cotação do dólar
* - Leia um valor em dólares
* - Converta esse valor para Real
* - Mostre o resultado
 */

package nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = sc.nextDouble();
        System.out.print("Digite o valor em dólares: ");
        double quantidadeDolares = sc.nextDouble();

        double dolarParaReal = cotacaoDolar * quantidadeDolares;
        System.out.printf("Conversão de dólar para real = %.2f", dolarParaReal);

        sc.close();
    }
}
