package nivel6;

import java.util.Locale;
import java.util.Scanner;

public class Ex62Hipotenusa {

    public static double hipotenusa(double base, double altura) {
        return Math.sqrt(base * base + altura * altura);
    }

    public static double area(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.printf(Locale.US, "HIPOTENUSA = %.2f%n", hipotenusa(base, altura));
        System.out.printf(Locale.US, "AREA = %.2f%n", area(base, altura));

        sc.close();
    }
}
