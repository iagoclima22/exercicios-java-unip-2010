package nivel2;

import java.util.Scanner;

public class Ex12Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();

        int modulo;
        if (n >= 0) {
            modulo = n;
        } else {
            modulo = n * (-1);
        }
        System.out.println("MODULO = " + modulo);

        sc.close();
    }
}
