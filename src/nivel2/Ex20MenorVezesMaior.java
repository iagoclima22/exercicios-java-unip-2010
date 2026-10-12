package nivel2;

import java.util.Locale;
import java.util.Scanner;

public class Ex20MenorVezesMaior {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de a: ");
        int a = sc.nextInt();
        while (a <= 0) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
            System.out.print("Valor de a: ");
            a = sc.nextInt();
        }
        System.out.print("Valor de b: ");
        int b = sc.nextInt();
        while (b <= 0) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
            System.out.print("Valor de b: ");
            b = sc.nextInt();
        }
        System.out.print("Valor de c: ");
        int c = sc.nextInt();
        while (c <= 0) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
            System.out.print("Valor de c: ");
            c = sc.nextInt();
        }

        int maior = a;
        int menor = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        int multiplicacao = menor * maior;
        double divisao = (double) maior / menor;

        System.out.println("Menor x Maior = " + multiplicacao);
        System.out.printf("Maior / Menor = %.2f%n", divisao);

        sc.close();
    }
}