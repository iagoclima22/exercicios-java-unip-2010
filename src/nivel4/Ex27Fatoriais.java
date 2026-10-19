package nivel4;

import java.util.Scanner;

public class Ex27Fatoriais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros serao processados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int num = sc.nextInt();
            long fat = 1;
            for (int j = 1; j <= num; j++) {
                fat *= j;
            }
            System.out.println(num + "! = " + fat);
        }

        sc.close();
    }
}
