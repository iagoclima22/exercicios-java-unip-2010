package nivel5;

import java.util.Locale;
import java.util.Scanner;

public class Ex53Corrida {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de voltas: ");
        int n = sc.nextInt();

        double melhorTempo = 0;
        int voltaMelhor = 0;
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Tempo da volta " + i + ": ");
            double tempo = sc.nextDouble();
            soma += tempo;

            if (i == 1 || tempo < melhorTempo) {
                melhorTempo = tempo;
                voltaMelhor = i;
            }
        }

        double media = soma / n;

        System.out.printf("MELHOR TEMPO = %.2f%n", melhorTempo);
        System.out.println("VOLTA DO MELHOR TEMPO = " + voltaMelhor);
        System.out.printf("TEMPO MEDIO = %.2f%n", media);

        sc.close();
    }
}
