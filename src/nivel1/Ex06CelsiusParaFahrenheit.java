package nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Ex06CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double c = sc.nextDouble();

        double f = (9.0 * c + 160.0) / 5.0;
        System.out.printf("Temperatura em Fahrenheit: %.2f", f);

        sc.close();
    }
}
