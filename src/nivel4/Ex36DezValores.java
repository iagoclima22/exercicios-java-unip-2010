package nivel4;

import java.util.Locale;
import java.util.Scanner;

public class Ex36DezValores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[10];
        for (int i = 0; i < 10 ; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            valores[i] = sc.nextInt();
        }

        int maior = valores[0];
        int menor = valores[0];
        int somaValores = 0;
        for (int i = 0; i < 10; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }

            somaValores += valores[i];
        }

        double media = somaValores / 10.0;
        System.out.println("MAIOR = " + maior);
        System.out.println("MENOR = " + menor);
        System.out.printf("MEDIA = %.2f%n", media);


        sc.close();
    }
}
