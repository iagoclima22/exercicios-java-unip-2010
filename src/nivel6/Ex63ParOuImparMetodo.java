package nivel6;

import java.util.Scanner;

public class Ex63ParOuImparMetodo {

    public static String verifica(int n) {
        if (n % 2 == 0) {
            return "PAR";
        }
        return "IMPAR";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();

        System.out.println(verifica(n));

        sc.close();
    }
}
