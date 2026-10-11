package nivel2;

import java.util.Scanner;

public class Ex18CodigoPorExtenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo: ");
        int codigo = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Codigo invalido");
        }

        sc.close();
    }
}
