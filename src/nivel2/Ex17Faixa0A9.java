package nivel2;

import java.util.Scanner;

public class Ex17Faixa0A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();

        if (n < 0 || n > 9) {
            System.out.println("Valor invalido");
        } else {
            System.out.println("Valor valido");
        }

        sc.close();
    }
}
