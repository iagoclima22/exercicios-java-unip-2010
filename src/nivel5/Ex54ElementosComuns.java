package nivel5;

import java.util.Scanner;

public class Ex54ElementosComuns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetA = new int[5];
        int[] vetB = new int[8];

        System.out.print("Elementos de A (5): ");
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.print("Elementos de B (8): ");
        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = sc.nextInt();
        }

        boolean encontrou = false;

        for (int elemento : vetA) {
            for (int i = 0; i < vetB.length; i++) {
                if (elemento == vetB[i]) {
                    if (!encontrou) {
                        System.out.print("Elementos comuns: ");
                        encontrou = true;
                    }
                    System.out.print(elemento + " ");
                    break;
                }
            }
        }

        if (!encontrou) {
            System.out.print("Nenhum elemento em comum");
        }
        System.out.println();

        sc.close();
    }
}