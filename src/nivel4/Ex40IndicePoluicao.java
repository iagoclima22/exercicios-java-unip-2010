package nivel4;

import java.util.Locale;
import java.util.Scanner;

public class Ex40IndicePoluicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String resposta;

        do {
            System.out.print("Indice de poluicao: ");
            double indice = sc.nextDouble();

            if (indice >= 0.5) {
                System.out.println("Todos os grupos devem paralisar suas atividades");
            } else if (indice >= 0.4) {
                System.out.println("Industrias do 1o e 2o grupo intimadas a suspender as atividades");
            } else if (indice >= 0.3) {
                System.out.println("Industrias do 1o grupo intimadas a suspender as atividades");
            } else {
                System.out.println("Indice aceitavel. Nenhum grupo foi notificado");
            }

            System.out.print("Deseja encerrar o programa? ");
            resposta = sc.next();

        } while (!resposta.equalsIgnoreCase("S"));

        sc.close();
    }
}
