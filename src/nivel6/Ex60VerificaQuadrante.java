package nivel6;

import java.util.Scanner;

public class Ex60VerificaQuadrante {

    public static int verificaQuadrante(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de x: ");
        double x = sc.nextDouble();
        System.out.print("Valor de y: ");
        double y = sc.nextDouble();

        int quadrante = verificaQuadrante(x, y);

        if (quadrante == 0) {
            System.out.println("O ponto esta sobre um dos eixos");
        } else {
            System.out.println("Quadrante: " + quadrante);
        }

        sc.close();
    }
}
