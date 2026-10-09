package nivel2;

import java.util.Locale;
import java.util.Scanner;

public class Ex14Diferenca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        double x = sc.nextDouble();
        System.out.print("Segundo numero: ");
        double y = sc.nextDouble();

        double diferenca;
        if (x > y) {
            diferenca = x - y;
        } else {
            diferenca = y - x;
        }
        System.out.printf("DIFERENCA = %.2f", diferenca);

        sc.close();
    }
}
