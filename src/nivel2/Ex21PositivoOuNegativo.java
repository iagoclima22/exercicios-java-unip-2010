package nivel2;

import java.util.Locale;
import java.util.Scanner;

public class Ex21PositivoOuNegativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        char escolha;
        do {
            System.out.print("Digite um numero inteiro: ");
            n = sc.nextInt();
            if (n > 0) {
                System.out.println("POSITIVO");
            } else if (n < 0) {
                System.out.println("NEGATIVO");
            } else {
                System.out.println("ZERO (nem positivo nem negativo)");
            }
            System.out.print("Deseja continuar? ");
            escolha = sc.next().charAt(0);
        } while (escolha != 'N');

        sc.close();
    }
}
