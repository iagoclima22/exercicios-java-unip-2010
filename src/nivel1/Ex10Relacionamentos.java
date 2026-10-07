package nivel1;

import java.util.Scanner;

public class Ex10Relacionamentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " != " + n2 + " (Nao igual)");
            System.out.println(n1 + " > " + n2 + " (Maior)");
            System.out.println(n1 + " >= " + n2 + " (Maior ou igual)");
        } else if (n1 < n2) {
            System.out.println(n1 + " != " + n2 + " (Nao igual)");
            System.out.println(n1 + " < " + n2 + " (Menor)");
            System.out.println(n1 + " <= " + n2 + " (Menor ou igual)");
        } else {
            System.out.println(n1 + " == " + n2 + " (Igual)");
            System.out.println(n1 + " >= " + n2 + " (Maior ou igual)");
            System.out.println(n1 + " <= " + n2 + " (Menor ou igual)");
        }

        sc.close();    }
}
