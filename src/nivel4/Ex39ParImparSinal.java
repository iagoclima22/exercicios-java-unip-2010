package nivel4;

import java.util.Scanner;

public class Ex39ParImparSinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite um numero inteiro: ");
            int numero = sc.nextInt();

            String paridade = (numero % 2 == 0) ? "PAR" : "IMPAR";

            String sinal;
            if (numero > 0) {
                sinal = "POSITIVO";
            } else if (numero < 0) {
                sinal = "NEGATIVO";
            } else {
                sinal = "ZERO";
            }

            System.out.println(numero + " e " + paridade + " e " + sinal);

            System.out.print("Deseja encerrar o programa? ");
            resposta = sc.next();

        } while (!resposta.equalsIgnoreCase("S"));

        sc.close();
    }
}
