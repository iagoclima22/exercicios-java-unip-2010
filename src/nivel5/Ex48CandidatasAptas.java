package nivel5;

import java.util.Scanner;

public class Ex48CandidatasAptas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[20];
        int[] idades = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Candidata " + (i + 1) + " - nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Candidata " + (i + 1) + " - idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("CANDIDATAS APTAS:");
        for (int i = 0; i < 20; i++) {
            if (idades[i] >= 18 && idades[i] <= 20) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
