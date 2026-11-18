package nivel5;

import java.util.Scanner;

public class Ex59CaracteresEntre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 2 caracteres: ");
        char c1 = Character.toLowerCase(sc.next().charAt(0));
        char c2 = Character.toLowerCase(sc.next().charAt(0));

        if (c1 > c2) {
            System.out.println("ERRO: os caracteres nao estao em ordem alfabetica");
        } else {
            int quantidade = Math.max(0, c2 - c1 - 1);
            System.out.println("O numero de caracteres entre eles e: " + quantidade);
        }

        sc.close();
    }
}
