package nivel5;

import java.util.Scanner;

public class Ex46ProdutoEscalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de elementos: ");
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("y[" + i + "]: ");
            y[i] = sc.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < n; i++) {
            produtoEscalar += x[i] * y[i];
        }
        System.out.println("PRODUTO ESCALAR = " + produtoEscalar);

        sc.close();
    }
}
