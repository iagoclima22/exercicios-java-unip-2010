package nivel5;

import java.util.Scanner;

public class Ex56ParesEMultiplosDe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[50];

        System.out.print("Digite os 50 numeros: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }

        int pares = 0;
        int multiplos5 = 0;

        for (int numero : vet) {
            if (numero % 2 == 0) {
                pares++;
            }
            if (numero % 5 == 0) {
                multiplos5++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de multiplos de 5: " + multiplos5);

        sc.close();
    }
}