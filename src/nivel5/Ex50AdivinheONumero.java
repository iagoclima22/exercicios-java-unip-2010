package nivel5;

import java.util.Random;
import java.util.Scanner;

public class Ex50AdivinheONumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int sorteado = random.nextInt(101);

        int tentativas = 0;
        int palpite;

        do {
            System.out.print("Seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite > sorteado) {
                System.out.println("O numero sorteado e MENOR");
            } else if (palpite < sorteado) {
                System.out.println("O numero sorteado e MAIOR");
            }
        } while (palpite != sorteado);

        System.out.println("ACERTOU! Tentativas: " + tentativas);
        sc.close();
    }
}
