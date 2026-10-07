package nivel2;

import java.util.Scanner;

public class Ex11TrocaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int a = sc.nextInt();
        System.out.print("Valor de B: ");
        int b = sc.nextInt();

        int aux = b;
        b = a;
        a = aux;
        System.out.println("Depois da troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        sc.close();
    }
}
