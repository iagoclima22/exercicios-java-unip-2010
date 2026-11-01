package nivel4;

import java.util.Scanner;

public class Ex41CategoriaNadador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade do nadador: ");
        int idade = sc.nextInt();

        if (idade < 5) {
            System.out.println("Idade sem categoria");
        } else if (idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade <= 11) {
            System.out.println("Categoria: Infantil B");
        } else if (idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else {
            System.out.println("Categoria: Adulto");
        }

        sc.close();
    }
}
