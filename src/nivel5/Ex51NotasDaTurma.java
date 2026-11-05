package nivel5;

import java.util.Locale;
import java.util.Scanner;

public class Ex51NotasDaTurma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int n = sc.nextInt();

        double soma = 0;
        int acimaDe7 = 0;
        int acimaDe5 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            soma += nota;

            if (nota > 7.0) {
                acimaDe7++;
            }
            if (nota > 5.0) {
                acimaDe5++;
            }
        }

        double media = soma / n;
        System.out.printf("MEDIA = %.2f%n", media);
        System.out.println("Alunos com nota acima de 7.0: " + acimaDe7);

        if (acimaDe5 == 0) {
            System.out.println("Não há nenhum aluno com nota acima de 5");
        }

        sc.close();
    }
}
