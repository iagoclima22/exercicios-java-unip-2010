package nivel5;

import java.util.Scanner;

public class Ex52Conta134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[100];
        int tamanho = 0;

        while (tamanho < vetor.length) {
            System.out.print("Digite um numero (-1 para sair): ");
            int numero = sc.nextInt();

            if (numero == -1) {
                break;
            }

            vetor[tamanho] = numero;
            tamanho++;
        }

        int conta1 = 0;
        int conta3 = 0;
        int conta4 = 0;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == 1) {
                conta1++;
            } else if (vetor[i] == 3) {
                conta3++;
            } else if (vetor[i] == 4) {
                conta4++;
            }
        }

        System.out.println("Numero 1: " + conta1 + " vez(es)");
        System.out.println("Numero 3: " + conta3 + " vez(es)");
        System.out.println("Numero 4: " + conta4 + " vez(es)");

        sc.close();
    }
}
