package nivel5;

import java.util.Scanner;

public class Ex57SomenteVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String vogais = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vogais += c;
            }
        }

        System.out.println("Vogais: " + vogais);

        sc.close();
    }
}