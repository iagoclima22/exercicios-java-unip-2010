package nivel4;

import java.util.Scanner;

public class Ex34MenorMaiorPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero (negativo para sair): ");
        int n  = sc.nextInt();

        if (n >= 0) {
            int menor = n;
            int maior = n;
            while (n > 0) {
                if (n < menor) {
                    menor = n;
                }

                if (n > maior) {
                    maior = n;
                }

                System.out.print("Digite um numero (negativo para sair): ");
                n  = sc.nextInt();
            }
            System.out.println("MENOR = " + menor);
            System.out.println("MAIOR = " + maior);
        } else {
            System.out.println("Nenhum numero positivo foi informado");
        }

        sc.close();
    }
}
