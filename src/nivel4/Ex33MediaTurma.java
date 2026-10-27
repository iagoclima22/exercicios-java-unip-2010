package nivel4;

import java.util.Locale;
import java.util.Scanner;

public class Ex33MediaTurma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Matricula (0 para encerrar): ");
        int matricula = sc.nextInt();

        double nota;
        double somaNotas = 0.0;
        int contNotas = 0;
        while (matricula != 0) {
            System.out.print("Nota: ");
            nota = sc.nextDouble();
            somaNotas += nota;
            contNotas++;

            System.out.print("Matricula (0 para encerrar): ");
            matricula = sc.nextInt();
        }

        double media = somaNotas / contNotas;
        System.out.printf("MEDIA DA TURMA = %.2f%n", media);


        sc.close();
    }
}
