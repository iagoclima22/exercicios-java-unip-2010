package nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Ex07FahrenheitParaCelsius {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        System.out.printf("Temperatura em Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;
        System.out.printf("Temperatura em Celsius: %.2f%n", c);

        sc.close();
    }
}
