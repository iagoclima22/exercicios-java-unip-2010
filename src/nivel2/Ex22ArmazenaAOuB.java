package nivel2;

import java.util.Scanner;

public class Ex22ArmazenaAOuB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        if (n > 0) {
            a = n;
        } else {
            b = n;
        }
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        sc.close();
    }
}
