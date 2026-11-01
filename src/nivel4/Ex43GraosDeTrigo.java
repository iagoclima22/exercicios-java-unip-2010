package nivel4;

import java.math.BigInteger;

public class Ex43GraosDeTrigo {

    public static void main(String[] args) {
        BigInteger dois = BigInteger.valueOf(2);
        BigInteger graosNaCasa = BigInteger.ONE;
        BigInteger total = BigInteger.ZERO;

        for (int casa = 1; casa <= 64; casa++) {
            total = total.add(graosNaCasa);

            if (casa == 64) {
                System.out.println("Graos na casa 64: " + graosNaCasa);
            }

            graosNaCasa = graosNaCasa.multiply(dois);
        }

        System.out.println("TOTAL DE GRAOS = " + total);
    }
}
