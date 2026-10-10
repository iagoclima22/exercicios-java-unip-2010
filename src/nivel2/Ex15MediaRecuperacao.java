package nivel2;

import java.util.Locale;
import java.util.Scanner;

public class Ex15MediaRecuperacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();
        System.out.print("Nota 4: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 7.0) {
            System.out.printf("ALUNO APROVADO. MEDIA = %.2f%n", media);
        } else {
            System.out.printf("MEDIA = %.2f%n", media);
            System.out.print("Nota da recuperação: ");
            double recuperacao = sc.nextDouble();
            double novaMedia = (recuperacao + media) / 2.0;
            System.out.printf("ALUNO APROVADO NA RECUPERACAO. MEDIA = %.2f%n", novaMedia);
        }

        sc.close();
    }
}