package nivel3;

import java.util.Locale;
import java.util.Scanner;

public class Ex23MenuOperacoes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Adicao");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();
        System.out.print("Primeiro numero: ");
        double n1 = sc.nextDouble();
        System.out.print("Segundo numero: ");
        double n2 = sc.nextDouble();
        double resultado;
        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.printf("RESULTADO = %.2f%n", resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.printf("RESULTADO = %.2f%n", resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.printf("RESULTADO = %.2f%n", resultado);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Nao e possivel dividir por zero");
                } else {
                    resultado = n1 / n2;
                    System.out.printf("RESULTADO = %.2f%n", resultado);

                }
                break;
            default:
                resultado = 0;
        }


        sc.close();
    }
}
