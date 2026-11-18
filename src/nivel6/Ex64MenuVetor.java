package nivel6;

import java.util.Scanner;

public class Ex64MenuVetor {

    static Scanner sc = new Scanner(System.in);

    public static int[] carregarVetor() {
        System.out.print("Tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];

        System.out.print("Digite os " + tamanho + " numeros: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sc.nextInt();
        }
        System.out.println("Vetor carregado!");
        return vetor;
    }

    public static void listarVetor(int[] vetor) {
        System.out.print("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
        System.out.println();
    }

    public static void exibirPares(int[] vetor) {
        System.out.print("Pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(" " + vetor[i]);
            }
        }
        System.out.println();
    }

    public static void exibirImpares(int[] vetor) {
        System.out.print("Impares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(" " + vetor[i]);
            }
        }
        System.out.println();
    }

    public static int qtdParesEmPosicoesImpares(int[] vetor) {
        int contador = 0;
        for (int i = 1; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int qtdImparesEmPosicoesPares(int[] vetor) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void exibirMenu() {
        System.out.println("1 - Carregar vetor");
        System.out.println("2 - Listar vetor");
        System.out.println("3 - Exibir os pares");
        System.out.println("4 - Exibir os impares");
        System.out.println("5 - Qtd de pares nas posicoes impares");
        System.out.println("6 - Qtd de impares nas posicoes pares");
        System.out.println("7 - Sair");
        System.out.print("Opcao: ");
    }

    public static void main(String[] args) {
        int[] vetor = null;
        int opcao;

        do {
            exibirMenu();
            opcao = sc.nextInt();

            if (opcao >= 2 && opcao <= 6 && vetor == null) {
                System.out.println("Carregue o vetor primeiro (opcao 1)");
                continue;
            }

            switch (opcao) {
                case 1:
                    vetor = carregarVetor();
                    break;
                case 2:
                    listarVetor(vetor);
                    break;
                case 3:
                    exibirPares(vetor);
                    break;
                case 4:
                    exibirImpares(vetor);
                    break;
                case 5:
                    System.out.println("Pares em posicoes impares: " + qtdParesEmPosicoesImpares(vetor));
                    break;
                case 6:
                    System.out.println("Impares em posicoes pares: " + qtdImparesEmPosicoesPares(vetor));
                    break;
                case 7:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 7);

        sc.close();
    }
}
