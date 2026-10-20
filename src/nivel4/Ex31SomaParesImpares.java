package nivel4;

import java.util.Scanner;

public class Ex31SomaParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero (negativo para sair): ");
        int n = sc.nextInt();

        int somaImpar = 0;
        int somaPar = 0;
        while (n >= 0) {
            if (n % 2 == 0) {
                System.out.println("NUMERO PAR");
                somaPar += n;
            } else {
                System.out.println("NUMERO IMPAR");
                somaImpar += n;
            }
            System.out.print("Digite um numero (negativo para sair): ");
            n = sc.nextInt();
        }
        System.out.println("SOMA DOS PARES = " + somaPar);
        System.out.println("SOMA DOS IMPARES = " + somaImpar);

        sc.close();
    }
}
