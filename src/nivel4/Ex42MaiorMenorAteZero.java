package nivel4;

import java.util.Scanner;

public class Ex42MaiorMenorAteZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero (0 para sair): ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Nenhum numero foi informado");
        } else {
            int maior = n;
            int menor = n;
            while (n != 0) {
                if (n > maior) {
                    maior = n;
                }
                if (n < menor) {
                    menor = n;
                }

                System.out.print("Digite um numero (0 para sair): ");
                n = sc.nextInt();
            }
            System.out.println("MAIOR = " + maior);
            System.out.println("MENOR = " + menor);
        }

        sc.close();
    }
}
