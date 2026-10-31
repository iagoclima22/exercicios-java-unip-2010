package nivel4;

import java.util.Locale;
import java.util.Scanner;

public class Ex38SalarioOperario {

    public static void main(String[] args) {
        // Locale.US para aceitar e imprimir numeros com ponto
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        final double VALOR_HORA = 10.0;
        final double VALOR_HORA_EXTRA = 20.0;
        final int LIMITE_HORAS = 50;

        String resposta;

        do {
            System.out.print("Codigo do operario: ");
            int c = sc.nextInt();
            System.out.print("Horas trabalhadas: ");
            double n = sc.nextDouble();

            double e;
            double salarioTotal;

            if (n > LIMITE_HORAS) {
                e = (n - LIMITE_HORAS) * VALOR_HORA_EXTRA;
                salarioTotal = LIMITE_HORAS * VALOR_HORA + e;
            } else {
                e = 0;
                salarioTotal = n * VALOR_HORA;
            }

            System.out.println("Operario " + c);
            System.out.printf(Locale.US, "SALARIO TOTAL = R$ %.2f%n", salarioTotal);
            System.out.printf(Locale.US, "SALARIO EXCEDENTE = R$ %.2f%n", e);

            System.out.print("Deseja encerrar o programa? ");
            resposta = sc.next();

        } while (!resposta.equalsIgnoreCase("S"));

        sc.close();
    }
}
