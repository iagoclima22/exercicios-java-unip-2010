package nivel4;

import java.util.Locale;
import java.util.Scanner;

public class Ex37CalculadoraComMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String resposta;

        do {
            System.out.println("1 - Adicao");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.print("Informe a opcao: ");
            int opcao = sc.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opcao invalida!");
            } else {
                System.out.print("Primeiro numero: ");
                double n1 = sc.nextDouble();
                System.out.print("Segundo numero: ");
                double n2 = sc.nextDouble();

                double resultado = 0;
                boolean valido = true;

                switch (opcao) {
                    case 1:
                        resultado = n1 + n2;
                        break;
                    case 2:
                        resultado = n1 - n2;
                        break;
                    case 3:
                        resultado = n1 * n2;
                        break;
                    case 4:
                        if (n2 == 0) {
                            System.out.println("Erro: divisao por zero!");
                            valido = false;
                        } else {
                            resultado = n1 / n2;
                        }
                        break;
                }

                if (valido) {
                    System.out.printf(Locale.US, "RESULTADO = %.2f%n", resultado);
                }
            }

            System.out.print("Deseja voltar ao menu principal (S/N)? ");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado");
        sc.close();
    }
}