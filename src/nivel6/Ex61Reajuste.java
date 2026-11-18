package nivel6;

import java.util.Locale;
import java.util.Scanner;

public class Ex61Reajuste {

    public static double reajuste(double salario, double indice) {
        return salario + salario * indice / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salario atual: ");
        double salario = sc.nextDouble();
        System.out.print("Indice de reajuste (%): ");
        double indice = sc.nextDouble();

        double novoSalario = reajuste(salario, indice);
        System.out.printf(Locale.US, "SALARIO REAJUSTADO = R$ %.2f%n", novoSalario);

        sc.close();
    }
}
