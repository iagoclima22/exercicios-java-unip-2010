package nivel5;

import java.util.Scanner;

public class Ex45VetorInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();

        int[] vet = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vet[i] = sc.nextInt();
        }

        System.out.print("Ordem inversa: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vet[i] + " ");
        }

        sc.close();
    }
}
