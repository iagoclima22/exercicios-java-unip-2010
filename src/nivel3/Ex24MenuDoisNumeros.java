package nivel3;

import java.util.Scanner;

public class Ex24MenuDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("1 - Verificar se um e multiplo do outro");
        System.out.println("2 - Verificar se os dois sao pares");
        System.out.println("3 - Verificar se a media e maior ou igual a 7");
        System.out.println("4 - Sair");

        System.out.print("Opcao: ");
        int opcao = sc.nextInt();
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    if (n1 % n2 == 0 || n2 % n1 == 0) {
                        System.out.println("Um e multiplo do outro");
                    } else {
                        System.out.println("Nao sao multiplos");
                    }
                    break;
                case 2:
                    if (n1 % 2 == 0 && n2 % 2 == 0) {
                        System.out.println("Os dois numeros sao pares");
                    } else {
                        System.out.println("Pelo menos um dos dois nao sao pares");
                    }
                    break;
                case 3:
                    double media = (n1 + n2) / 2.0;
                    if (media >= 7.0) {
                        System.out.printf("MEDIA = %.2f; maior ou igual a 7%n", media);
                    } else {
                        System.out.printf("MEDIA = %.2f; menor que 7%n", media);
                    }
                case 4:
                    break;
                default:
                    System.out.println("Numero invalido");
            }

            System.out.print("Opcao: ");
            opcao = sc.nextInt();
        }
        System.out.println("Fim do programa");

        sc.close();
    }
}
