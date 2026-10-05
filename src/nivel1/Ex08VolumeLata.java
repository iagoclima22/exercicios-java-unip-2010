package nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Ex08VolumeLata {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio: ");
        double r = sc.nextDouble();
        System.out.print("Altura: ");
        double a = sc.nextDouble();

        double v = 3.14159 *  r * r * a;
        System.out.printf("VOLUME: %.2f%n", v);

        sc.close();
    }
}
