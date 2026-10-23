package nivel4;

import java.util.Scanner;

public class Ex32SomaQuadradosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero entre 1 e 9: ");
        int n = sc.nextInt();
        while (n < 1 || n > 9) {
            System.out.println("Numero invalido!");
            System.out.print("Digite um numero entre 1 e 9: ");
            n = sc.nextInt();
        }

        int somaQuadrado = 0;
        boolean primeiro = true;

        System.out.print("Impares usados: ");
        for (int i = n; i < n + 40; i++) {
            if (i % 2 != 0) {
                if (!primeiro) {
                    System.out.print(", ");
                }
                System.out.print(i);
                primeiro = false;

                somaQuadrado += i * i;
            }
        }
        System.out.println();
        System.out.println("SOMA DOS QUADRADOS = " + somaQuadrado);

        sc.close();
    }
}
