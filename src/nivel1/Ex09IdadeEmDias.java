package nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Ex09IdadeEmDias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Anos: ");
        int anos = sc.nextInt();
        System.out.print("Meses: ");
        int meses = sc.nextInt();
        System.out.print("Dias: ");
        int dias = sc.nextInt();

        int idadeEmDias = anos * 365 + meses * 30 + dias;
        System.out.println("IDADE EM DIAS = " + idadeEmDias);

        sc.close();
    }
}
