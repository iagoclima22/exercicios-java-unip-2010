package nivel2;

import java.util.Scanner;

public class Ex16MaiorEMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();

        int maior, menor;
        if (n1 > n2) {
            maior = n1;
            menor = n2;
            System.out.println("MAIOR = " + maior);
            System.out.println("MENOR = " + menor);
        } else if (n2 > n1) {
            maior = n2;
            menor = n1;
            System.out.println("MAIOR = " + maior);
            System.out.println("MENOR = " + menor);
        } else {
            System.out.println("Os dois numeros sao iguais");
        }

        sc.close();
    }
}
