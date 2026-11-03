package nivel5;

import java.util.Scanner;

public class Ex47CompararComX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        System.out.print("Digite os 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
        }

        System.out.print("Digite o numero X: ");
        int x = sc.nextInt();

        int contMaior = 0;
        int contMenor = 0;
        int contIgual = 0;
        for (int i = 0; i < 10; i++) {
            if (vet[i] < x) {
                contMenor++;
            } else if (vet[i] > x) {
                contMaior++;
            } else {
                contIgual++;
            }
        }
        System.out.println("Maiores que " + x + ": " + contMaior);
        System.out.println("Menores que " + x + ": " + contMenor);
        System.out.println("Iguais a " + x + ": " + contIgual);

        sc.close();
    }
}
