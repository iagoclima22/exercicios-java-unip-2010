package nivel2;

import java.util.Scanner;

public class Ex19Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado A: ");
        int a = sc.nextInt();
        System.out.print("Lado B: ");
        int b = sc.nextInt();
        System.out.print("Lado C: ");
        int c = sc.nextInt();

        if (a >= c+b || b >= a+c || c >= a+b) {
            System.out.println("Os valores informados nao formam um triangulo");
        } else if (a == b && b == c) {
            System.out.println("Triangulo EQUILATERO");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triangulo ISOSCELES");
        } else {
            System.out.println("Triangulo ESCALENO");
        }

        sc.close();
    }
}
