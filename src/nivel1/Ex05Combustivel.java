package nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Ex05Combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Tempo gasto na viagem (horas): ");
        double tempoGasto = sc.nextDouble();
        System.out.print("Velocidade media (kn/h): ");
        double velocidadeMedia = sc.nextDouble();

        double distanciaPercorrida = tempoGasto * velocidadeMedia;
        double litrosUsados = distanciaPercorrida / 12.00;

        System.out.printf("Velocidade media = %.2f km/h %n", velocidadeMedia);
        System.out.printf("Tempo gasto = %.2f h %n", tempoGasto);
        System.out.printf("Distancia percorrida = %.2f km %n", distanciaPercorrida);
        System.out.printf("Litros usados = %.2f%n", litrosUsados);

        sc.close();
    }
}
