package nivel5;

import java.util.Scanner;

public class Ex49PosicoesIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Quantidade de elementos (max 50): ");
            n = sc.nextInt();
        } while (n < 1 || n > 50);

        int[] v1 = new int[n];
        int[] v2 = new int[n];

        System.out.print("Elementos de V1: ");
        for (int i = 0; i < n; i++) {
            v1[i] = sc.nextInt();
        }

        System.out.print("Elementos de V2: ");
        for (int i = 0; i < n; i++) {
            v2[i] = sc.nextInt();
        }

        int iguais = 0;
        for (int i = 0; i < n; i++) {
            if (v1[i] == v2[i]) {
                iguais++;
            }
        }

        System.out.println("Valores iguais nas mesmas posicoes: " + iguais);

        sc.close();
    }
}
