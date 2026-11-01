package nivel4;

import java.util.Locale;
import java.util.Scanner;

public class Ex44MenuConversoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String resposta;

        do {
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Peso ideal do homem");
            System.out.println("4 - Peso ideal da mulher");
            System.out.print("Opcao: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Temperatura em Celsius: ");
                    double c = sc.nextDouble();
                    double f = c * 9 / 5 + 32;
                    System.out.printf(Locale.US, "Fahrenheit = %.2f%n", f);
                    break;
                }
                case 2: {
                    System.out.print("Temperatura em Fahrenheit: ");
                    double f = sc.nextDouble();
                    double c = (f - 32) * 5 / 9;
                    System.out.printf(Locale.US, "Celsius = %.2f%n", c);
                    break;
                }
                case 3:
                case 4: {
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    System.out.print("Peso atual: ");
                    double pesoAtual = sc.nextDouble();
                    double pesoIdeal = (opcao == 3)
                            ? 72.7 * altura - 58
                            : 62.1 * altura - 44.7;
                    System.out.printf(Locale.US, "PESO IDEAL = %.2f kg%n", pesoIdeal);
                    if (pesoAtual > pesoIdeal) {
                        System.out.println("Voce esta ACIMA do peso ideal");
                    } else if (pesoAtual < pesoIdeal) {
                        System.out.println("Voce esta ABAIXO do peso ideal");
                    } else {
                        System.out.println("Voce esta NO peso ideal");
                    }
                    break;
                }
                default:
                    System.out.println("Opcao invalida");
            }

            System.out.print("Deseja encerrar o programa? ");
            resposta = sc.next();
        } while (!resposta.equalsIgnoreCase("S"));

        sc.close();
    }
}
