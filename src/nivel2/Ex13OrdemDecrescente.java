package nivel2;

import java.util.Scanner;

public class Ex13OrdemDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        int n2 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        int n3 = sc.nextInt();

        int maior, meio, menor;
        if (n1 >= n2 && n2 >= n3) {
            maior = n1;
            meio = n2;
            menor = n3;
        } else if (n1 >= n3 && n3 >= n2) {
            maior = n1;
            meio = n3;
            menor = n2;
        } else if (n2 >= n1 && n1 >= n3) {
            maior = n2;
            meio = n1;
            menor = n3;
        } else if (n2 >= n3 && n3 >= n1) {
            maior = n2;
            meio = n3;
            menor = n1;
        } else if (n3 >= n1 && n1 >= n2) {
            maior = n3;
            meio = n1;
            menor = n2;
        } else {
            maior = n3;
            meio = n2;
            menor = n1;
        }

        System.out.printf("Ordem decrescente: %d %d %d%n", maior, meio, menor);

        sc.close();
    }
}