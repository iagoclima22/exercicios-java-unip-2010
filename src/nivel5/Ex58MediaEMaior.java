package nivel5;

import java.util.Locale;
import java.util.Scanner;

public class Ex58MediaEMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int soma = 0;
        int maior = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            while (numeros[i] <= 0) {
                System.out.print("Digite um numero positivo: ");
                numeros[i] = sc.nextInt();
            }

            soma += numeros[i];
            if (i == 0 || numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        double media = (double) soma / n;
        System.out.printf(Locale.US, "MEDIA = %.2f%n", media);
        System.out.println("MAIOR = " + maior);

        sc.close();
    }
}
