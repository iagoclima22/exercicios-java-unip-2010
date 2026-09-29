package nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Ex04PropriedadeDistributiva {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int a = sc.nextInt();
        System.out.print("Valor de B: ");
        int b = sc.nextInt();
        System.out.print("Valor de C: ");
        int c = sc.nextInt();
        System.out.print("Valor de D: ");
        int d = sc.nextInt();

        System.out.println("A + B = " + (a + b));
        System.out.println("A + C = " + (a + c));
        System.out.println("A + D = " + (a + d));
        System.out.println("B + C = " + (b + c));
        System.out.println("B + D = " + (b + d));
        System.out.println("C + D = " + (c + d));
        System.out.println("A * B = " + (a * b));
        System.out.println("A * C = " + (a * c));
        System.out.println("A * D = " + (a * d));
        System.out.println("B * C = " + (b * c));
        System.out.println("B * D = " + (b * d));
        System.out.println("C * D = " + (c * d));

        sc.close();
    }
}
