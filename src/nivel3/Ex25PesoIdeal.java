package nivel3;

import java.util.Locale;
import java.util.Scanner;

public class Ex25PesoIdeal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pesoIdeal;

        System.out.print("Altura: ");
        double h = sc.nextDouble();
        System.out.print("Sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        if (sexo == 'M') {
            pesoIdeal = (72.7 * h) - 58;
        } else {
            pesoIdeal = (62.1 * h) - 47.7;
        }
        System.out.printf("PESO IDEAL = %.2f Kg%n", pesoIdeal);

        sc.close();
    }
}
